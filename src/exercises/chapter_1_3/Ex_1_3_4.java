package exercises.chapter_1_3;
/*
Write a stack client Parentheses that reads in a text stream from standard input
and uses a stack to determine whether its parentheses are properly balanced. For example,
your program should print true for [()]{}{[()()]()} and false for [(]).
 */

import princeton.Stack;
import princeton.StdIn;

public class Ex_1_3_4 {

    public static void main(String[] args) {

        boolean bool = true;

        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            String one = StdIn.readString();
            System.out.println(one);
            if (one.equals("[") || one.equals("(") || one.equals("{")) stack.push(one);
            else {
                if (!stack.isEmpty()) {
                    String two = stack.pop();
                    if (two.equals("[")) bool = one.equals("]");
                    else if (two.equals("(")) bool = one.equals(")");
                    else if (two.equals("{")) bool = one.equals("}");
                }
            }
        }
        System.out.println(bool);
    }
}