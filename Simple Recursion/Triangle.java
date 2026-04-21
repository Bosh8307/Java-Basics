import java.util.Scanner;
public class Recursion {
    public static int triangler(int n){
    if(n == 1){
    return 1;
    }else{
    return(n + triangler(n-1));
    }
public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = m.nextInt();
        System.out.print("Triangle is : " + triangler(num));
    }
  }
}
