package exercises.chapter_1_3;
/*
Write a method find() that takes a linked list and a string key as arguments
and returns true if some node in the list has key as its item field, false otherwise.
 */

public class Ex_1_3_21 extends structures.LinkedListStack<String> {

    public boolean find(String key) {

        for (String s : this) {
            if (s.equals(key)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Ex_1_3_21 ex = new Ex_1_3_21();
        ex.push("One");
        ex.push("Two");
        ex.push("Three");

        System.out.println(ex.find("Two")); // true
        System.out.println(ex.find("Ten")); // false
    }
}
