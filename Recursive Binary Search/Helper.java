public class Array {
    public int [] a;
    int nelems;
    public Array(int max){
    a = new int[max];
    nelems = 0;
    }
    public int size(){
    return nelems;
    }
    public void insert(int value){
    a[nelems] = value;
    nelems++;
    }
    public int find(int searchKey){
    return binary(searchKey, 0, nelems-1);
    }
    public int binary(int key,int lower,int upper){
    int mid = (lower + upper)/2;
    if(a[mid] == key){
    return mid;
    }else if(lower > upper){
    return nelems;
    }else{
    if(a[mid] < key){
    return binary(key, mid+1, upper);
    }else{
    return binary(key, lower, mid-1);
    }
    }
    }
    public void display(){
    for(int i = 0; i < nelems; i++){
        System.out.println(a[i]);
    }
    }
}
