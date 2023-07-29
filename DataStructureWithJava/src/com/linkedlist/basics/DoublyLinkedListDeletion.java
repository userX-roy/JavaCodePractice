package com.linkedlist.basics;

public class DoublyLinkedListDeletion implements ListDeletion{

	@Override
	public void deleteStartNode() {
		
		if (NodeClass.head == null) {
			return;
		}
		
		if (NodeClass.head == NodeClass.tail) {
			NodeClass.head=NodeClass.tail=null;
			return;
		}
		
		NodeClass.head = (NodeClass.head).nextAddr;
		
		
		(NodeClass.head).prevAddr = null;
		
		
		return;
		
	}

	@Override
	public void deleteSpecificNode(int index) {
		
		if (NodeClass.head == null) {
			return;
		}
		
		int movementDecider = (DoublyLinkedListImplementation.elementCounter)/2;
		
		if (index == (DoublyLinkedListImplementation.elementCounter)) {
			deleteEndNode();
			return;
		}
		
		if (((DoublyLinkedListImplementation.elementCounter)+1)<=index) {
			System.out.println("Invalid index entered.");
			++(DoublyLinkedListImplementation.elementCounter);
			return;
		}
		
		if (index == 1) {
			deleteStartNode();;
			return;
		}
		
		if (index <= movementDecider) {
			
			NodeClass temp = NodeClass.head;
			
			int loopController=1;
			
			while (loopController!=index) {
				
				temp=temp.nextAddr;
				
				loopController++;
			}
			
			(temp.prevAddr).nextAddr = temp.nextAddr;
			(temp.nextAddr).prevAddr = temp.prevAddr;
			return;
			
		}
		
		
		if (index > movementDecider){
			
			NodeClass temp = NodeClass.tail;
			
			int loopController = DoublyLinkedListImplementation.elementCounter;
			
			while (index!=loopController) {
				
				temp = temp.prevAddr;
				loopController--;
				
			}
			
			(temp.prevAddr).nextAddr = temp.nextAddr;
			(temp.nextAddr).prevAddr = temp.prevAddr;
			
			return;
		}
		
	}

	@Override
	public void deleteEndNode() {
		
		if (NodeClass.head == null) {
			return;
		}
		
		if (NodeClass.head == NodeClass.tail) {
			NodeClass.head=NodeClass.tail=null;
			return;
		}
		
		
		NodeClass.tail = (NodeClass.tail).prevAddr;
		
		
		(NodeClass.tail).nextAddr = null;
		
		return;
	}

}
