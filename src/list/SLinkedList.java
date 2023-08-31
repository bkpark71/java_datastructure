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

  public void add(int index, Node newNode){
    if(index == 0) {
      addFirst(newNode);
    } else {
      Node prevNode = getNode(index - 1);
      newNode.setNext(prevNode.getNext());
      prevNode.setNext(newNode);
      size++;
    }
    if(newNode.getNext() == null){
      tail = newNode;
    }
  }

  public Node getNode(int index){
    Node x = head;
    for (int i = 0; i < index ; i++) {
      x = x.getNext();
    }
    return x;
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

  public <E> int indexOf(E e){
    Node temp = head;
    boolean find = false;
    int index = 0;
    while(temp != null){
      if(temp.getItem() == e) {
        find = true;
        break;
      }
      index ++;
      temp = temp.getNext();
    }
    return find ? index : -1;
  }
  public String removeFirst(){
    Node temp = head;
    head = temp.getNext();
    temp.setNext(null);
    size--;
    return temp.getItem().toString();
  }

  @Override
  public String toString() {
    String str = "[";
    if(size == 0) {
      str += "]";
    } else {
      Node x = head;
      for (int i = 0; i < size-1 ; i++) {
        str += x.getItem() + ",";
        x = x.getNext();
      }
      str+= x.getItem() + "]";
    }
    return str;
  }
}
