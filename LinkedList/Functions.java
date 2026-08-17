package LinkedList;
import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val =val;
        this.next=null;
    }
}
public class Functions {
    static Node head;
    static Node createnode(int val){
        Node temp = new Node(val);
        return temp;
    }
public static void main(String[] args) {
    head = createnode(5);
    System.out.println(head.val);
}
    
}