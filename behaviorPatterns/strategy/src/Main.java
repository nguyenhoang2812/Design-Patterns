public class Main {
    public static void main(String[] args) {

        Runningbehavior runningbehavior = new Chicken();
        Animal chicken = new Animal(runningbehavior);

        chicken.eat();
        System.out.printf(chicken.RunningPossibilies());
    }
}