package Lesson17.serializationofArray;

import java.io.Serializable;

/*
 * Object to binary conversion is serialization
 * and opposite is de-serialization
 * 
 * To make the class serializable it needs to implement
 * Serializable interface
 */
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8337833382640211090L;
	/**
	 * 
	 */
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	
}
