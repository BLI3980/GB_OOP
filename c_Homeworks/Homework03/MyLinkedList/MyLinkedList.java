package MyLinkedList;


import java.util.Iterator;

public class LinkedContainer<E> implements Linked<E>, Iterable<E>, DescendIterator<E>{

    public static void main(String[] args) {
        Linked<String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("abc");            // index 1
        stringLinked.addLast("def");            // index 2
        stringLinked.addLast("ghi");            // index 3
        stringLinked.addLast("jkl");            // index 4
        stringLinked.addFirst("zyx");           // index 0
        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(3));
    }
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public LinkedContainer() {
        lastNode = new Node<>(null, firstNode, null);
        firstNode = new Node<>(null, null, lastNode );
    }

    @Override
    public void addFirst(E element) {
        Node<E> addNode = firstNode;
        addNode.setCurrentElement(element);
        firstNode = new Node<>(null, null, addNode);
        addNode.setPrevElement(firstNode);
        size++;
    }

    @Override
    public void addLast(E element) {
        Node<E> addNode = lastNode;
        addNode.setCurrentElement(element);
        lastNode = new Node<>(null, addNode, null);
        addNode.setNextElement(lastNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int index) {
        Node<E> result = firstNode.getNextElement();
        for (int i = 0; i < index; i++){
            result = nextElement(result);
        }
        return result.getCurrentElement();
    }

    private Node<E> nextElement(Node<E> current){
        return current.getNextElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size - 1;
            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }

    private class Node<E> {
        // Fields
        private E currentElement;
        private Node<E> prevElement;
        private Node<E> nextElement;


        // Constructor
        public Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.prevElement = prevElement;
            this.nextElement = nextElement;
        }


        // Getters
        public E getCurrentElement() {
            return currentElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }


        // Setters
        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }



    }
}
