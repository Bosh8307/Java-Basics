public class Stack {
    private char[] A;
    private int Size;
    private int Top;
        public Stack(int Size){
            this.Size = Size;
            A = new char[Size];
            Top = -1;
        }
        public void push(char v){
        A[++Top] = v;
        }
        public char pop(){
        return A[Top--];
        }
        public void display(){
        for(int i = 0; i < A.length; i++){
            System.out.println(A[i]);
            }
        }
        public char peek(){
        return A[Top];
        }
        public boolean isEmpty(){
        return Top == -1;
        } 
        public boolean isFull(){
        return Top == Size - 1;
        }
}
