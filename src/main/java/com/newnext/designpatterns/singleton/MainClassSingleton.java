package com.newnext.designpatterns.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Singleton in Spring doesn't mean one instance per class. Spring allow us to create instances more than one.
 *
 */
public class MainClassSingleton {
	public static void main(String[] args) {
		try(var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
			var c1 = c.getBean("newController",NewController.class);
			var c2 = c.getBean("newController1",NewController.class);
			var c3 = c.getBean("singletonOne",InterfaceSingleton.class);
			var c4 = c.getBean("singletonTwo", InterfaceSingleton.class);
//			var c3 = c.getBean(NewController.class);
			System.out.println(c1 + "\n" + c2);
			System.out.println(c3 + "\n" + c4);
			
			
		}
	}

}
