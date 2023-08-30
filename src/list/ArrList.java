package list;

public class ArrList<E> {
  // 인스턴스 변수
    private E a[];  // private E[] a;
    private int size;
  // 생성자
    public ArrList() {
      a = (E[])new Object[1];
      size = 0;
    }
  // 연산 메서드
    public int size(){
      return size;
    }

    public E get(int k){
      if(size == 0)
        throw new IndexOutOfBoundsException();
      return a[k];
    }

    public boolean add(E e){
      if(a.length == size){
        //throw new ArrayIndexOutOfBoundsException();
        resize(a.length * 2);
      }
      a[size++] = e;
      return true;
    }
    
    private void resize(int newSize){
      E[] t = (E[])new Object[newSize];
      for (int i = 0; i < size; i++) {
        t[i] = a[i];
      }
      a = t;
    }
    


}
