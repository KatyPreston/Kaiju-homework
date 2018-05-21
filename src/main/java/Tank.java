public class Tank extends Vehicle {

    public Tank(String type, int healthValue){
        super(type, healthValue);
    }

    public void ram(Kaiju kaiju){
        int health = kaiju.getHealthValue();
        health -= 20;
    }

    public void fireOn(Kaiju kaiju){
        int health = kaiju.getHealthValue();
        health -= 40;
    }

}
