package myJavaStart.Dziedziczenie.paramorfizm.enumek.ZadanieStringi;

import java.util.Objects;

public class Computer {
    private String producent;
    private String model;

    @Override
    public String toString() {
        return "Computer{" +
                "producent='" + producent + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Computer(String producent, String model) {
        this.producent = producent;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(producent, computer.producent) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producent, model);
    }
}
