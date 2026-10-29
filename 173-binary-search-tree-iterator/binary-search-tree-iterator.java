class BSTIterator {
    int i = 0;
    LinkedList<Integer> list = new LinkedList<>();

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    
    public int next() {
        return list.get(i++);
    }
    
    public boolean hasNext() {
        if (i >= list.size()) {
            return false;
        }
        return true;
    }
}