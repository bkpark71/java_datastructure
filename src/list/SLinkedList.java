package list;

public class SLinkedList {
  // 인스턴스 변수
  private Node head;
  private Node tail;
  private int size;
  // 생성자
  public SLinkedList(){
    head = null;
    tail = null;
    size = 0;
  }
  // 탐색,추가,삭제 연산 메서드
  public void addFirst(Node newNode){
    if(size == 0){
      tail = newNode;
    }
    newNode.setNext(head);
    head = newNode;
    size++;
  }

  public void addLast(Node newNode){
    if(size == 0){
      addFirst(newNode);
    } else {
      tail.setNext(newNode);
      tail = newNode;
      size++;
    }
  }

  public Node getTail(){
    Node temp = head.getNext();
    while(temp.getNext() != null){
      temp = temp.getNext();
    }
    return null;
  }
  public int size(){
    return size;
  }
}
