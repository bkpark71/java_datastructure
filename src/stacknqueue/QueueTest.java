package stacknqueue;

public class QueueTest {
  public static void main(String[] args) {
    ListQueue<Integer> lq = new ListQueue<>();
    lq.add(10); lq.add(20);
    System.out.println(lq.size());
    System.out.println(lq.peek());
    while(!lq.isEmpty()) {
      System.out.println(lq.poll() + "이 삭제됨");
    }
  }
}
