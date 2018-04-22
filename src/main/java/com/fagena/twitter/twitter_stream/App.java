package com.fagena.twitter.twitter_stream;

import com.fagena.twitter.Controller.*;
import com.fagena.twitter.Dao.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
	private static  String consumerKey = "------------------------";
	private static  String consumerSecret = "-----------------------------";
	private static  String token = "----------------------------------------";
	private static  String secret = "-----------------------------------------";
	
    public static void main( String[] args ) throws InterruptedException
    {
    	// ApplicationContext is a bean container 
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");   
        TwitterController twitter=(TwitterController) context.getBean("twittercontroller_id");
        //get Data from client (twitter)
        twitter.run(consumerKey, consumerSecret, token, secret);
       
        TwitterDao twitterDao = (TwitterDao) context.getBean("twitterdao_id");
        //// Insert twitter real-time Data to DB: Batch update: 
        twitterDao.createInsert(twitter.getTable());
     		
       // close classpathxmlapplicationcontext 
       ( (FileSystemXmlApplicationContext)context).close();
        
    }
}


