package com.linkedlist.basics;

public class DoublyLinkedListInsertion implements ListInSertion{

	@Override
	public void firstNodeCreation(int data) {
		
		NodeClass dClass = new NodeClass(data);
		
		NodeClass.head = NodeClass.tail = dClass;
		return;
	}

	@Override
	public void insertAtBeginning(int newData) {
		NodeClass dNode = new NodeClass(newData);
		
		NodeClass.head.prevAddr = dNode;
		dNode.nextAddr = NodeClass.head;
		NodeClass.head = dNode;
		return;
		
	}

	@Override
	public void insertAtAnyPos(int newData, int indexCount) {
		
		int movementDecider = (DoublyLinkedListImplementation.elementCounter)/2;
	
		
		
		if (indexCount == (DoublyLinkedListImplementation.elementCounter)+1) {
			insertAtEnding(newData);
			return;
		}
		
		if (((DoublyLinkedListImplementation.elementCounter)+2)<=indexCount) {
			System.out.println("Invalid index entered.");
			--(DoublyLinkedListImplementation.elementCounter);
			return;
		}
		
		if (indexCount == 1) {
			insertAtBeginning(newData);
			return;
		}
		
		if (indexCount <= movementDecider) {
			
			NodeClass nClass = new NodeClass(newData);
			
			NodeClass temp = NodeClass.head;
			
			int loopController=1;
			
			while (loopController!=indexCount) {
				
				temp=temp.nextAddr;
				
				loopController++;
			}
			
			nClass.prevAddr = temp.prevAddr;
			nClass.nextAddr = temp;
			(temp.prevAddr).nextAddr = nClass;
			temp.prevAddr = nClass;
			return;
			
		}
		
		if (indexCount > movementDecider){
			
			
			NodeClass nClass = new NodeClass(newData);
			
			NodeClass temp = NodeClass.tail;
			
			int loopController = DoublyLinkedListImplementation.elementCounter;
			
			while (indexCount!=loopController) {
				
				temp = temp.prevAddr;
				loopController--;
				
			}
			
			nClass.prevAddr = temp.prevAddr;
			nClass.nextAddr = temp;
			(temp.prevAddr).nextAddr = nClass;
			temp.prevAddr = nClass;
			return;
			

		}
	}

	@Override
	public void insertAtEnding(int newData) {
		NodeClass dNode = new NodeClass(newData);
		
		dNode.prevAddr = NodeClass.tail;
		
		NodeClass.tail.nextAddr = dNode;
		
		NodeClass.tail = dNode;
		
	}

}
