package com.fagena.twitter.Controller;
import com.fagena.twitter.Model.Twitter;
import com.fagena.twitter.Dao.Table;
import com.google.gson.Gson;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.endpoint.StatusesSampleEndpoint;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.BasicClient;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

//log4j 
import org.apache.log4j.Logger;



public class TwitterController {
	
	final static Logger logger = Logger.getLogger(TwitterController.class);
	
	public static List<Table> tablelist = new ArrayList<Table>();
		 
	public static void run(String consumerKey, String consumerSecret,
				String token, String secret) throws InterruptedException {
		     // Create an appropriately sized blocking queue
				BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10000);

				// Define our end-point: By default, delimited=length is set (we need
				// this for our processor)
				// and stall warnings are on.
				StatusesSampleEndpoint endpoint = new StatusesSampleEndpoint();
				endpoint.stallWarnings(false);

				Authentication auth = new OAuth1(consumerKey, consumerSecret, token, secret);
			
				// Create a new BasicClient. By default gzip is enabled.
				BasicClient client = new ClientBuilder().name("sampleExampleClient")
						.hosts(Constants.STREAM_HOST).endpoint(endpoint)
						.authentication(auth)
						.processor(new StringDelimitedProcessor(queue)).build();

				// Establish a connection with client 
				client.connect();
				logger.info("Connection established with client");
                //
				// Do whatever needs to be done with messages
				for (int msgRead = 0; msgRead < 25; msgRead++) {
					if (client.isDone()) {
						logger.error("Client Connection closed unexpectedly");
						System.out.println("Client connection closed unexpectedly: "
								+ client.getExitEvent().getMessage());
						break;
					}

					String msg = queue.poll(5, TimeUnit.SECONDS);
					if (msg == null) {
						logger.info("no message receive in 5 Seconds");
						System.out.println("Did not receive a message in 5 seconds");
					} else {
						System.out.println(msg);
						Gson gson = new Gson();
						Twitter tw = gson.fromJson(msg, Twitter.class);
					
                         //
						if (tw.getUser() != null) {
							System.out.println("tw " + tw.getCreatedAt());
							System.out.println("tw " + tw.getId());
							System.out.println("tw " + tw.getText());
							System.out.println("tw " + tw.getUser().getFriendsCount());
							System.out.println("tw " + tw.getUser().getName());
							System.out.println("tw " + tw.getUser().getScreenName());
							logger.info("new message");
							System.out.println();
					     	System.out.println("********New Message**********");
							//store data in ArrayList
							tablelist.add(new Table (tw.getId(),tw.getUser().getName(),tw.getUser().getScreenName(),
									tw.getUser().getFriendsCount(),tw.getText(),tw.getCreatedAt()));

						}
				}
			}
            //stop(close) connection with client  
			client.stop();
			logger.info("connection closed with client");

			// Print some status 
			System.out.printf("The client read %d messages!\n", client
					.getStatsTracker().getNumMessages());
		}
	//get 
	public List<Table> getTable (){
		
		return tablelist;
	}
}
