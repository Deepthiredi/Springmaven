package com.testyanthra.Set_type;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmploye 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/testyanthra/Set_type/config.xml");
		
		Employe emp=(Employe) context.getBean("employe");
		System.out.println(emp);
	}

}
