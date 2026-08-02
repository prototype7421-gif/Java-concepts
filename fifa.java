 abstract class football{
    public abstract void  teams();
    public void show(){
        System.out.println("Welcome");
    }
}
class worldcup extends football{
    public void  teams(){
        System.out.println("32 teams");
    }
    class uefa{
       public void infantino(){
      System.out.println("FIFA princess");
       }
    }
}
public class fifa{
 public static void main(String[] args) {
   football obj =  new worldcup();
    obj.show();
    obj.teams();  

    worldcup wc = (worldcup) obj;
    worldcup.uefa obj1 = wc.new uefa();
    obj1.infantino();
   
    
}
}