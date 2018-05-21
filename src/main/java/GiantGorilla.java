public class GiantGorilla extends Kaiju implements IInvade {
    public GiantGorilla(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "OOOOAAARRRGH";
    }

    public void attack(Vehicle vehicle){
        vehicle.getsAttacked(this);
    }

    public String move(){
        return "I will destroy your city!!";
    }
}
