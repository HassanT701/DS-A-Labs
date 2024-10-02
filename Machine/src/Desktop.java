public class Desktop extends Computer{
private String secondaryStorageType;
private int secondaryStorageCapacity;
private String formFactor;


public Desktop(String cpuType, double cpuSpeed, int ramCapacity, String secondaryStorageType, int secondaryStorageCapacity,String formFactor) {
super(cpuType, cpuSpeed, ramCapacity);
this.formFactor = formFactor;
this.secondaryStorageCapacity = secondaryStorageCapacity;
this.secondaryStorageType = secondaryStorageType;
}


@Override
public String getDescription() {
return "Desktop - CPU: " + getCpuType() + " " + getCpuSpeed() + " RAM: " + getRamCapacity() + " Secondary Drive: " + secondaryStorageType + " " + secondaryStorageCapacity + " Form Factor: " + formFactor;
}

}


