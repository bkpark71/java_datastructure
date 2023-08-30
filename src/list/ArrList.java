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

    public E remove(){ // removeLast
      if(size == 0)
        throw new IndexOutOfBoundsException();
      E tobeDeleted = a[size-1];
      a[size-1] = null;
      size--;
      if(size > 0 && size == a.length/4){
        resize(a.length / 2);
      }
      return tobeDeleted;
    }

    
    private void resize(int newSize){
      System.out.println("resize가 호출됨(" + newSize + ")");
      E[] t = (E[])new Object[newSize];
      for (int i = 0; i < size; i++) {
        t[i] = a[i];
      }
      a = t;
    }
}
