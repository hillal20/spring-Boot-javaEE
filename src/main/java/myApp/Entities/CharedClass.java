package myApp.Entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CharedClass implements Serializable {
     
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO )
	 private Long id;
	 
	 
	private String name;
	private String color;
	
	////////////////////////////////////////// setters and getters 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
