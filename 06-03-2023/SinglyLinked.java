//Day 89
//Java Program to create and display a singly linked list
class SinglyLinked{
	class Node{
		int data;
		Node next;

		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public Node head = null;    
    public Node tail = null; 

    public void addNode(int data){
    	Node obj= new Node(data);
    	if(head==null){
    		head=obj;
    		tail=obj;
    	}
    	else{
    		tail.next=obj;
    		tail=obj;
    	}
    }   
    public void display(){
    	Node current =head;
    	if(head==null){
    		System.out.println("List is Empty");
    		return;
    	}
    	System.out.println("Node of SinglyLinked List");
    	while(current!=null){
    		System.out.print(current.data+" ");
    		current=current.next;
    	}
    	System.out.println();
    }
    public static void main(String[] args) {
    	SinglyLinked obj= new SinglyLinked();
    	obj.addNode(1);
    	obj.addNode(2);
    	obj.addNode(3);
    	obj.addNode(4);
    	obj.display();
    }
}
/*
OUTPUT
Node of SinglyLinked List
1 2 3 4
*/