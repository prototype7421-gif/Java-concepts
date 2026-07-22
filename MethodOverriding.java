class a{
    public int add(int x,int y){
        return x+y;
    }
}
class b extends a{
    public int add(int x,int y){
        return x*y*10;
    }
}
public class MethodOverriding{
    public static void main(String[] args){
        a obj1=new b();
        obj1.add(10,20);

        System.out.println(obj1.add(10,20));
    }
}
//method overriding is a feature that allows a subclass to provide a specific implementation of a
//method that is already defined in its superclass. In the provided code snippet, 
//we have two classes: `a` and `b`. Class `b` extends class `a`, and both classes have a method named `add`.