public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(8);
        tree.insert(5);
        tree.insert(7);
        tree.insert(16);
        tree.insert(3);
        tree.insert(0);

        tree.inorder();
        System.out.println();
        tree.preorder();
        System.out.println();
        tree.postorder();

    }

}
