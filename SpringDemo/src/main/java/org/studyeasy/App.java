package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.Interfaces.Car;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = context.getBean("swift" , Car.class);
		System.out.println(car.specs());
		context.close();

	}

}
