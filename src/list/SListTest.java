package list;

import java.util.LinkedList;

public class SListTest {
  public static void main(String[] args) {
    SLinkedList sl = new SLinkedList();
    Node<Integer> node = new Node<>(50);
    //sl.addFirst(node);
    sl.add(0, node);
    System.out.println(sl.size());
    Node<Integer> node1 = new Node<>(40);
    sl.add(0,node1);
    System.out.println(sl.size());
    Node<Integer> node3 = new Node<>(30);
    sl.add(1,node3);
    System.out.println(sl.size());
    Node<Integer> node2 = new Node<>(10);
    sl.add(2, node2);
    System.out.println(sl.size());
    System.out.println(sl);
    System.out.println("50의 index는 " + sl.indexOf(50));
    System.out.println("60의 index는 " + sl.indexOf(60));

    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println(sl);
    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println(sl);
    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println(sl);
    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println(sl);
//---------------------------------------------
    LinkedList<Integer> ll = new LinkedList();
    ll.addFirst(10);
    ll.addFirst(20);
    System.out.println(ll);
  }
}
