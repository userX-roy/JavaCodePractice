package com.linkedlist.basics;

public class SingleListInsertion implements ListInSertion{

	@Override
	public void firstNodeCreation(int data) {
		
		NodeClass newNode = new NodeClass(data);
		
		NodeClass.head = newNode;
		
		System.out.println("\nLinked List created\n");
	}
	
	
	@Override
	public void insertAtBeginning(int newData) {
		
		NodeClass nodeAtBeg = new NodeClass(newData);
		
		nodeAtBeg.nextAddr = NodeClass.head;
		
		NodeClass.head = nodeAtBeg;
	}
	
	
	@Override
	public void insertAtAnyPos(int newData,int indexCount) {
		
		//insertion will be at the specific index
		
		int loopCount = 1;
		
		NodeClass nodeAtAnyPosition = new NodeClass(newData);
		
		NodeClass temp = NodeClass.head;
		NodeClass temp2 = temp;
		
		
		while (temp!=null) {
			
			
			//if user input index 1 that means want to input as 1st node.
			if (indexCount==1) {
				insertAtBeginning(newData);
				return;
			} 
			
			//block execute when the loop counter comes to desired index position from 1st node
			else if(loopCount == indexCount) {
				temp2.nextAddr = nodeAtAnyPosition;
				nodeAtAnyPosition.nextAddr = temp;
				return;
			}
			
			/*
			 * 2 variable temp and temp2 taken ,
			 * initially temp and temp2 point 1st node 
			 * but after 1 loop execution temp pointer shift to next node but temp2 stay one node back
			 * 
			 * thus at a time index position fullfilled and New Node nextAddress put to temp2 nextAddress area
			 * and New Node's nextAddress variable contains temp pointer nextAddress.
			 *
			 */
			
			loopCount++;
			temp2 = temp;
			temp = temp.nextAddr;
		}
		
		//means loop has come to its end because user has input either last index that does not exist 
		if (temp==null) {
			insertAtEnding(newData);
			return;
		}
		
	}
	
	
	@Override
	public void insertAtEnding(int newData) {
		NodeClass nodeAtEnd = new NodeClass(newData);
		
		NodeClass temp1 = NodeClass.head;
		
		NodeClass temp2 = temp1;            
											
		while (temp1!=null) {
			temp2 = temp1;					
			temp1 = temp1.nextAddr;				
											
		
		}
		
		temp2.nextAddr = nodeAtEnd;
	}
}
