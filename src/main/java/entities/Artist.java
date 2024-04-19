package entities;

public class Artist {

    private long id;
    private String name;
    private String instrument;

    public Artist() {
    }

    public Artist(String name, String instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
