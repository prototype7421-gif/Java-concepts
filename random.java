
class building{
   public int area( int pressure,
    int capacity){
    int result =pressure/capacity;
    return result;
   }
   public double  footing(int result){
      int output=result*2;
      return output;
   }
}

public class random{
  public static void main(String[] args) {
      
      building obj = new building();
      int result=obj.area(400, 80);
      System.out.println(result);
      double output=obj.footing(result);
      System.out.println(output);

  }
    
}