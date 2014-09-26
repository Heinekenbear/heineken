public class IsSymmetric{
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
			return true;
		Stack<TreeNode> sta1 = new Stack<TreeNode>();
		Stack<TreeNode> sta2 = new Stack<TreeNode>();
		sta1.add(root);
		sta2.add(root);
		while(!sta1.isEmpty() && !sta2.isEmpty()){
			TreeNode node1 = sta1.pop();
			TreeNode node2 = sta2.pop();
			if(node1 == null && node2 == null)
				continue;
			else if(node1 == null || node2 == null)
                return false;
            else if( node1.val != node2.val)
                return false;
            else{
                sta1.push(node1.left);
                sta1.push(node1.right);
                sta2.push(node2.right);
                sta2.push(node2.left);
            }
		}
		return true;
    }
}