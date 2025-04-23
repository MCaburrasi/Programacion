package _java.unidad9.teoria.radiostation;

public abstract class AudioElement {
    private String name;

    public AudioElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void play();
    public abstract int duration();
    public abstract int profit();

    @Override
    public String toString() {
        return "AudioElement{" + "name=" + name + '}';
    }
}
