/**
 * @author tnle0
 *
 */
public class LinkedList<T> {
	
	Node<T> head, tail;
	int length;
	
	public LinkedList() {
		head = tail = null;
		length = 0;
	}
	
	public boolean isEmpty() {
		if (head == null) { return true;}
		else return false;
	}
	
	public Node<T> getList()
	{
		return head;
	}
	
	public void addNode(Node<T> aNode)
	{
		if (isEmpty()) {
			head = tail = aNode;
			return;
		}
		tail.nextNode = aNode;
		tail = tail.nextNode;
		tail.nextNode = null;
		length++;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Node> myList = new LinkedList<Node>();
		
		Node aNode = new Node<>();
		aNode.setData(1);
		myList.addNode(aNode);
		
		aNode = new Node<>();
		aNode.setData(2);
		myList.addNode(aNode);
		
		aNode = new Node<>();
		aNode.setData("Hello");
		myList.addNode(aNode);
		
		Node tempnode = myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode = tempnode.nextNode;
		} while (tempnode!=null);
			
	}

}
