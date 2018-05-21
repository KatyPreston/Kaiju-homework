public class Defender extends Vehicle{
    public Defender(String type, int healthValue){
        super(type, healthValue);
    }


//    why aren't these working??

    public void ram(Kaiju kaiju){
         int health = kaiju.getHealthValue();
          health -= 10;
    }

    public void fireOn(Kaiju kaiju){
        int health = kaiju.getHealthValue();
        health -= 20;

    }

}
