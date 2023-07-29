package com.linkedlist.basics;

import java.util.Scanner;

public class CircularLinkedListImplementation implements ParentListClass{
	
	Scanner scanner = new Scanner(System.in);
	ListInSertion li;
	ListDeletion ld;
	
	@Override
	public void insertion() {
		
		int whileLoopController=2;
		
		li = new CircularLinkedListInsertion();
		
		System.out.println("Enter your Data want to insert ");
		int element = scanner.nextInt();
		
		li.firstNodeCreation(element);
		
		do {
			
			System.out.println("\nChoose from following : \n 1->At First Node \n 2->At any specific index from head \n 3->at end");
			int decider = scanner.nextInt();
			
			System.out.println("Enter your Data want to insert ");
			element = scanner.nextInt();
			
			switch (decider) {
			
			case 1:
				li.insertAtBeginning(element);
				traverseLL();
				break;
			
			case 2:
				System.out.println("Enter the index position : ");
				int indexPos = scanner.nextInt();
				li.insertAtAnyPos(element, indexPos);
				traverseLL();
				break;

			case 3:
				li.insertAtEnding(element);
				traverseLL();
				break;
			
			default:
				System.out.println("An Invalid Option");
				traverseLL();
				break;
			}
			
			
			System.out.println("Do you want to continue ? \n 1->yes\n 2->no");
			whileLoopController = scanner.nextInt();
			
		} while (whileLoopController==1);
		
	}
	
	
	@Override
	public void linkedListDeletion() {
		int whileLoopController=2;
		
		ld = new CircularLLDeletion();
		
		do {
			
			System.out.println("\nChoose from following : \n 1->At First Node \n 2->At any specific index from head \n 3->at end");
			int decider = scanner.nextInt();
			
			
			switch (decider) {
			
			case 1:
				ld.deleteStartNode();
				break;
			
			case 2:
				System.out.println("Enter the index position : ");
				int indexPos = scanner.nextInt();
				ld.deleteSpecificNode(indexPos);
				break;

			case 3:
				ld.deleteEndNode();
				break;
			
			default:
				System.out.println("An Invalid Option");
				break;
			}
			
			
			System.out.println("Do you want to continue ? \n 1->yes\n 2->no");
			whileLoopController = scanner.nextInt();
			
		} while (whileLoopController==1);
	}
	
	@Override
	public void traverseLL() {
		
			if (NodeClass.head==null) {
				System.out.println("Linked List Empty");
				System.exit(1);
			}
			
			NodeClass temp2 = NodeClass.head.nextAddr;
			
			
			System.out.println();
			
			System.out.print(NodeClass.head.data);
			
			while (temp2!=NodeClass.head) {
				System.out.print(" -> "+temp2.data);
				temp2 = temp2.nextAddr;
			}
			

			
			System.out.println();
	}
	
	public static void accessingLastElementUsingTail() {
		System.out.println("Last Element using Tail : "+NodeClass.tail.data);
		System.out.println("1st Element using Tail : "+(NodeClass.tail.nextAddr).data);
	}

}
