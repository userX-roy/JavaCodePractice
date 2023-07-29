package com.linkedlist.basics;

import java.util.Scanner;

public class SinglyLinkedListImplement implements ParentListClass{

	Scanner sc = new Scanner(System.in);
	
	public void insertion() {
		
		int doWhileLoopControler=1;
		
		System.out.println("Enter data : ");
		int data = sc.nextInt();
		
		ListInSertion li = new SingleListInsertion();
		
		li.firstNodeCreation(data);
		
		
		
		do {
				
				System.out.println("Enter the data you want to Insert ? : ");
				int newData = sc.nextInt();
			
				System.out.println("Where do you want to insert the element ? \n 1 -> beginning \n 2-> at specific position \n 3 -> at end");
				int insertionDecider =  sc.nextInt();
				
				switch (insertionDecider) {
				
				case 1:
					
					li.insertAtBeginning(newData);
					traverseLL();
					
					break;

				case 2:
					System.out.println("Enter the index count where you want to insert : ");
					int insertIndex = sc.nextInt();
					
					li.insertAtAnyPos(newData,insertIndex);
					traverseLL();
					
					break;
					
				case 3:
					li.insertAtEnding(newData);
					
					traverseLL();
					
					break;
					
				
				default:
					System.out.println("Invalid Option Choosen");
					traverseLL();
					break;
				}
		
				
				System.out.println("Do you want to insert more element ? \n 1->yes\n 2->No");
				
				doWhileLoopControler = sc.nextInt();
				
			} while (doWhileLoopControler==1);
		
		
		
	}
	
	
	public void linkedListDeletion() {
		
		ListDeletion ld = new SinglyLinkedListDeletion();
		
		
		
		if (NodeClass.head == null) {
			System.out.println("Nothing to Delete");
			return;
		}
		
		
		else {
			
			int loopCounter =1;
			
			do {
				System.out.println("Want to delete which position ? :\n1->Beginning\n2->at particular index\n3->ending node");
				int decideOfSwitch = sc.nextInt(); 
				
				
				switch (decideOfSwitch) {
				
				case 1:
					ld.deleteStartNode();
					traverseLL();
					break;

				case 2:
					System.out.println("Enter the Specific Index : ");
					int index = sc.nextInt();
					ld.deleteSpecificNode(index);
					traverseLL();
					break;
				
				case 3:
					ld.deleteEndNode();
					traverseLL();
					break;
				
				default:
					System.out.println("\nInvalid Option Choosen\n");
					traverseLL();
					break;
				}
				
				System.out.println("Do you want to delte more ? \n 1->yes\n 2->No");
				loopCounter = sc.nextInt();
				
			} while (loopCounter == 1);
		}
		
		
	}
	
	public void traverseLL() {
		NodeClass temp = NodeClass.head;

		if (temp==null) {
			System.out.println("Linked List Empty");
			System.exit(1);
		}
		System.out.println();
		
		while (temp != null) {
			System.out.print(" -> "+temp.data);
			temp = temp.nextAddr;
		}
		
		System.out.println();
	}


}
