public class RecursionBinary {

    public static void main(String[] args) {
        Array my = new Array(10);
        my.insert(5);
        my.insert(10);
        my.insert(15);
        my.insert(20);
        my.insert(25);
        my.insert(30);
        my.insert(35);
        my.insert(40);
        my.insert(45);
        my.insert(50);
        my.display();
        int key = 12;
        if(my.find(key) != my.size()){
            System.out.print("found " + key);
        }
        else{
            System.out.print("can't find it " + key);
        }
    }
}
