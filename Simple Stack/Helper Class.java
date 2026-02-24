public class Stack {
    private int[] A;
    private int Size;
    private int Top;
    public Stack(int Size){
    this.Size = Size;
    A = new int[Size];
    Top = -1;
    }
    public void Push(int v){
    A[++Top] = v;
    }
    public int pop(){
    return A[Top--];
    }
    public int Peek(){
    return A[Top];
    }
    public boolean isEmpty(){
    return Top == -1;
    }
    public boolean isFull(){
    return Top == Size - 1;
    }
    public void Display(){
    for(int i = 0;i < A.length; i++){
        System.out.println(A[i]);
    }
    }
}
