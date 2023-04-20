package model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BST {
    private Node root;

    public BST(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }

    public ArrayList<String> sort(ArrayList<String> alist){
        Collections.sort(alist);
        return alist;
    }
    public Node maketree(ArrayList<String> alist, int counter, int lengtth){
        if (counter > lengtth) {
            return null;
        }
        int mid = (counter + lengtth) / 2;
        Node root = new Node(alist.get(mid));
        root.setLeft(maketree(alist, counter, mid - 1));
        root.setRight(maketree(alist, mid + 1, lengtth));
        return root;
    }
    public int depth(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = depth(root.getLeft());
            int rightDepth = depth(root.getRight());
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}
