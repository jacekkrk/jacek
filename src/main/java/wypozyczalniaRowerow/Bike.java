package wypozyczalniaRowerow;

public class Bike {
    private int uniqueId;
    private String type;
    private String colour;
    private String producer;
    private String model;
    private int yearProduction;
    private int numberSchifts;
    private static int numberBikes = 0;


    public Bike(String type, String colour, String producer, String model, int yearProduction, int numberSchifts) {
        this.type = type;
        this.colour = colour;
        this.producer = producer;
        this.model = model;
        this.yearProduction = yearProduction;
        this.numberSchifts = numberSchifts;
        numberBikes += 1;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public int getNumberSchifts() {
        return numberSchifts;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public void setNumberSchifts(int numberSchifts) {
        this.numberSchifts = numberSchifts;
    }

    public static void setNumberBikes(int numberBikes) {
        Bike.numberBikes = numberBikes;
    }

    public static int getNumberBikes() {
        return numberBikes;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }
}





