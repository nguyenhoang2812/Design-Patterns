public class TurnOffCommand extends ILightCommand{
    Light light = new Light();

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void command() {
     light.off();
    }
}
