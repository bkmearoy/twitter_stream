package com.fagena.twitter.twitter_stream;

import com.fagena.twitter.Controller.*;
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
       // System.out.println(twitter);
   // clos ur classpathxmlapplicationcontext 
       ( (FileSystemXmlApplicationContext)context).close();
        
    }
}


