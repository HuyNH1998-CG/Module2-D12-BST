public class TestBSTDelete {
    public static void main(String[] args) {
        BST<String> treeInOrder = new BST<>();
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
        treeInOrder.delete("George");
        treeInOrder.inorder();
        System.out.println("The number of node is:" + treeInOrder.getSize());
    }
}
