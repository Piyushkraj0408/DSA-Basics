import java.util.Scanner;
class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next=null;
    }
    
}
public class Sll {
    static Node head;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==-1) break;
            head = addnode(head,n); 
        }
        translate();
    }
    static Node addnode(Node head,int n){
        Node ptr = new Node(n);
        if(head==null) return ptr;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=ptr;
        return head;
    }
    static void translate(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    static void deleteNode(){
        
    }
}
