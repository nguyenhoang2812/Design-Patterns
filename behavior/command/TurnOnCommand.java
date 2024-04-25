public class TurnOnCommand extends ILightCommand{

    Light light = new Light();

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void command() {
     light.on();
    }
}
