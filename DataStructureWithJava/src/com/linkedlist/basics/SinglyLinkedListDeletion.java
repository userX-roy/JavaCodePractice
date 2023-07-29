package com.linkedlist.basics;

public class SinglyLinkedListDeletion implements ListDeletion{
	
	SinglyLinkedListImplement sll = new SinglyLinkedListImplement();
	
	@Override
	public void deleteStartNode() {
		NodeClass temp = NodeClass.head;
		
		temp = temp.nextAddr;
		
		NodeClass.head =temp;
		sll.traverseLL();
	}
	
	@Override
	public void deleteSpecificNode(int index) {
		
		int loopConter = 1;
		NodeClass temp = NodeClass.head;
		NodeClass temp2 = temp;
		
		while (temp!=null) {
			
			if (index==1) {
				deleteStartNode();
				sll.traverseLL();
				return;
			}
			
			else if (loopConter==index) {
				temp2.nextAddr=temp.nextAddr;
				sll.traverseLL();
				return;
			}
			loopConter++;
			temp2 = temp;
			temp = temp.nextAddr;
		}
		
		if(temp==null && (loopConter==index)) {
			deleteEndNode();
			sll.traverseLL();
			return;
		}
		else {
			System.out.println("Enter a valid Index");
			sll.traverseLL();
			return;
		}
	}
	
	@Override
	public void deleteEndNode() {
		
		NodeClass temp = NodeClass.head;
		NodeClass temp2 = temp;
		
		while (temp != null) {
			
			if(temp.nextAddr!=null) {
				temp2 = temp;
			}
			temp = temp.nextAddr;
			
		}
		
		temp2.nextAddr=null;
		sll.traverseLL();
	}

}
