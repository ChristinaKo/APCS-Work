public class heapSort{
    private int[] heap;
    public heapSort(){
	heap = new int[30];
    }
    public heapSort(int n){
	heap = new int[n];
    }
    public int findMax(){
	return heap[1];
    }
    public int findLast(){
	int count = 0;
	for (int i = 1; i < heap.length; i++){
	    if(heap[i]>0){
		count = count + 1;
	    }
	    else{
		break;
	    }
	}
	return count;
    }
		
    public void removeMax(){
	int last = findLast();
	heap[1] = heap[last];
	heap[last] = 0;
	int ind = 1;
	while(ind<(last+1)/2){
	    if(heap[ind] < heap[2*ind]){
		if (heap[2*ind]> heap[(2*ind)+1]){
		    int tmp = heap[ind];
		    heap[ind]=heap[2*ind];
		    heap[2*ind] = tmp;
		    ind = 2*ind;
		}
		else{
		    int tmp = heap[ind];
		    heap[ind] = heap[(2*ind) + 1];
		    heap[(2*ind)+1] = tmp;
		    ind = (2*ind)+1;
		}
	    }
	}
    }
    public void insert(int n){
	heap[findLast() +1] = n;
	int last = findLast();
	int ind = last;
	while(ind>0){
	    if(heap[ind] < heap[ind/2]){
		int tmp = heap[ind];
		heap[ind] = heap[ind/2];
		heap[ind/2] = tmp;
		ind = ind/2;
	    }
	}
    }
}