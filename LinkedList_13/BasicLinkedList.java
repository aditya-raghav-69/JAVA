package LinkedList_13;

public class BasicLinkedList {
    
    private Node head; // Head of the list

    // Node class representing each element in the linked list
    private class Node {

        int data; // Data field
        // here the node has the datatype Node class means the node is itself a datatype which is class
        Node next; // Reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node to the list
    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, set head to new node
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Add new node at the end
        }
    }

    // Method to remove a node from the list
    public void remove(int data) {
        if (head == null) return; // If the list is empty, do nothing

        if (head.data == data) {
            head = head.next; // If head needs to be removed
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next; // Remove the node
                return;
            }
            current = current.next; // Move to the next node
        }
    }

    // Method to display the contents of the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // End of the list
    }

    public static void main(String[] args) {
        BasicLinkedList linkedList = new BasicLinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.display(); // Display the list

        linkedList.remove(20); // Remove a node
        linkedList.display(); // Display the list again
    }
}
