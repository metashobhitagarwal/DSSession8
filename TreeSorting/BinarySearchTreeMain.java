package TreeSorting;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchTreeMain {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		List<Integer> rollNoList = new LinkedList<Integer>();
		BinarySearchTree node = new BinarySearchTree();
		rollNoList = getRollNumbers();
		insertInBST(rollNoList);
		System.out.println("Binary Search Tree of Roll NUmbers Created!!");
		System.out.println("Inorder of Binary Search Tree : ");
		List<Integer> sortedList = new LinkedList<Integer>();
		sortedList = node.inorder(node.root, sortedList);
		displaySortedList(sortedList);
		
	}
	
	static List<Integer> getRollNumbers(){
		List<Integer> rollNoList = new LinkedList<Integer>();
		String[] args = {};
		int n;
		try {
			System.out.println("Enter Number of Students : ");
			n = sc.nextInt();
			System.out.println("Enter roll numbers of all " + n + " Students : ");
			for (int i = 0; i < n; i++) {
				rollNoList.add(i, sc.nextInt());
			}
		} catch (Exception e) {
			System.out.println("Enter valid data!!!");
			main(args);
		}
		return rollNoList;
	}
	
	static void insertInBST(List<Integer> rollNoList) {
		BinarySearchTree root = new BinarySearchTree();
		Iterator<Integer> itr = rollNoList.iterator();
		while(itr.hasNext()){
			root.insertNode(itr.next());
		}
	}

	static void displaySortedList(List<Integer> sortedList) {
		for (int i = 0; i < sortedList.size(); i++) {
			System.out.println(sortedList.get(i));
		}
	}
}
