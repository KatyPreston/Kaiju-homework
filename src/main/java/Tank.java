public class Tank extends Vehicle {

    public Tank(String type, int healthValue){
        super(type, healthValue);
    }



//    why aren't these working??

    public void ram(Kaiju kaiju){
        kaiju.takesDamage(20);
    }

    public void fireOn(Kaiju kaiju){
        kaiju.takesDamage(40);
    }

}
