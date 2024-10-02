package MaxHeapLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumHeap <E extends Comparable<E>> implements HeapInterface<E>{
	public List<E> heap;
	
	public MaximumHeap() {
        this.heap = new ArrayList<>();
	}

	public boolean add(E item) {
		return heap.add(item);
	}

	public boolean insert(E item) {
		return heap.add(item) && heapifyUp();
	}

	private boolean heapifyUp() {
		int index = size() - 1;
		while(index > 0) {
			int parent = (index -1) /2;
			if(heap.get(index).compareTo(heap.get(parent))<=0) {
				break; 				
			}
			Collections.swap(heap, index, parent);
			index = parent;
		}
		return true;
    }
	
	public E remove() {
	    if (empty()) {
	        return null;
	    }

	    E removed = heap.get(0);
	    int lastIndex = size() - 1;
	    heap.set(0, heap.remove(lastIndex));

	    if (!empty()) {
	        heapifyDown();
	    }

	    return removed;
	}

	private void heapifyDown() {
			int index = 0;
			while(true) {
				int Left = index * 2 + 1;
				int Right = index * 2 + 2;
				int Max = index;
				
				if(Left < size() && heap.get(Left).compareTo(heap.get(Max)) >0) {
					Max = Left;
				}
				if(Right < size() && heap.get(Right).compareTo(heap.get(Max))>0){
					Max = Right;
				}
				if(Max == index) {
					break;
				}
				Collections.swap(heap, index, Max);
				index = Max;
			}	
	}
	
	public boolean empty() {
		if(heap.isEmpty()) {
			return true;
		}
		return false;
	}

	public int size() {
		return heap.size();
	}

	public E get(int x) {
		if(x >= 0 && x < size()) {
		}
		return heap.get(x);
	}

	public void clear() {
		heap.clear();
	}
	
}
