package stacknqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    System.out.println(q.peek());
    q.add(10); q.add(20);
    System.out.println(q.peek());
  }
}
