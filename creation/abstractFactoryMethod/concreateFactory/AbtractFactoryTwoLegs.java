package concreateFactory;

import animal.FourLegsAnimal;
import animal.TwoLegsAnimal;

public interface AbtractFactoryTwoLegs {
      TwoLegsAnimal getTwoLegsAnimal(String type) ;

}
