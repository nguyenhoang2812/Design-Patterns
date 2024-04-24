import animal.Animal;
import animal.Bird;
import animal.Cat;
import animal.Dog;

public class AnimalFactoryMethod {
    public Animal createAnimal(String type){
        if (type.equalsIgnoreCase("dog")){
            return new Dog();
        }
        else if (type.equalsIgnoreCase("cat")){
            return new Cat();
        }
        else throw new IllegalArgumentException("not valid animal's type");

    }
}
