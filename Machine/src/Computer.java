abstract class Computer {
    private String cpuType;
    private double cpuSpeed;
    private int ramCapacity;

    public Computer(String cpuType, double cpuSpeed, int ramCapacity) {
        this.cpuType = cpuType;
        this.cpuSpeed = cpuSpeed;
        this.ramCapacity = ramCapacity;
    }

    public abstract String getDescription();

    public String getcpuType() {
    		return cpuType;
    }
    public void SetcpuType(String cpuType) {
    	this.cpuType = cpuType;
    }
    public Double getcpuSpeed() {
		return cpuSpeed;
    }
    public void SetcpuSpeed(double cpuSpeed) {
    	this.cpuSpeed = cpuSpeed;
    }
    public int getramCapacity() {
		return ramCapacity;
    }
    public void SetramCapacity(int ramCapacity) {
    	this.ramCapacity = ramCapacity;
    }
}






