public class Animal {
    String typeAnimal;
    private Runningbehavior runningbehavior ;

    public Animal(Runningbehavior runningbehavior){
        this.runningbehavior = runningbehavior;
    }

    public void eat(){
        System.out.println("eating flour...");
    }

    public String RunningPossibilies(){
        return runningbehavior.running();

    }
}
