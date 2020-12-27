package com.fatema.First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    
    	//Vehicle obj=(Vehicle)context.getBean("vehicle");
    	//Changes done for annotation
    	
    	Car obj=(Car)context.getBean("car");
    	obj.drive();
    
    	Bike objBike=(Bike)context.getBean("bike");
    	objBike.drive();
    	
    	/*Tyre t=(Tyre) context.getBean("tyre");
    	System.out.println(t);*/
    }
}
