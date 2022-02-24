package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Vampire {
	//properties
	private int age;
	private String name;
	private boolean nocturnal;
	private boolean evil;
	
	@Autowired
	private Fangs fangs;
	
	public Fangs getFangs() {
		return fangs;
	}

	@Autowired
	public void setFangs(Fangs fangs) {
		this.fangs = fangs;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isNocturnal() {
		return nocturnal;
	}


	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}


	public boolean isEvil() {
		return evil;
	}


	public void setEvil(boolean evil) {
		this.evil = evil;
	}


	public Vampire() {
		//constructor
	}
	
	public void fangsinfo() {
		fangs.display();
	}
	
}
