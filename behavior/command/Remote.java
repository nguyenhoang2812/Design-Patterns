public class Remote {
    ILightCommand iLightCommand;

    public void setiLightCommand(ILightCommand iLightCommand) {
        this.iLightCommand = iLightCommand;
    }

    public void execute(){
      iLightCommand.command();
    }
}
