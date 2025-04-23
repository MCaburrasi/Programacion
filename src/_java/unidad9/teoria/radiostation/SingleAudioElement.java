package _java.unidad9.teoria.radiostation;

public class SingleAudioElement extends AudioElement{
    private String fileName;
    private int duration;
    private int profit;

    public SingleAudioElement(String name, String fileName, int profit) {
        super(name);
        this.fileName = fileName;
        this.profit = profit;
    }

    public SingleAudioElement(String name, String fileName) {
        super(name);
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo: " + fileName);
    }

    @Override
    public int duration() {
        return duration;
    }

    @Override
    public int profit() {
        return profit;
    }
}
