import java.util.*;
  class   TreeNode{
    int val;
   TreeNode left,right;
   TreeNode(int val){
    this.val=val;
   }
  }
class deletionBST {
    TreeNode root;
    public TreeNode deleteIntoBST(TreeNode root, int x) {
        if(root==null){
            

return root;
        }
        if(x<root.val){
        root.left=deleteIntoBST(root.left,x);
        }
    else if(x>root.val){
root.right=deleteIntoBST(root.right,x);
    }
    else{
        if(root.left==null){
            return root.right;
        }
         else if(root.right==null){
            return root.left;
        }
        root.val=minValue(root.right);
        root.right=deleteIntoBST(root.right,root.val);
    }
    return root;
}

static int minValue(TreeNode root){
    int minv=root.val;
    while(root.left!=null){
        minv=root.left.val;
        root=root.left;
    }
    return minv;
}
void inorder(TreeNode root){
    if(root!=null){
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
}
public static void main(String[] args) {
  deletionBST b=new deletionBST();  
int x=40;
 b.root=new TreeNode(40);    
    b.root.left=new TreeNode(30);
        b.root.right=new TreeNode(50);
     b.root.left.left=new TreeNode(20);
    b.root.left.right=new TreeNode(32);
            b.root.right.left=new TreeNode(41);
                    b.root.right.right=new TreeNode(51);
                    System.out.println(b.deleteIntoBST(b.root,x).val);
                    b.inorder(b.root);

}}