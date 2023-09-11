package trinity;
import java.util.List;

public class LinkedList<E> {
    private Node<E> head, tail, curr;
    private int size;

    public LinkedList() {
        head = tail = curr = new Node<E>(null);
        size = 0;
    }

    public void append(E val) {
        curr.setNext(new Node<E>(val, curr.getNext()));
        if (curr == tail) {
            tail = curr.getNext();
        }
        size++;
    }

    public E delete() {
        E returnVal = null;
        if (!(curr.getNext() == null)) {
            if(tail == curr.getNext()) tail = curr;
            returnVal = curr.getNext().getValue();
            curr.setNext(curr.getNext().getNext());
            size--;
        }
        return returnVal;
    }

}
