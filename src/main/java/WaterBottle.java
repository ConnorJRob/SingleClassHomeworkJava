public class WaterBottle {

    private int volume = 100;

    public WaterBottle(){
    }

    public int getVolume(){
        return this.volume;
    }

    public void takeDrink(){
        this.volume -= 10;
    }

    public void emptyBottle(){
        this.volume = 0;
    }

    public void refillBottle(){
        this.volume = 100;
    }
}
