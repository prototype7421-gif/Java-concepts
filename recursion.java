
import java.util.Scanner;

 class r{
     void   count(int i, int n){
        if(i>n){
          return;
        }
        System.out.println("aayush");
        count(i+1,n);
     }

}
class recursion{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        r obj = new r();
        obj.count(1, n);
    }
}
