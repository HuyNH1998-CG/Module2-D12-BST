public class TestBSTPostOrder {
    public static void main(String[] args) {
        BST<Integer> treePostOrder = new BST<>();
        System.out.println("Postorder:");
        treePostOrder.insert(27);
        treePostOrder.insert(14);
        treePostOrder.insert(10);
        treePostOrder.insert(19);
        treePostOrder.insert(35);
        treePostOrder.insert(31);
        treePostOrder.insert(42);
        treePostOrder.insert2(99);
        treePostOrder.postorder();
        System.out.println("Stop:");
        treePostOrder.inorder();
        System.out.println("Stop:");
        treePostOrder.preorder();
        System.out.println("Stop:");
        treePostOrder.delete(27);
        treePostOrder.postorder();
        System.out.println("Stop:");

    }
}
