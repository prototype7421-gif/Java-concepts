class demo{
    String name;
    int price;
   String brand;
public void  show(){
        System.out.println(name+" "+price+" "+brand );
    }
}
    public void main(String[] args) {
        demo m = new demo();
        m.name="oppo";
        m.price=20000;
        m.brand="oppo";
        StringBuffer sb=new StringBuffer(m.name);
        sb.append("siuuuu");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        m.show();
    
        
        

    
        
    }