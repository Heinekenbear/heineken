import java.util.LinkedList;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
    	LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.addLast(root);
        while(!list.isEmpty()){
        	TreeNode temp = list.pollFirst();
        	if(temp.left == null && temp.right == null){
        		if(temp.val == sum)
        			return true;
        	}
        	else{
        		if(temp.left != null){
        			temp.left.val = temp.left.val + temp.val;
        			list.addLast(temp.left);
        		}
        		if(temp.right != null){
        			temp.right.val = temp.right.val + temp.val;
        			list.addLast(temp.right);
        		}
        		
        	}
        }
        return false;
    }
}