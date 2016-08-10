package TreeSorting;

public class Node {

	int data;
	Node left, right;
	
	public Node()
	{
		data = 0;
		left = null;
		right = null;
	}
	
	public Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	public void setData(int data)
	{
		this.data=data;
	}
	
	public void setLeft(Node left)
	{
		this.left=left;
	}
	
	public void setRight(Node right)
	{
		this.right=right;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public Node getLeft()
	{
		return this.left;
	}
	
	public Node getRight()
	{
		return this.right;
	}
}
