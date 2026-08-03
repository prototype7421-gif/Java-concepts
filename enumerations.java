
// enum
enum Status {
    play(2000), learn(9999), record(5666);

    public int price;

    Status(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class enumerations {
    public static void main(String[] args) {
        Status f = Status.play;
        System.out.println(f);
        for(Status s : Status.values()  ){
            System.out.println(s + " " + s.getPrice());

        }
    }
}
    