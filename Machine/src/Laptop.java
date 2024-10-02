class Laptop extends Computer {
	private String wifiCardType;
	private String screenType;
	private double screenSize;
	private boolean isTouchScreen;
	private boolean hasSpeakers;
	private String secondaryStorageType;
	private int secondaryStorageCapacity;
	
	public Laptop(String cpuType, double cpuSpeed, int ramCapacity,String secondaryStorageType,int secondaryStorageCapacity,String wfifCardType, String screenType, double screenSize,boolean isTouchScreen,boolean hasSpeakers) {
			super(cpuType, cpuSpeed, ramCapacity);
			this.wifiCardType = wifiCardType;
			this.screenType = screenType;
			this.screenSize = screenSize;
			this.isTouchScreen = isTouchScreen;
			this.hasSpeakers = hasSpeakers;
			this.secondaryStorageCapacity = secondaryStorageCapacity;
			this.secondaryStorageType = secondaryStorageType;
			
		}
	@Override
	public String getDescription() {
	return "Laptop - CPU: " + getCpuType() + " " + getCpuSpeed() + " RAM: " + getRamCapacity() +" SecondaryStorage: "+secondaryStorageCapacity+" "+secondaryStorageType+ " WiFi Card: " + wifiCardType + " Screen: " + screenType + " " + screenSize + " inches, " + "Touchscreen: " + isTouchScreen + ", Speakers: " + hasSpeakers;
	}
	}

