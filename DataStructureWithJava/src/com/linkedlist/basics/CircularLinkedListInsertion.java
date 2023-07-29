package com.linkedlist.basics;

public class CircularLinkedListInsertion implements ListInSertion {


	@Override
	public void firstNodeCreation(int data) {
		NodeClass cNode = new NodeClass(data);
		
		cNode.nextAddr = cNode;
		
		NodeClass.head = NodeClass.tail = cNode;
		
		System.out.println("\nCirular LinkedList Created ....\n");
		
	}

	@Override
	public void insertAtBeginning(int newData) {

		NodeClass cNode = new NodeClass(newData);
		
		NodeClass.tail.nextAddr = cNode;
		
		cNode.nextAddr = NodeClass.head;
		
		NodeClass.head = cNode;
		
	}

	@Override
	public void insertAtAnyPos(int newData, int indexCount) {
		
		NodeClass temp = NodeClass.head;
		
		NodeClass temp2 = temp.nextAddr;
		
		int loopController = 2;
		
		if (indexCount==1) {
			insertAtBeginning(newData);
			return;
		}
		
		while (temp2!=NodeClass.head) {
			
			
			if (loopController==indexCount) {
				NodeClass cNode = new NodeClass(newData);
				cNode.nextAddr = temp2;
				temp.nextAddr = cNode;
				return;
			}
			
			loopController++;
			temp = temp2;
			temp2 = temp2.nextAddr;
			
			
		}
		
		if (loopController==indexCount) {
			insertAtEnding(newData);
			return;
		}
		
		if (loopController!=indexCount) {
			System.out.println("Invalid indx provided");
			return;
		}
		
	}

	@Override
	public void insertAtEnding(int newData) {
		
		NodeClass cNode = new NodeClass(newData);
		
		cNode.nextAddr = NodeClass.head;
		
		NodeClass.tail.nextAddr = cNode;
		
		NodeClass.tail = cNode;
		
		
	}
	
}
