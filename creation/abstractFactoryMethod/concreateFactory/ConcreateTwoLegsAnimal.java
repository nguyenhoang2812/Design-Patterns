package concreateFactory;


import animal.*;

public class ConcreateTwoLegsAnimal implements AbtractFactoryTwoLegs {

    @Override
    public TwoLegsAnimal getTwoLegsAnimal(String type) {
        if (type.equalsIgnoreCase("bird")){
            return new Bird();
        }
        else if(type.equalsIgnoreCase("goose")){
            return new Goose();
        }
        else throw new IllegalArgumentException();
    }
}
