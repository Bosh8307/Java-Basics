public class Queue {
        private int[] A;    
        private int max;    
        private int front;    
        private int rear;    
        private int nItems;    
    public Queue(int s){
    max = s;
    A = new int[max];
    front = 0;
    rear = -1;
    nItems = 0;
    }
public void insert(int v){
if(rear == max - 1)
rear = -1;
A[++rear] = v;
nItems++;    
}
public int remove(){
int temp = A[front++];
    if(front == max)
front = 0;
nItems--;
    return temp;
}
public int peekFront(){
 return A[front];   
}
    public boolean isEmpty(){
    return (nItems == 0);
    }
    public boolean isFull(){
    return (rear == max - 1);
    }
    public int size(){
    return nItems;    
    }
    public void display(){
     for(int i = 0; i < nItems; i++){
         System.out.println(A[i]);    
     }   
    }
}
