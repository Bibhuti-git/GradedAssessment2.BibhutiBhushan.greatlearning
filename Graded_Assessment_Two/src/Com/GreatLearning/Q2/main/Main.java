package Com.GreatLearning.Q2.main;

import Com.GreatLearning.Q2.Service.Node;
import Com.GreatLearning.Q2.Service.Service;

public class Main {
	
	public static void main(String[] args) {
		Service obj= new Service();
		Node node;
		
		node= new  Node(50);
		node.left= new Node(30);
		node.right= new Node (60);
		node.left.left= new Node (10);
		node.right.left= new  Node (55);
		
		Node rightSkewedTree=obj.completeBSTtoSkewed(node);
		System.out.println("THE RESULTATNT OUTPUT IS:");
		obj.traverseRightSkewedTree(rightSkewedTree);
		
	}

}
