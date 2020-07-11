package exercises.chapter_1_3;

/*
What does the following code fragment do to the queue q?

Stack<String> stack = new Stack<String>();
while (!q.isEmpty())
    stack.push(q.dequeue());
while (!stack.isEmpty())
    q.enqueue(stack.pop());
 */

public class Ex_1_3_6 {
    // 1st loop : All string of q were removed from first to last and then added to stack one by one
    // 2nd loop : All string of stack were removed from last to first and then added to q one by one
}
