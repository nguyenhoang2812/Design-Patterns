package animal;

public class Bird implements TwoLegsAnimal{

    @Override
    public void makeSound() {
        System.out.println("chip chip ...");
    }
}
