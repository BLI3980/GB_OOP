import java.util.Iterator;

public class LinkList<E> implements Iterable<E>{
    private Node<E> node = null;
    public int counter = 0;

    public LinkList(){
        node = new Node<>();
    }

    public LinkList(Node<E> node, int counter) {
        this.node = node;
        this.counter = counter;
    }


    // Method for adding data to LinkList
    public void addData(E data){
        if (counter == 0){
            node.set(data);
        }
        else{
            node.add(data);
        }
        counter++;
    }

    @Override
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            private Node<E> current;
            private boolean isFirst = true;
            void Iterator(Node<E> node){
                current = node;
            }
            @Override
            public boolean hasNext() {
                if(counter == 1 && isFirst) return true;
                else return current.isNext();
            }

            @Override
            public E next() {
                if(isFirst) isFirst = false;
                else current = current.next;
                return current.get();
            }
        };
    }
}
