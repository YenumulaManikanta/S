package com.test.exe;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.student.info.Student;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/config/xml/AppCntx.xml"));
		Student std=(Student) factory.getBean("student", Student.class);
		System.out.println(std);
	}

}
