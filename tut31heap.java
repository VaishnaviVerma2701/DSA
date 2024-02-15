class heap1 {
    int heap[] = new int[100]; // heap ke ander 100 element aa sakte hai
    int n = 0;

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insertelement(int x) {
        // inset element in last position
        n++;
        heap[n - 1] = x;
        int i = n - 1;
        while (i > 0 && heap[i] < heap[(i - 1) / 2]) {

            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.print(heap[i] + " ");
        }

    }
    public static void main(String[] args) {
        heap1 h = new heap1();
        h.insertelement(5);
        h.insertelement(9);
        h.insertelement(7);
        h.insertelement(11);
        h.insertelement(13);
        h.insertelement(15);
        h.insertelement(17);
        h.insertelement(20);
        h.print();
    }
}

class heap2 {
    int heap[] = new int[100]; // heap ke ander 100 element aa sakte hai
    int n = 0;

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insertelement(int p) {
        // inset element in last position
        n++;
        heap[n - 1] = p;
        int i = n - 1;
        while (i > 0 && heap[i] < heap[(i - 1) / 2]) {

            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public int delete() {
        int deleted = heap[0];
        // put last index at fist position
        heap[0] = heap[n - 1];
        n--;
        int i = 0;
        while (i <= (n - 1) / 2) {
            if (heap[2 * i + 1] < heap[i] || heap[2 * i + 2] < heap[i]) {
                int min = (heap[2 * i + 1] < heap[2 * i + 1]) ? 2 * i + 1 : 2 * i + 2;
                swap(i, min);
                i = min;
            }
        }
        return deleted;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.print(heap[i] + " ");
        }
    }
}

class heapimplementation1 {
    public static void main(String[] args) {
        heap2 h1 = new heap2();
        int heap[] = { 5, 9, 7, 11, 10, 13, 15, 17, 20 };
        for (int i = 0; i < heap.length; i++) {
            h1.insertelement(heap[i]);
        }

        h1.print();
        h1.delete();

        h1.print();

    }
}

class heap3 {
    void heapify(int[] A,int n,int i){
            int parent = (i-1)/ 2;
            if(A[parent]>0){
                if(A[i]>A[parent]){
                   int temp = A[i];
                 A[i] = A[parent];
        A[parent] = temp; 
        heapify(A,n,parent);
                }
            }
    }
    int insert(int A[],int n,int value) {
        n = n + 1;
        A[n-1] = value;
        heapify(A,n,n-1);
    return n;
    }
public void print(int A[],int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    int delete(int A[], int n1) {
       int deleted= A[0];
        A[0] = A[n1-1];
        n1 = n1 - 1;
         heapify1(A, n1,0);
         return n1;
        }
        void heapify1(int A[],int n1,int i){

             int large=i;
            int left = A[2 * i];
            int right = A[2 * i + 1];
            if(left<n1&&A[left]>A[large]){
                large=left;
            }
            if(right<n1&&A[right]>A[large]){
                large=right;
            }
            if(large!=i){
                int temp = A[i];
                 A[i] = A[large];
        A[large] = temp; 
        heapify1(A,n1,i); 
            }   
        } 
        public void print1(int A[],int n1) {
        for (int i = 0; i < n1; i++) {
            System.out.print(A[i] + " ");
        }
    } 
    }
class heapimple {
    public static void main(String[] args) {
        heap3 h3 = new heap3();
        int MAX=100;
        int A[] = new int[MAX];        
        A[0]=10;
        A[1]=20;        
        A[2]=30;
        A[3]=40;
        A[4]=50;
        A[5]=60;
        int n = 6;
        int n1=6;
        int value=17;
       System.out.print( h3.insert(A,value,n)+" ");
        h3.print(A,n);
     h3.delete(A, n1);
         h3.print1(A,n1);
    }
}