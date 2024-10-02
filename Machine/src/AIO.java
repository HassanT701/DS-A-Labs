public class AIO extends Computer{
private String secondaryStorageType;
private int secondaryStorageCapacity;
private String screenType;
private double screenSize;
private boolean isTouchScreen;
private boolean hasSpeakers;

public AIO(String cpuType, double cpuSpeed, int ramCapacity, String secondaryStorageType, int secondaryStorageCapacity, String screenType, double screenSize, boolean isTouchScreen, boolean hasSpeakers) {
super(cpuType, cpuSpeed, ramCapacity);
this.secondaryStorageType = secondaryStorageType;
this.secondaryStorageCapacity = secondaryStorageCapacity;
this.screenType = screenType;
this.screenSize = screenSize;
this.isTouchScreen = isTouchScreen;
this.hasSpeakers = hasSpeakers;
}
@Override
public String getDescription() {
return "AIO Desktop - CPU: " + getCpuType() + " " + getCpuSpeed() + " RAM: " + getRamCapacity() + " Secondary Storage: " + secondaryStorageType + " " + secondaryStorageCapacity + "GB, " + "Screen: " + screenType + " " + screenSize + " inches, Touchscreen: " + isTouchScreen + ", Speakers: " + hasSpeakers;
}

}



