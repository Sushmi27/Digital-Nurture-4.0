package BuilderPattern;

public class Main {
    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .build();

        Computer officePC = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("512GB HDD")
                .build();

        System.out.println("Gaming PC Configuration:");
        gamingPC.showConfig();

        System.out.println("\nOffice PC Configuration:");
        officePC.showConfig();
    }
}