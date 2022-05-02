public class Main {


    public static void main(String[] args) {

        GamingPC gamingPC =  new GamingPC(5000);

        Observer Ion = new Client("Ion",4500);
        Observer Viorel= new Client("Viorel",4750);

        gamingPC.registerObserver(Ion);
        gamingPC.registerObserver(Viorel);

        gamingPC.priceChanged(4800);
        gamingPC.priceChanged(4700);

        gamingPC.unregisterObserver(Viorel);

        gamingPC.priceChanged(4600);



    }
}
