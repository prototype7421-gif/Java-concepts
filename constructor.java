class A extends Object {
    public A() {
        super(); // Call the constructor of the Object class
        System.out.println("Constructor of class A");
    }
    public A(int n) {
        this(); // Call the no-argument constructor of class A
        System.out.println("Constructor of class A with parameter: " + n);
    }
}
class B extends A {
    public B() {
        super();// Call the constructor of class A
        System.out.println("Constructor of class B");
    }
}
public class constructor extends demo{
    public static void main(String[] args) {
        B obj = new B();
        A obj2 = new A(10);
     
    }

}