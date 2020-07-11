package exercises.chapter_1_3;
/*
Give the contents and size of the array for DoublingStackOfStrings with the
input
it was - the best - of times - - - it was - the - -
 */

import princeton.StdIn;
import princeton.StdOut;

public class Ex_1_3_8 {

    /*

    it
    it was
    it
    it the
    it the best
    it the
    it the of
    it the of times
    it the of
    it the
    it
    it it
    it it was
    it it
    it it the
    it it
    it

     */

    private String[] a = new String[10];
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String s) {
        a[N] = s;
        N += 1;
    }

    public String pop() {
        N -= 1;
        String s = a[N];
        a[N] = null;
        return s;
    }

    public static void main(String[] args) {
        Ex_1_3_8 stack;
        stack = new Ex_1_3_8();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                stack.push(item);
            else if (!stack.isEmpty()) StdOut.print(stack.pop() + " ");
        }

        StdOut.println("(" + stack.size() + " left on stack)");

    }
}
