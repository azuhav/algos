package exercises.chapter_1_3;

import princeton.StdIn;
import princeton.StdOut;

// Add a method isFull() to FixedCapacityStackOfStrings.

public class Ex_1_3_1 {

    private final String[] a;
    private int N;

    public Ex_1_3_1(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

    public static void main(String[] args) {
        Ex_1_3_1 s;
        s = new Ex_1_3_1(100);

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();

            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }

        StdOut.print("; There are only " + s.size() + " " + "in stack.");
    }

}
