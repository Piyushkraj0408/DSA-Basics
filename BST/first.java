//create,insert and travrse


package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Node{
    int val;
    Node left,right;
    Node(int key){
        this.val = key;
    }
}
/**
 * first
 */
public class first {

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 6);
        root = insert(root, 8);
        root = insert(root, 1);
        root = insert(root, 9);

        System.out.println("delting element...");
        root = delete(root, 6);
        root = delete(root, 0);
        System.out.println("fininsh delete");

        System.out.println("---------------------Inorder-----------------------------");
        inorder(root);
        System.out.println("---------------------preorder-----------------------------");
        preorder(root);
        System.out.println("---------------------postorder-----------------------------");
        postorder(root);
        System.out.println("---------------------levelorder-----------------------------");
        levelorder(root);
    }

    static Node insert(Node root,int x){
        if(root==null){
            System.out.println("successfully created");
            return root=new Node(x);
        }

        if(x>root.val){
            root.right =  insert(root.right,x);
        }else if(x<root.val){
            root.left =  insert(root.left,x);
        }else{
            System.out.println("Already exist");
        }
        return root;
    }

    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.val+" ");
            inorder(root.right);
        }
    }

    static void preorder(Node root){
        if(root!=null){
            System.out.print(root.val+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(Node root){
        if(root!=null){
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.val+" ");
        }
    }

    static void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        List<List<Node>> ans = new ArrayList<>();

        q.offer(root);
        while(q.isEmpty()){
            int size = q.size();
            List<Node> temp  = new ArrayList<>();

            for(int i=0;i<size;i++){
                Node tempo  =q.poll();
                temp.add(tempo);

                if(root.left!=null){
                    q.add(root.left);
                }
                if(root.right!=null){
                    q.add(root.right);
                }
            }
            ans.add(temp);
        }
        for(List<Node> tempi:ans){
            for(Node ag:tempi){
                System.out.print(ag.val+" ");
            }
        }
    }
    static int findmin(Node root){
        Node temp = root;
        while(temp!=null){
            temp = temp.left;
        }
        return temp.val;
    }
    static Node delete(Node root,int x){
        if(root==null){
            System.out.println("Not found");
            return null;
        }

        if(x>root.val){
            root.right =  delete(root.right, x);
        }else if(x<root.val){
            root.left = delete(root.left, x);
        }else{
            if(root.left==null && root.right==null){
                root= null;
                return null;
            }

            if(root.left!=null && root.right==null){
                Node temp = root.left;
                root = null;
                return temp;
            }


            if(root.left==null && root.right!=null){
                Node temp = root.right;
                root=null;
                return temp;
            }

            if(root.left!=null && root.right!=null){
                int mini = findmin(root.right);
                root.val = mini;
                root.left = delete(root.right, mini);
            }
        }
        return root;
    }
}