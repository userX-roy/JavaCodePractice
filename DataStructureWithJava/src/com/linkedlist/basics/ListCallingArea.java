package com.linkedlist.basics;

import java.util.Scanner;

public class ListCallingArea {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ParentListClass ll;
		
		System.out.println("Linked List Implementation (Basics) : ");
		
		System.out.println("\n->1.Singly \n->2.Circular \n->3.Doubly");
		int input = scanner.nextInt();
		
		switch (input) {
		
		case 1:
			ll = new SinglyLinkedListImplement();
			ll.insertion();
			ll.linkedListDeletion();
			ll.traverseLL();
			break;
			
		case 2:
			ll = new CircularLinkedListImplementation();
			ll.insertion();
			ll.linkedListDeletion();
			ll.traverseLL();
			break;
		
		case 3:
			ll = new DoublyLinkedListImplementation();
			ll.insertion();
			ll.linkedListDeletion();
			ll.traverseLL();
			break;

		default:
			System.out.println("Invalid Option");
			break;
		}
		
		
		
		scanner.close();
		
	}

}
