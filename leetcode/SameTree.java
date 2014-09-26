public class SameTree{
	public boolean sameTree(TreeNode p, TreeNode q){
		if(p == null && q == null){
			return true;
		}
		else{
			if((p == null && q != null) || (p != null && q == null)){
				return false;
			}
			else if(p.val != q.val){
				return false;
			}
			else{
				return sameTree(p.left, q.left) && sameTree(p.right, q.right);
			}
		}
	}
}