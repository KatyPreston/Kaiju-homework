public abstract class Vehicle {

    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType(){
        return this.type;
    }

    public int getHealthValue(){
        return this.healthValue;
    }

    public int getsAttacked(Kaiju kaiju){
        return (this.healthValue) -= (kaiju.getAttackValue());
    }

    public abstract void ram(Kaiju kaiju);

    public abstract void fireOn(Kaiju kaiju);

}
