package testing.demo;

public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}

	public void addLast(int data){
		
		Node newNode = new Node(data);
		
		if(head ==null){
			head = newNode;
		}else{
			Node currNode = head;
			while(currNode.next!=null){
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
		return;
	}
	
	public void addFirst(int data){
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
		return;
	}
	
	public void delete(int data){
		
		if(head ==null){
			System.out.println("List is empty");
		}else{
			Node currNode = head,prevNode = head;
			while(currNode!=null){
				if(currNode.data==data){
					if(currNode==head){
						head = currNode.next;
					}
					prevNode.next=currNode.next;
					return;
				}else{
					prevNode = currNode;
					currNode = currNode.next;
				}
			}
		}
		return;
	}

	public void printData(){
		Node currNode = head;
		System.out.print("[ ");
		while(currNode!=null){
			System.out.print(currNode.data+" ");
			currNode = currNode.next;
		}
		System.out.println(" ]");
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(4);
		list.printData();
	}

}
