package java.edu.rit.sse.brickhack;

/**
 * Created by Melissa Laskowski on 3/5/2016.
 *
 * the main base for a character tamogatchi
 */
public abstract class Character {

    //0 to 10 number part of the stats bar
    int health_stat;
    int hungry_stat;
    int clean_stat;
    int fun_stat;

    //their current experience level
    int experience_level;

    /**
     * getter for the health stats
     * @return an int between 0-10 that is how much
     */
    public int getHealth_stat(){
        return health_stat;
    }

    /**
     *getter for the hungry stat bar
     * @return an int between 1 -10
     */
    public int getHungry_stat(){
        return hungry_stat;
    }
    /**
     *getter for the clean stat bar
     * @return an int between 1 -10
     */
    public int getClean_stat(){
        return clean_stat;
    }
    /**
     *getter for the fun stat bar
     * @return an int between 1 -10
     */
    public int getFun_stat(){
        return fun_stat;
    }


    public int calcGeneral_stat(){
        double total = fun_stat + clean_stat + hungry_stat + health_stat;
        total = total/4;
        return (int)total;
    }
    /**
     * calculates the correct stat and returns it
     * @return
     */
    public int getGeneral_stat() {

        return calcGeneral_stat();
    }
}
