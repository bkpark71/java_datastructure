package list;

import java.util.LinkedList;

public class SListTest {
  public static void main(String[] args) {
    SLinkedList sl = new SLinkedList();
    Node<Integer> node = new Node<>(50);
    //sl.addFirst(node);
    sl.addLast(node);
    System.out.println(sl.size());
    Node<Integer> node1 = new Node<>(40);
    sl.addLast(node1);
    System.out.println(sl.size());
    Node<Integer> node3 = new Node<>(30);
    sl.addFirst(node3);
    System.out.println(sl.size());
    Node<Integer> node2 = new Node<>(10);
    sl.addFirst(node2);
    System.out.println(sl.size());
//---------------------------------------------
    LinkedList<Integer> ll = new LinkedList();
    ll.addFirst(10);
    ll.addFirst(20);
    System.out.println(ll);
  }
}
