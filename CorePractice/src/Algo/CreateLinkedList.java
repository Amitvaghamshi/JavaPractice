package Algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreateLinkedList {
	
	private void sysout() {
		// TODO Auto-generated method stub

	}

	public static Node generateLinkedList(int[] arr) {
		 Node head=new Node(-1, 0);
		 Node curr=head;
		 
		 int count=1;
		 for(int i=0;i<arr.length-1;i++) {
			 
			 if(arr[i]==arr[i+1]) {
				   count++;
			 }else {
				   curr.next=new Node(arr[i], count);
		    	   curr=curr.next;
		    	   count=1;
			 }
		 }
		 curr.next=new Node(arr[arr.length-1], count);
		 return head.next;
	}
	
	public static void main(String[] args) {
		
		int x=5*6;
		 
		 int[] arr= {1,1,1,2,2,2,3,3,5,5,5,5,8,8,8,8,8};
		
		 Node head=generateLinkedList(arr);
		 while(head!=null) {
			  System.out.println(head.data+" "+head.count);
			  head=head.next;
		 }
		 
		
	}
}


class Node{
	  int data;
	  int count;
	  Node next;
	  
	  
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	Node (int data,int count){
		this.data=data;
		this.count=count;
	}
	  
	  
}