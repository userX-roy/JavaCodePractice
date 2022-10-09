package com.collection;


public class CommonClass {
	private int id;
	private String name;
	
	public CommonClass(int id, String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "ClassA [id=" + id + ", name=" + name + "]";
	}
	
}