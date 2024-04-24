import animal.FourLegsAnimal;
import concreateFactory.AbtractFactoryFourLegs;
import concreateFactory.AbtractFactoryTwoLegs;
import concreateFactory.ConcreateFourLegsAnimal;
import concreateFactory.ConcreateTwoLegsAnimal;

public class AbstractFactoryMethodMain {
    public static void main(String[] args) {
       String type = "Goose";
       String type1 = "fox";
       AbtractFactoryTwoLegs abtractFactoryTwoLegs = new ConcreateTwoLegsAnimal();
       AbtractFactoryFourLegs abtractFactoryFourLegs = new ConcreateFourLegsAnimal();

       abtractFactoryFourLegs.getFourLegsAnimal(type1);

        FourLegsAnimal fourLegsAnimal = abtractFactoryFourLegs.getFourLegsAnimal(type1);
        fourLegsAnimal.makeSound();

    }
}
