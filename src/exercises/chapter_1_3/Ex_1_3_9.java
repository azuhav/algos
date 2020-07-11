package exercises.chapter_1_3;
/*
Write a program that takes from standard input an expression without left parentheses
and prints the equivalent infix expression with the parentheses inserted. For
example, given the input:
1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
your program should print
( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )
 */

import princeton.Stack;
import princeton.StdIn;

import java.util.Iterator;

public class Ex_1_3_9 {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        Stack<String> updatedStack = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            stack.push(s);
        }

        while (!stack.isEmpty()) {
            int n = 0;
            String x = stack.pop();
        }



    }
}
