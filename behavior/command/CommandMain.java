public class CommandMain {
    public static void main(String[] args) {

        Light light = new Light();

        // Tạo các đối tượng Command cụ thể
        ILightCommand lightOn = new TurnOnCommand(light);
        ILightCommand lightOff = new TurnOffCommand(light);

        // Tạo điều khiển từ xa và thiết lập Command cho nó
        Remote remote = new Remote();

        remote.setiLightCommand(lightOn);
        remote.execute(); // Output: Light is on


        remote.setiLightCommand(lightOff);
        remote.execute(); // Output: Light is off
    }
}
