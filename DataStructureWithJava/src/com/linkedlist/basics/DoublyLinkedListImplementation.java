package com.linkedlist.basics;

import java.util.Scanner;

public class DoublyLinkedListImplementation implements ParentListClass{

	static int elementCounter = 1;
	
	Scanner scanner = new Scanner(System.in);
	
	ListInSertion li = new DoublyLinkedListInsertion();
	
	ListDeletion ld = new DoublyLinkedListDeletion();
	
	@Override
	public void insertion() {
		System.out.println("Enter Data : ");
		int element =scanner.nextInt();
		
		int doWhileLoopController = 1;
		
		li.firstNodeCreation(element);
		
		System.out.println("\nCircular Linked List Created\n");
		
		
		do {
			System.out.println("\nChoose where to insert\n 1->Beginning\n 2->Specific Index\n 3->End\n");
			int choose = scanner.nextInt();
			int index;
			
			System.out.println("Enter Element you want to Insert : ");
			element = scanner.nextInt();
			
			switch (choose) {
			
			case 1:
				li.insertAtBeginning(element);
				++elementCounter;
				traverseLL();
				
				break;
				
			case 2:
				System.out.println("Which index position you want to insert ? (1st Elemet's index 1)");
				index = scanner.nextInt();
				
				li.insertAtAnyPos(element, index);
				++elementCounter;
				traverseLL();
				
				break;
			
			case 3:
				li.insertAtEnding(element);
				++elementCounter;
				traverseLL();
				
				break;

			default:
				System.out.println("An Invalid Option");
				break;
			}
			
			System.out.println("\nDo you want to insert Again ? \n 1-> yes\n 2->No\n");
			doWhileLoopController = scanner.nextInt();
			
		} while(doWhileLoopController==1);
		
	}

	@Override
	public void traverseLL() {
		
		if (NodeClass.head == null) {
			System.out.println("Doubly-LL is empty");
			System.exit(1);
		}
		
		NodeClass temp = NodeClass.head;
		
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.nextAddr;
			
			//Not important , just for maintaining the arrow count while printing
			if (temp==null) {
				continue;
			}
			else {
				System.out.print("->");
			}
			
			
		}
		

	}

	@Override
	public void linkedListDeletion() {
		int doWhileLoopController =1;
		
		do {
			System.out.println("\nChoose where to delete\n 1->Beginning\n 2->Specific Index\n 3->End\n");
			int choose = scanner.nextInt();
			
			switch (choose) {
			
			case 1:
				ld.deleteStartNode();
				--elementCounter;
				traverseLL();
				
				break;
				
			case 2:
				System.out.println("Which index position you want to insert ? (1st Elemet's index 1)");
				choose = scanner.nextInt();
				
				ld.deleteSpecificNode(choose);
				--elementCounter;
				traverseLL();
				
				break;
			
			case 3:
				ld.deleteEndNode();
				--elementCounter;
				traverseLL();
				
				break;

			default:
				System.out.println("An Invalid Option");
				break;
			}
			
			System.out.println("\nDo you want to delete Again ? \n 1-> yes\n 2->No\n");
			doWhileLoopController = scanner.nextInt();
			
		} while(doWhileLoopController==1);
		
	}

}
