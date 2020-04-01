package chapter9d;

public class BirthdayCake extends Cake {
    private int candles;

    public BirthdayCake(){
        super("chocolate ", 4.99);
    }

    public int getCandles() {
        return candles;
    }
    public void setCandles(int candles) {
        this.candles = candles;
    }


}
