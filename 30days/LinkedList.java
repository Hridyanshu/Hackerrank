import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null)
        {
            //inserting first element
            //list is empty
            //creating a new node with head as its reference.
            head = new Node(data);
        }
        else
        {
            //traversing till the last node
            Node last = head;
            while(last.next != null)
            {
                //reaching till the last node
                last = last.next;
            }
            //making a new node with the previous last node as its reference.
            last.next = new Node(data);
        }
        //preserving the head value so returning head.
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
