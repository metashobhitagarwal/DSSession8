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
				if(temp.getData() > data)
				{
					temp=temp.left;
					if(temp==null)
					{
						putter.left=newNode;
					}
				}
				else
				{
					temp=temp.right;
					if(temp==null)
					{
						putter.right=newNode;
					}
				}
			}
		}
	}
	
	public List<Integer> inorder(Node root1, List<Integer> list)
	{
		
		if(root1 != null){
			inorder(root1.getLeft(),list);
			list.add(root1.getData());
			//System.out.println(root1.getData());
			inorder(root1.getRight(),list);
		}
		return list;
	}
	
	public Node getRoot()
	{
		return this.root;
	}
	
	}
