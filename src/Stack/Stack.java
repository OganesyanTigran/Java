package Stack;

public class Stack {
    private char array[] = new char[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(char value) {
        if (size == array.length) {
            System.out.println("Stack is full");
        } else {
            array[size+1] = value;
            size++;
        }
    }

    public char pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[size--];
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
