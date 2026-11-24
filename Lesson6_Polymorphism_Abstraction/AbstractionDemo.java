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