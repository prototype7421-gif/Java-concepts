@FunctionalInterface
interface A {
    int add(int a, int b);
}

public class lamb {
    public static void main(String[] args) {
        A obj = (a, b) -> a + b;
        int result = obj.add(5, 3);
        System.out.println(result);
    }
}
