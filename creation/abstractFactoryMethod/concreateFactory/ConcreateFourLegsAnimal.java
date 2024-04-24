package concreateFactory;


import animal.FourLegsAnimal;
import animal.Fox;
import animal.Pig;

public class ConcreateFourLegsAnimal implements AbtractFactoryFourLegs {

    @Override
    public FourLegsAnimal getFourLegsAnimal(String type) {
        if (type.equalsIgnoreCase("fox")){
            return new Fox();
        }
        else if(type.equalsIgnoreCase("pig")){
            return new Pig();
        }
        else throw new IllegalArgumentException();
    }
}
