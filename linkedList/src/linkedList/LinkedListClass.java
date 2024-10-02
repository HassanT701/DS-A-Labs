package linkedList;

public class LinkedListClass <E>{
	Node<E> first;
    Node<E> last;

    public LinkedListClass() {
        first = null;
        last = null;
    }

    public void add(int d) {
        Node<E> n = new Node(d);
        if (first == null) {
            first = n;
            last = n;
        } else {
            last.setNext(n);
            last = n;
        }
    }

    public void add(int pos, E d) {
        Node<E> n = new Node(d);
        if (pos == 0) {
            n.setNext(first);
            first = n;
        } else {
            Node<E> temp = first;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getNext();
            }
            n.setNext(temp.getNext());
            temp.setNext(n);
        }
    }

    public void addFirst(E d) {
        Node<E> n = new Node(d);
        n.setNext(first);
        first = n;
    }

    public void addLast(E d) {
        Node<E> n = new Node(d);
        if (first == null) {
            first = n;
            last = n;
        } else {
            last.setNext(n);
            last = n;
        }
    }

    public Node<E> get(int pos) {
        Node<E> temp = first;
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public Node<E> getFirst() {
        return first;
    }

    public Node<E> getLast() {
        return last;
    }

    public int size() {
        int count = 0;
        Node<E> temp = first;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public Node<E> remove(int pos) {
        Node<E> temp = first;

        if (pos == 0) {
            return temp.getNext();
        } else {
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getNext();
            }
            Node<E> temp2 = temp.getNext();
            temp.setNext(temp2.getNext());
            return temp2;
        }
    }

    public Node<E> removeFirst() {
        Node<E> temp = first;
        first = first.getNext();
        return temp;
    }

    public Node<E> removeLast() {
        Node<E> temp = first;
        Node<E> temp2 = first;
        while (temp.getNext() != null) {
            temp2 = temp;
            temp = temp.getNext();
        }
        last = temp2;
        last.setNext(null);
        return temp;
    }

    public void clear() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void set(int pos, E d) {
        Node<E> temp = first;
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
        }
        temp.setData(d);
    }

}
