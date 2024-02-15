import java.util.*;
class TreeNode{
    int data;
   TreeNode left,right;
   TreeNode(int data){
    this.data=data;
   }
}
class BST {
    TreeNode root;
    public boolean searchBST(TreeNode root, int val) {
        if(root==null)
        return false;
        if(root.data==val)
        return true;
        if(val<root.data)
        return searchBST(root.left,val);
        else
        return searchBST(root.right,val);
    }
public static void main(String[] args) {
    int val=10;
    BST b=new BST();
    b.root=new TreeNode(40);    
    b.root.left=new TreeNode(30);
        b.root.right=new TreeNode(50);
     b.root.left.left=new TreeNode(20);
    b.root.left=new TreeNode(32);
            b.root.right.left=new TreeNode(41);
                    b.root.right.right=new TreeNode(51);
                    System.out.println(b.searchBST(b.root,val));





}
}