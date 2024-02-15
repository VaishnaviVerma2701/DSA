import java.util.*;
  class   TreeNode{
    int val;
   TreeNode left,right;
   TreeNode(int val){
    this.val=val;
   }
  }
class insertionBST {
    TreeNode root;
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            // creat a node that is inserted
TreeNode node=new TreeNode(val);
return node;
        }
        if(val<root.val){
        root.left=insertIntoBST(root.left,val);
        }
    else{
root.right=insertIntoBST(root.right,val);
    }
    return root;
}
void inorder(TreeNode root){
    if(root!=null){
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
}
public static void main(String[] args) {
  insertionBST b=new insertionBST();  
int val=50;
 b.root=new TreeNode(40);    
    b.root.left=new TreeNode(30);
        b.root.right=new TreeNode(50);
     b.root.left.left=new TreeNode(20);
    b.root.left.right=new TreeNode(32);
            b.root.right.left=new TreeNode(41);
                    b.root.right.right=new TreeNode(51);
                    System.out.println(b.insertIntoBST(b.root,val).val);
                    b.inorder(b.root);

}}