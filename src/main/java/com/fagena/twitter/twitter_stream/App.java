package com.fagena.twitter.twitter_stream;

import com.fagena.twitter.Controller.*;
import com.fagena.twitter.Dao.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
	private static  String consumerKey = "46Dz3NbUZ4EnZnzmUjclSL7Ci";
	private static  String consumerSecret = "OpigqjT2hUruK9YDVfJah2UzYgbsi7kZfs88NUpNJJ9rbrY0ZZ";
	private static  String token = "805219579698040832-L6Jl2qpxsiooHrGmBxq3NAgVNHeXyr1";
	private static  String secret = "fzZNZsv8jgYsEdHqTmTGtnEf8TU8XPMGhN9KRlemgxKjH";
	
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


