public class Test {

    public static void main(String[] args) {
        Queue my = new Queue(5);
        System.out.println(my.isEmpty());
        System.out.println("======================");
        my.insert(10);
        my.insert(20);
        my.insert(30);
        my.insert(40);
        my.insert(50);
        System.out.println(my.isFull());
        System.out.println("======================");
        System.out.println("peek is : " + my.peekFront());
        System.out.println("======================");
        System.out.println("Size is : " + my.size());
        System.out.println("======================");
        my.display();
        System.out.println("======================");
        my.remove();
        my.remove();
        my.remove();
        my.display();

    }
}
