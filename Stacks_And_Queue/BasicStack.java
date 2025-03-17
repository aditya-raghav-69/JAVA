package Stacks_And_Queue;

import java.util.Scanner;

public class BasicStack{

    static int stack[] = new int[5];
    static int top = 0;

    public static void push(int data) {
       if(top == 5) {
           System.out.println("Stack is full");
       } else {
           stack[top] = data;
           top++;
       }
    }

    public static void pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
        } else {
            top--;
            stack[top] = 0;
        }
       }

    public static void show() {
        for(int n : stack) {
            System.out.println(n);
        }
    }
    

    public static void main(String[] args) {

        // This is the stack implementation using array in java similar to the stack data structure in c
        Scanner sc = new Scanner(System.in); // Initialize Scanner to read user input

        while (true) { // Infinite loop for stack operations

            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Show");
            System.out.println("4. Exit");

            System.out.println("Enter your choice");

            int choice;
            while (!sc.hasNextInt()) { // Input validation
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear the invalid input
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push");
                    int data;
                    while (!sc.hasNextInt()) { // Input validation
                        System.out.println("Invalid input. Please enter an integer.");
                        sc.next(); // Clear the invalid input
                    }
                    data = sc.nextInt();

                    push(data);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    sc.close(); // Close the Scanner to free resources
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");

            }

        }
    }
}
