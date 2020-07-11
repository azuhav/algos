package exercises.chapter_1_3;
/*
Write a method delete() that takes an int argument k and deletes the kth element
in a linked list, if it exists.
 */

public class Ex_1_3_20 {
    /*
    // we assume that first is a reference to the first Node in the list
public void delete(int k) {
    if (k <= 0) throw new RuntimeException("Invalid value of k");

    // degenerate case - empty linked list
    if (first == null) return;

    // special case - removing the first node
    if (k == 1) {
        first = first.next;
        return;
    }

    // general case, make temp point to the (k-1)st node
    Node temp = first;
    for (int i = 2; i < k; i++) {
        temp = temp.next;
        if (temp == null) return;   // list has < k nodes
    }

    if (temp.next == null) return;  // list has < k nodes

    // change temp.next to skip kth node
    temp.next = temp.next.next;

     */
}
