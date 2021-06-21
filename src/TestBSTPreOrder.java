public class TestBSTPreOrder {
    public static void main(String[] args) {
        BST<Integer> treePreOrder = new BST<>();
        System.out.println("Postorder:");
        treePreOrder.insert(27);
        treePreOrder.insert(10);
        treePreOrder.insert(14);

        treePreOrder.insert(31);
        treePreOrder.insert(35);
        treePreOrder.insert(19);

        treePreOrder.insert(42);
        treePreOrder.preorder();
        System.out.println("Stop:");
        treePreOrder.search(35);
        System.out.println("tree size"+ treePreOrder.getSize());

    }
}
