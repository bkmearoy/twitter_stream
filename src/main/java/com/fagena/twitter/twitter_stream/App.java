package com.fagena.twitter.twitter_stream;

import com.fagena.twitter.Controller.*;
import com.fagena.twitter.Dao.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
	private static  String consumerKey = "46Dz3NbUZ4EnZnzmUjclSL7Ci";
	private static  String consumerSecret = "OpigqjT2hUruK9YDVfJah2UzYgbsi7kZfs88NUpNJJ9rbrY0ZZ";
	private static  String token = "805219579698040832-L6Jl2qpxsiooHrGmBxq3NAgVNHeXyr1";
	private static String secret = "fzZNZsv8jgYsEdHqTmTGtnEf8TU8XPMGhN9KRlemgxKjH";
	
    public static void main( String[] args ) throws InterruptedException
    {
    	   // ApplicationContext is a bean container 
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    //	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        TwitterController twitter=(TwitterController) context.getBean("twittercontroller_id");
        twitter.run(consumerKey, consumerSecret, token, secret);
        
        TwitterDao twitterDao = (TwitterDao) context.getBean("twitterdao_id");

        // inserting list of object to Db
     		//List <Table> tablelist=new ArrayList<Table>();
     		//tablelist.add(new Table(211, "asmara","ytre",4000,"Deverloper at fagena", "03-27-2018"));
     		//twitterDao.createInsert(tablelist);
     		
       // close classpathxmlapplicationcontext 
       ( (FileSystemXmlApplicationContext)context).close();
        
    }
}


