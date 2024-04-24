import animal.Animal;

public class FactoryMain {
    public static void main(String[] args) {
       AnimalFactoryMethod animalFactoryMethod = new AnimalFactoryMethod() ;
       Animal animal = animalFactoryMethod.createAnimal("Dog");

       animal.makeSound();
    }
}
