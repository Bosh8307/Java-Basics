public class Test {

    public static void main(String[] args) {
        Stack my = new Stack(5);
        System.out.println(my.isEmpty());
        System.out.println("========================");
        my.Push(10);
        my.Push(20);
        my.Push(30);
        my.Push(40);
        my.Push(50);
        my.Display();
        System.out.println("========================");        
        System.out.println(my.Peek());
        System.out.println("========================");
        System.out.println(my.isFull());
        System.out.println("========================");
        while(! my.isEmpty()){
            int value = my.pop();
            System.out.println(value);
        }
        System.out.println("========================");
        System.out.println(my.isEmpty());
    }
}
