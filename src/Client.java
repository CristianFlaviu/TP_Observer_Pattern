import java.text.MessageFormat;

public class Client implements Observer {

    String name;
    int budget;

    public Client(String name,int budget) {
        this.name = name;
        this.budget = budget;
    }

    @Override
    public void update(int price) {
        System.out.println(MessageFormat.format("{0}: Well, my budget is {1} so I will {2} this PC",name,budget,price > budget ? "buy":"NOT buy" ));
    }
}
