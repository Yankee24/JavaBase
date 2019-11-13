package day06_常用类库.binarytree;

public class BinaryTreeDemo {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		// 8 3 10 1 6 14 4 7 13
		binaryTree.add(8);
		binaryTree.add(3);
		binaryTree.add(10);
		binaryTree.add(1);
		binaryTree.add(6);
		binaryTree.add(14);
		binaryTree.add(4);
		binaryTree.add(7);
		binaryTree.add(13);
		
		binaryTree.print();
	}
}
