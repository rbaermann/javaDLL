
public class ListTester {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		DoublyLinkedList dll2 = new DoublyLinkedList();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);
        Node n7 = new Node(10);
        Node n8 = new Node(20);
        Node n9 = new Node(30);
        Node n10 = new Node(20);
        Node n11 = new Node(10);
        
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);
        
        dll2.push(n7);
        dll2.push(n8);
        dll2.push(n9);
        dll2.push(n10);
        dll2.push(n11);
        
        dll.printValuesForward();
        dll.printValuesBackward();
        
        System.out.println(dll.pop().value);
        
        dll.printValuesForward();
        
        System.out.println(dll.contains(30));
        System.out.println(dll.contains(60));
        
        System.out.println(dll.size());
        
        dll.insertAt(new Node(30), 2);
        dll.removeAt(4);
        
        dll.printValuesForward();
        dll.printValuesBackward();
        
        System.out.println(dll.isPalindrome());
        System.out.println(dll2.isPalindrome());
	}

}
