public class TestBST {
    public static void main(String[] args) {
        BST<String> treeInOrder = new BST<>();
        BST<Integer> treePreOrder = new BST<>();
        BST<Integer> treePostOrder = new BST<>();
        treeInOrder.insert("George");
        treeInOrder.insert("Michael");
        treeInOrder.insert("Tom");
        treeInOrder.insert("Adam");
        treeInOrder.insert("Jones");
        treeInOrder.insert("Peter");
        treeInOrder.insert("Daniel");
        System.out.println("Inorder (sorted):");
        treeInOrder.inorder();
        System.out.println("The number of node is:" + treeInOrder.getSize());

        System.out.println("Preorder:");
        treePreOrder.preorder();
        System.out.println("Stop:");
        treePostOrder.insert(27);
        treePostOrder.insert(14);
        treePostOrder.insert(10);
        treePostOrder.insert(19);
        treePostOrder.insert(35);
        treePostOrder.insert(31);
        treePostOrder.insert(42);
        treePostOrder.postorder();
        System.out.println("Postorder:");
        treePreOrder.insert(27);
        treePreOrder.insert(14);
        treePreOrder.insert(10);
        treePreOrder.insert(19);
        treePreOrder.insert(35);
        treePreOrder.insert(31);
        treePreOrder.insert(42);
        treePreOrder.preorder();
        System.out.println("Stop:");

    }
}
