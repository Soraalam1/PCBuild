public class Monitor {

    private Resolution res;
    private String manufacturer;
    private String model;

    public Monitor(Resolution res, String manufacturer, String model) {
        this.res = res;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " " + " in color "+ color + "...");
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "res=" + res +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
