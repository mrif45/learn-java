import java.util.Scanner;

public class DoublyLinked{
	Scanner scan = new Scanner(System.in);
	Node head;

	class Node {
		String data1, data2;
		char data3;
		Node next;
		Node prev;

		Node(String nama, String nim, char jk) { 
			data1 = nama; 
			data2 = nim;
			data3 = jk;
		}
		
		void tampilNode() {
			System.out.println("{" + data1 + ", " + data2 + " , " + data3 + "} ");
		}
	}

	void push(String new_data, String new_data2, char new_data3){
		Node new_Node = new Node(new_data, new_data2, new_data3);
		new_Node.next = head;
		new_Node.prev = null;

		if (head != null)
			head.prev = new_Node;

		head = new_Node;
	}

	void InsertAfter(Node prev_Node, String new_data, String new_data2, char new_data3){
		if (prev_Node == null) {
			System.out.println("List sebelumnya tidak boleh null");
			return;
		}

		Node new_node = new Node(new_data, new_data2, new_data3);

		new_node.next = prev_Node.next;
		prev_Node.next = new_node;

		new_node.prev = prev_Node;

		if (new_node.next != null)
			new_node.next.prev = new_node;
	}

	void append(String new_data, String new_data2, char new_data3){
		Node new_node = new Node(new_data, new_data2, new_data3);

		Node last = head; 
		new_node.next = null;

		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}

		while (last.next != null)
			last = last.next;

		last.next = new_node;
		new_node.prev = last;
	}

	void printlist(Node node){
		Node last = null;
		System.out.println("Hasil : ");
		while (node != null) {
			// System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Kebalikannya :");
		while (last != null) {
			// System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args){
		DoublyLinked dll = new DoublyLinked();

		System.out.println("Doubly Linked List");
		dll.printlist(dll.head);
	}
}