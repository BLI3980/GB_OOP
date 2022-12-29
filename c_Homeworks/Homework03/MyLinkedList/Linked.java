package MyLinkedList;

public interface Linked<E> {
    void addLast(E element);
    void addFirst(E element);
    int size();
    E getElementByIndex(int index);

}
