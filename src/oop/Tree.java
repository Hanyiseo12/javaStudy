package oop;
import java.awt.*;


public class Tree {
	double heightFt;
	double trunkDiameterInches;
	TreeType treeType;
	static Color TRUNK_COLOR = new Color(102,51,0);
	
	Tree(double heightFt, double trunkDiameterInches, TreeType treeType){
		this.heightFt = heightFt;
		this.trunkDiameterInches = trunkDiameterInches;
		this.treeType = treeType;
	}
	
	void grow() {
		this.heightFt = this.heightFt +10;
		this.trunkDiameterInches = this.trunkDiameterInches + 1;
	}
	
	void isTallerThan100() {
		if(this.heightFt > 100) {
			System.out.println("Taller than 100");
		}
	}
	static void announceTree() {
		System.out.println(Tree.TRUNK_COLOR);
	}
	
}
