public class main {
    public static void main(String[] args) {
    	Computer com1 = new Desktop("Intel Core i5", 3.2, 8, "HDD", 500, "ATX");
    	Computer com2 = new AIO("Intel Core i7", 4.0, 16, "SSD", 1000, "LED", 27.0, true, true);
    	Computer com3 = new Laptop("Intel Core i9", 2.8, 32, "802.11ac", 0, "IPS", null, 15.6, true, true);
    	System.out.println(com1.getDescription());
    	System.out.println();
    	System.out.println(com2.getDescription());
    	System.out.println();
    	System.out.println(com3.getDescription());
    }
}
