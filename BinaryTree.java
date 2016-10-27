
public class BinaryTree {
	
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x){
			this.val = x;
		}
		
		public void insert(TreeNode parent, int x){
			
			if (x < parent.val){
				if (parent.left != null) insert(parent.left, x);
				parent.left = new TreeNode(x); 
			}
			else{
				if (parent.right != null) insert(parent.right, x);
				parent.right = new TreeNode(x);
			}
		}
		
		public void traverse(TreeNode node){
			
			if (node == null)return;
			System.out.println(node.val);
			if(node.left != null) traverse(node.left);
			if(node.right != null) traverse(node.right);
		}
		
		public TreeNode invertTree(TreeNode root) {
	        
			if (root == null)return null;
			TreeNode right = invertTree(root.right);
		    TreeNode left = invertTree(root.left);
		    root.left = right;
		    root.right = left;
		    return root;
		    
			//invertTree1(root);
			//return root;
	    }
		
		private void invertTree1(TreeNode root){
			if(root == null)return;
			
			
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
		
			invertTree1(root.left);
			invertTree1(root.right);
			
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		node.insert(node, 2);
		node.insert(node, 7);
		node.traverse(node);
		node = node.invertTree(node);
		node.traverse(node);
		

	}
	
	
	

}
