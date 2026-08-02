//interface
interface  a{
    public void show();
    public void config();

}
class football  {
     public void show(){
        System.out.println("croatia");
    }
}
class basketball{
    public void show(){
        System.out.println("nope");
    }
    public void config(){
        
    }
}
class b implements a{
    public void show(football f){
        System.out.println("luka");
    }
    public void config(basketball d){
        System.out.println("Modric");
    }
}
public class luka{
    public static void main (String Args[]){
     a obj = new b();
     basketball d = new basketball();
     football f = new football();
     f.show();
     obj.show();
     obj.config();  

    }

}