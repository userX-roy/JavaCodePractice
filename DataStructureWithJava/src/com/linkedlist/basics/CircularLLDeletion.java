package com.linkedlist.basics;

public class CircularLLDeletion implements ListDeletion{

	ParentListClass pla = new CircularLinkedListImplementation();
	
	@Override
	public void deleteStartNode() {
		
		
		if (NodeClass.head == null) {
			pla.traverseLL();
		}
		
		
		if (NodeClass.head == NodeClass.tail) {
			NodeClass.head = NodeClass.tail = null;
			pla.traverseLL();
			return;
		}
		
		NodeClass.tail.nextAddr = NodeClass.head.nextAddr;
		NodeClass.head = NodeClass.head.nextAddr;
		pla.traverseLL();
		return;
		
	}

	@Override
	public void deleteSpecificNode(int index) {
		
		
		if (NodeClass.head==null) {
			pla.traverseLL();
		}
		
		if (NodeClass.head == NodeClass.tail) {
			NodeClass.head = NodeClass.tail = null;
			pla.traverseLL();
			return;
		}
		
		if(index==1) {
			deleteStartNode();
			return;
		}
		
		int loopController=2;
		
		NodeClass temp = NodeClass.head;
		
		NodeClass temp2 = temp.nextAddr;
		
		while (temp2.nextAddr != NodeClass.head) {
			
			if (loopController==index) {
				temp.nextAddr = temp2.nextAddr;
				pla.traverseLL();
				return;
			}
			
			temp = temp2;
			temp2 = temp2.nextAddr;
			loopController++;
		}
		
		if (loopController==index) {
			deleteEndNode();
			return;
		}
		
		if (loopController<index) {
			System.out.println("Invalid Index");
			pla.traverseLL();
			return;
		}
		
	}

	@Override
	public void deleteEndNode() {
		
		
		if (NodeClass.head==null) {
			pla.traverseLL();
			return;
		}
		
		NodeClass temp = NodeClass.head;
		NodeClass temp2 = NodeClass.head.nextAddr;
		
		while (temp2.nextAddr != NodeClass.head) {
			temp = temp2;
			temp2=temp2.nextAddr;
			
		}
		
		if (NodeClass.head == NodeClass.tail) {
			NodeClass.head = NodeClass.tail = null;
			pla.traverseLL();
			return;
		}
		
			NodeClass.tail = temp;
			temp.nextAddr = NodeClass.head;
			pla.traverseLL();
			return;
		
	}
}
