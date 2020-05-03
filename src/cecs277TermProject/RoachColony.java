package cecs277TermProject;

public class RoachColony {
    private String name;
    private int population;

    public RoachColony(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        // return String.format("RoachColony(name=%s, population=%d)", name, population);
        return name;
    }
}
