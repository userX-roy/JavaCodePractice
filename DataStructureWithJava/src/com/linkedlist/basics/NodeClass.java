package com.linkedlist.basics;

public class NodeClass {
	
	int data = 0;
	
	NodeClass nextAddr = null;
	NodeClass prevAddr = null;
	
	static NodeClass head = null;
	static NodeClass tail = null;
	
	public NodeClass(int data) {
		this.data = data;
	}

}
