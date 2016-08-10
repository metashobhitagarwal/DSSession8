package TreeSorting;

import java.util.List;

public class BinarySearchTree {

	Node root;
	
	public BinarySearchTree()
	{
		this.root=null;
	}
	
	public  void insertNode(int data)
	{
		Node newNode = new Node(data);
		
		if(this.root==null)
		{
			this.root = newNode; 
			return;
		}
		else{
			Node temp = this.root;
			Node putter = null;
			while(true)
			{
				putter = temp;
				if(temp.getData() > (Integer)data)
				{
					temp=temp.getLeft();
					if(temp==null)
					{
						putter.setLeft(newNode);
						return;
					}
				}
				else
				{
					temp=temp.right;
					if(temp==null)
					{
						putter.setRight(newNode);
						return;
					}
				}
			}
		}
	}
	
	public List<Integer> inOrder(Node node, List<Integer> list) {
		if (node != null) {

			inOrder(node.getLeft(), list);
			list.add(node.getData());
			inOrder(node.getRight(), list);
		}
		return list;
	}
	
	public Node getRoot()
	{
		return this.root;
	}
	
	}
