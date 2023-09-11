package trinity;

public class Node<E> {
    private E value;
    private Node<E> next;

    public Node(E val, Node<E> nextval) {
        value = val;
        next = nextval;
    }
    public Node(Node<E> nextval) {
        next = nextval;
    }

    public E getValue() {
        return value;
    }

    public E setValue(E val) {
        return value = val;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> setNext(Node<E> val) {
        return next = val;
    }

}
