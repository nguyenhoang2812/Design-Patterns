package decorator;

import base.IMilkTea;
import base.MilkTeaDecorator;

public class CoconutJelly extends MilkTeaDecorator {
    public CoconutJelly(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    @Override
    public double cost() {
        return 4 + super.cost();
    }
}
