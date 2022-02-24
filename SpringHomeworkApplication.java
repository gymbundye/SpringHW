package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringHomeworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringHomeworkApplication.class, args);
		
		Vampire v1= context.getBean(Vampire.class);
		Werewolf w1= context.getBean(Werewolf.class);
		Fangs fang = context.getBean(Fangs.class);
		
		fang.getBloody();
		fang.getSharp();
		fang.getClean();
		
		v1.getFangs().display();
		v1.setFangs(fang);
		
		w1.getFangs().display();
		w1.setFangs(fang);
	}

}
