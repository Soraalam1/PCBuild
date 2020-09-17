public class PC {
    private Case tower;
    private Motherboard momBoard;
    private Monitor display;

    public PC(Case pcCase, Motherboard pcMotherboard, Monitor pcMonitor){
        this.tower = pcCase;
        this.momBoard = pcMotherboard;
        this.display = pcMonitor;
    }

    private void drawLogo(){
        display.drawPixelAt(960,540,"Blue");
    }

    public void description(){
        System.out.println("Welcome to Worst Buy, below is a description of the pc on sale " +
                "today:");
        System.out.println(tower.toString());
        System.out.println(momBoard.toString());
        System.out.println(display.toString());
    }

    public void powerUp(){
        tower.pressPowerButton();
        this.drawLogo();
        momBoard.loadProgram("Zoom");
    }

    @Override
    public String toString() {
        return "This PC has a" +
                "tower=" + tower +
                ", momBoard=" + momBoard +
                ", display=" + display +
                '}';
    }
}
