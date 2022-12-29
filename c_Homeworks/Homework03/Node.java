
public class Node<E> {
    private E element;
    public Node<E> next = null;
    public Node<E> prev = null;

    public Node(E element, Node<E> next, Node<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    public Node(E element){
        set(element);
    }
    public Node(){}

    public boolean isNext(){
        return next != null;
    }
    void set(E element){
        this.element = element;
    }
    void add(E element){
        if(isNext()){                       // if next != null
            next.add(element);
        }
        else{                               // if next == null
            next = new Node<>(element);
//            System.out.println(next);
//            System.out.println(element);
        }
    }
    E get(){
        return element;
    }
}
