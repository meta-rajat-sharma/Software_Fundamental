package com.metacube.dsa1;

import static org.junit.Assert.*;
import org.junit.Test;

public class Question1Test {

	@Test
	public void testSubLinklist() {
		Node head = null;
		head = Question1.createLinklist(head, 2);
		head = Question1.createLinklist(head, 3);
		head = Question1.createLinklist(head, 4);
		head = Question1.createLinklist(head, 5);
		head = Question1.createLinklist(head, 6);
		head = Question1.createLinklist(head, 7);
		
		Node head2 = null;
		head2 = Question1.createLinklist(head2, 2);
		head2 = Question1.createLinklist(head2, 5);
		head2 = Question1.createLinklist(head2, 6);
		head2 = Question1.createLinklist(head2, 3);
		head2 = Question1.createLinklist(head2, 4);
		head2 = Question1.createLinklist(head2, 7);
		
		int l=2,r=5,n=2;
		
		Node actualSublist = Question1.subLinklist(head, l, r, n);
		Node expectedSublist = head2;
		while( expectedSublist != null ) {
			assertEquals(expectedSublist.data,actualSublist.data);
			expectedSublist = expectedSublist.next;
			actualSublist = actualSublist.next;
		}
	}
	
	@Test
	public void testSubLinklist2() {
		Node head = null;
		head = Question1.createLinklist(head, 1);
		head = Question1.createLinklist(head, 2);
		head = Question1.createLinklist(head, 3);
		head = Question1.createLinklist(head, 4);
		head = Question1.createLinklist(head, 5);
		head = Question1.createLinklist(head, 6);
		head = Question1.createLinklist(head, 7);
		
		Node head2 = null;
		head2 = Question1.createLinklist(head2, 3);
		head2 = Question1.createLinklist(head2, 4);
		head2 = Question1.createLinklist(head2, 5);
		head2 = Question1.createLinklist(head2, 1);
		head2 = Question1.createLinklist(head2, 2);
		head2 = Question1.createLinklist(head2, 6);
		head2 = Question1.createLinklist(head2, 7);
		
		int l=1,r=5,n=3;
		
		Node actualSublist = Question1.subLinklist(head, l, r, n);
		Node expectedSublist = head2;
		while( expectedSublist != null ) {
			assertEquals(expectedSublist.data,actualSublist.data);
			expectedSublist = expectedSublist.next;
			actualSublist = actualSublist.next;
		}
	}

}
