package com.basics;

public class Stack {
	private int maxSize; // Maximum size of the stack
	private int[] stackArray; // Array to hold the stack elements
	private int top; // Index of the top element in the stack

	// Constructor to initialize the stack
	public Stack(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1; // Stack is initially empty
	}

	// Method to push an element onto the stack
	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack overflow! Cannot push element " + element);
			return;
		}
		stackArray[++top] = element;
	}

	// Method to pop an element from the stack
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow! Cannot pop element.");
			return -1; // Signifies an empty stack
		}
		return stackArray[top--];
	}

	// Method to peek the top element of the stack
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty! No element to peek.");
			return -1; // Signifies an empty stack
		}
		return stackArray[top];
	}

	// Method to check if the stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}

	// Method to check if the stack is full
	public boolean isFull() {
		return (top == maxSize - 1);
	}

	// Method to display the elements of the stack
	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
			return;
		}
		System.out.print("Stack elements: ");
		for (int i = top; i >= 0; i--) {
			System.out.print(stackArray[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		stack.display(); // Display: 50 40 30 20 10

		System.out.println("Peek: " + stack.peek()); // Peek: 50
		System.out.println("Pop: " + stack.pop()); // Pop: 50
		stack.push(97);
		stack.display(); // Display: 40 30 20 10
	}
}
