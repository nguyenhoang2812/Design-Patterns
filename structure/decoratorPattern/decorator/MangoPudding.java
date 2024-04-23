package decorator;

import base.IMilkTea;
import base.MilkTeaDecorator;

public class MangoPudding extends MilkTeaDecorator {
    public MangoPudding(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    @Override
    public double cost() {
        return 3 + super.cost();
    }
}
