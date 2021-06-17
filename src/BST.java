public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (E object : objects) {
            insert(object);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    public void postorder() {
        postorder(root);
    }

    public void preorder() {
        preorder(root);
    }

    protected void postorder(TreeNode<E> root) {
        if (root == null) {
            return;
        } else {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.element + " ");
        }
    }

    protected void preorder(TreeNode<E> root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.element + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        } else {
            inorder(root.left);
            System.out.println(root.element + " ");
            inorder(root.right);
        }
    }
}
