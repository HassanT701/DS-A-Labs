package MaxHeapLab;

public interface HeapInterface<E extends Comparable>
{
    public boolean add(E item);
    public boolean insert(E item);
    public E remove();
    public boolean empty();
    public int size();
    public E get(int x);
    public void clear();
}