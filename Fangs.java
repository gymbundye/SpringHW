package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Fangs {
	//props
	
	
	private Boolean sharp= true;
	private Boolean bloody= true;
	private Boolean clean =false;
	
	
	
	public Boolean getSharp() {
		return sharp;
	}



	public void setSharp(Boolean sharp) {
		this.sharp = sharp;
	}



	public Boolean getBloody() {
		return bloody;
	}



	public void setBloody(Boolean bloody) {
		this.bloody = bloody;
	}



	public Boolean getClean() {
		return clean;
	}



	public void setClean(Boolean clean) {
		this.clean = clean;
	}



	public Fangs(){
		
		//constructor
	}
	
	public void display(){
		System.out.println("Hisss");
	}
	
	
}
