package TreeSorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BinarySearchTreeMain {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		BinarySearchTree node = new BinarySearchTree();
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		System.out.println("Enter elements : ");
		for(int index = 0 ; index < size ; index++){
			int value = sc.nextInt();
			node.insertNode(value);
		}
		List<Integer> list = new ArrayList<Integer>();
		list = node.inOrder(node.getRoot(), list);
		System.out.println("Sorted Tree : ");
		displaySortedList(list);
		
		
	}
	static void displaySortedList(List<Integer> sortedList) {
		Iterator<Integer> itr = sortedList.iterator();
		while(itr.hasNext()){
			System.out.println(""+itr.next());
		}
	}
}
