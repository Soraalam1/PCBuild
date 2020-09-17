public class Main {
    public static void main(String[] args) {
        PC DeansPC = new PC(
                new Case("200R","ASUS","EVGA 600",
                new Dimensions(16,9,20)),
        new Motherboard("LGA 1151","Gigabyte",4,3,"GB Bios"),
        new Monitor(new Resolution(1920,1080),"Acer","CB272"));

        DeansPC.description();

        System.out.println("\n" + "Now let me turn on the power button" + "\n" +"\n");
        DeansPC.powerUp();
    }
}
