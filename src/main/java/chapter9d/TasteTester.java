package chapter9d;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake bc = new BirthdayCake();
        WeddingCake wc = new WeddingCake();

        wc.setTiers(3);
        bc.setCandles(5);

        System.out.println(bc.getFlavor() + " " + bc.getPrice()+ " " + " " + bc.getCandles());
        System.out.println(wc.getFlavor()+ " " + wc.getPrice()+ " " + wc.getTiers());

    }


}
