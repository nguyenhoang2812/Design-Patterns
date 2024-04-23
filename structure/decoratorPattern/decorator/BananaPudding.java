package decorator;

import base.IMilkTea;
import base.MilkTeaDecorator;

public class BananaPudding extends MilkTeaDecorator {
    public BananaPudding(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    @Override
    public double cost() {
        return 2d +  super.cost();
    }
}
