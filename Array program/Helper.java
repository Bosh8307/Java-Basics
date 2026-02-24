public class arr {
private int[] m;
public arr(int size){
m = new int[size];
}
    public void setA(int index, int value){
    m[index] = value;
    }
    public int getA(int index){
    return m[index];
    }
    public void display(){
        int elems = m.length;
    for(int i = 0; i < elems;i++){
        System.out.println(m[i]);
    }
    }
    public void search(int key){
       int elems = m.length;
       int index = -1;
    for(int i = 0; i < elems; i++){
    if(m[i] == key){
    index = i;
    break;
    }
    }
    if(index != -1){
        System.out.println("found at index " + index);
    }else{
        System.out.println("not found");
    }
    }
    public void delete(int key){
    int elems = m.length;
       int index = -1;
    for(int i = 0; i < elems; i++){
    if(m[i] == key){
    index = i;
    break;
    }
    }
    if(index != -1){
        for(int i= index; i < elems - 1;i++){
                m[i] = m[i + 1];
        }--elems;
    }
    }
    public void getMax(){
        int elems = m.length;
    int max = m[0];
    for(int i =0;i < elems;i++){
    if(m[i] > max){
        max = m[i];
       
    }
    }
        System.out.println("the max value is" + max);
    }
    public void swap(int one, int two)
{
int temp = m[one];
m[one] = m[two];
m[two] = temp;
}
    public void bubbleSort(){
        int elems = m.length;
int out, in;
for(out=elems-1; out>1; out--) 
for(in=0; in<out; in++){ 
if( m[in] > m[in+1] ){ 
swap(in, in+1); 
}
}
    }
}
