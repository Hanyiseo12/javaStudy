package oop;

public class Main {
public static void main(String[] args) {
	Tree myFavoriteOakTree = new Tree(25, 5, TreeType.OAK);
	myFavoriteOakTree.isTallerThan100();
	
	Tree myFavoriteMapleTree = new Tree(105,3,TreeType.MAPLE);
	myFavoriteMapleTree.isTallerThan100();
	
	Tree.announceTree();
	}
}
