/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

import java.io.FileNotFoundException;

/**
 * Roach colony class.
 */
public class RoachColony {
    private static final double GROWTH_RATE = 1.5;
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

    /**
     * This method is for the roach colony partying.
     *
     * @throws FileNotFoundException
     */
    public void party() throws FileNotFoundException {
        population *= GROWTH_RATE;
        RoachMotel motel = RoachMotel.getRoachMotel();
        motel.spray(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
