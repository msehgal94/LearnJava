package com.learn.inheritance;

public class ParentClass {
	
	int integerVar = 1;
	String stringVar = "stringVar";
	Boolean booleanVar = true;
	float floatVar = 12.34f;
	
	public ParentClass() {
		//default constructor
	}
	
	public ParentClass(int integerVar, String stringVar, Boolean booleanVar, float floatVar) {  	//Parameterized Constructor
		//super();
		this.integerVar = integerVar;		
		this.stringVar = stringVar;
		this.booleanVar = booleanVar;
		this.floatVar = floatVar;
	}
	
	//getters and setters

	public int getIntegerVar() {
		return integerVar;
	}

	public void setIntegerVar(int integerVar) {
		this.integerVar = integerVar;
	}

	public String getStringVar() {
		return stringVar;
	}

	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}

	public Boolean getBooleanVar() {
		return booleanVar;
	}

	public void setBooleanVar(Boolean booleanVar) {
		this.booleanVar = booleanVar;
	}

	public float getFloatVar() {
		return floatVar;
	}

	public void setFloatVar(float floatVar) {
		this.floatVar = floatVar;
	}

	public static void main(String[] args) {
		
		ParentClass parentObj = new ParentClass();
		parentObj.setIntegerVar(3);
		System.out.println(parentObj.getIntegerVar());
		System.out.println(parentObj.stringVar);
		System.out.println(parentObj.booleanVar);
		System.out.println(parentObj.floatVar);
		
		
	}

}
