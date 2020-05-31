import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	static void levelOrder(Node root){
      //Write your code here
      //traversed stores the elements in the order they are traversed.
      Queue<Node> traversed = new LinkedList<Node>();
      traversed.add(root);
      Node temp;
      while(traversed.size()!=0){
          temp = traversed.remove();
          System.out.print(temp.data + " ");
          if(temp.left!=null)
            traversed.add(temp.left);
          if(temp.right!=null)
            traversed.add(temp.right);
      }
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
