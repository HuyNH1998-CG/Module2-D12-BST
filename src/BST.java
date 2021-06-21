import java.util.LinkedList;
import java.util.Queue;

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

    public void search(E element) {
        root = search(root, element);
        System.out.println(root.element + " " + root.left.element + " " + root.right.element);
    }

    public TreeNode<E> search(TreeNode<E> root, E element) {
        if (root == null || root.element == element) {
            return root;
        }
        int comparisonResult = element.compareTo(root.element);
        if (comparisonResult < 0) {
            return search(root.left, element);
        } else {
            return search(root.right, element);
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    public void delete(E element) {
        root = delete(root, element);
        size--;
    }

    public TreeNode<E> delete(TreeNode<E> root, E element) {
        if (root == null) {
            return null;
        }
        int compareResult = element.compareTo(root.element);
        if (compareResult < 0) {
            root.left = delete(root.left, element);
        } else if (compareResult > 0) {
            root.right = delete(root.right, element);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.element = minValue(root.right);
            root.right = delete(root.right, root.element);
        }
        return root;
    }

    public E minValue(TreeNode<E> root) {
        E minv = root.element;
        while (root.left != null) {
            minv = root.left.element;
            root = root.left;
        }
        return minv;
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

    public void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printCurrentLevel(root, i);
        }
    }

    public int height(TreeNode<E> root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            if (leftHeight > rightHeight) {
                return (leftHeight + 1);
            } else {
                return (rightHeight + 1);
            }
        }
    }

    public void printCurrentLevel(TreeNode<E> root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.println(root.element + " ");
        } else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    public void printLevelOrderQueue() {
        Queue<TreeNode<E>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode<E> tempNode = queue.poll();
            System.out.println(tempNode.element + "");
            if(tempNode.left != null){
                queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }
    }
}
