public class GiantLizard extends Kaiju implements IInvade{

    public GiantLizard(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "Roooaaaaar";
    }

    public void attack(Vehicle vehicle){
        vehicle.getsAttacked(this);
    }

    public String move(){
        return "I will crush you!!";
    }

}
