package com.springcore1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //here is create you class Bean name employeeA 
       ApplicationContext context = new ClassPathXmlApplicationContext("employeea.xml");
       EmployeeA employees=(EmployeeA)context.getBean("employee");
       System.out.println(employees);
    }
}
