abstract class SmartDevice {

    String deviceName;

    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    abstract void activate();

    void showStatus() {
        System.out.println(deviceName + " is ready to use.");
    }
}
class SmartLight extends SmartDevice {

    SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    void activate() {
        showStatus();
        System.out.println(deviceName + " is now turned on.");
    }
}
class SmartSpeaker extends SmartDevice {

    SmartSpeaker(String deviceName) {
        super(deviceName);
    }

    @Override
    void activate() {
        showStatus();
        System.out.println(deviceName + " is now playing music.");
    }
}
public class AbstractionDemo {

    public static void main(String[] args) {

        SmartDevice device1 = new SmartLight("Living Room Light");
        SmartDevice device2 = new SmartSpeaker("Bedroom Speaker");

        System.out.println("SMART HOME DEVICE SYSTEM");
        System.out.println("=========================");
        System.out.println("Device Activation");
        System.out.println("-------------------------");

        device1.activate();

        System.out.println();

        device2.activate();

        System.out.println("-------------------------");
        System.out.println("All devices have been processed.");
    }
}