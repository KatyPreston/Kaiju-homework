public class Defender extends Vehicle{
    public Defender(String type, int healthValue){
        super(type, healthValue);
    }


//    why aren't these working??

    public void ram(Kaiju kaiju){
         kaiju.takesDamage(10);
    }

    public void fireOn(Kaiju kaiju){
        kaiju.takesDamage(20);
    }

}
