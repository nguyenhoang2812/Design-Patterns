import base.IMilkTea;
import base.MilkTea;
import base.MilkTeaDecorator;
import decorator.BananaPudding;
import decorator.Bubble;
import decorator.CoconutJelly;
import decorator.MangoPudding;




public class MainDecorator {
    public static void main(String[] args) {
        IMilkTea iMilkTea = new MilkTea();

        MilkTeaDecorator zero = new BananaPudding(iMilkTea);

        MilkTeaDecorator milkTeaDecorator = new BananaPudding(new Bubble(new CoconutJelly(new MangoPudding(iMilkTea))));
        System.out.println(milkTeaDecorator.cost());
    }
}
