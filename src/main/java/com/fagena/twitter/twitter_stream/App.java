package com.fagena.twitter.twitter_stream;

//import com.fagena.spring.jdbc.connect.Mav_Spring_Jdbc.Offer;
import com.fagena.twitter.Controller.*;
import com.fagena.twitter.Dao.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 *main procedures 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	   // ApplicationContext is a bean container 
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    //	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        TwitterController twitter=(TwitterController) context.getBean("twittercontroller_id");
        twitter.start();
        
        TwitterDao twitterDao = (TwitterDao) context.getBean("twitterdao_id");
        
     // this is now for inserting list of object 
     		List <Table> tablelist=new ArrayList<Table>();
     		//tablelist.add(new Table());
     		
     		//tablelist.add(new Table(211, "asmara","asmara@yahoo.com","Deverloper at fagena"));
     		//tablelist.add(new Table(212, "aseb","aseb@yahoo.com","Manager at fagena"));
     		
     	//	(name, screenName, friendsCount, text, createdAt, id)
     		
     		twitterDao.createInsert(tablelist);
     		
     		int id;
     		String name;
     		String screenName;
     		int friends;
     		String message;
     		String date;
       // System.out.println(twitter);
   // clos ur classpathxmlapplicationcontext 
       ( (FileSystemXmlApplicationContext)context).close();
        
    }
}


