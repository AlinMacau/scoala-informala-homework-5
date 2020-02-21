package ex2;
/**
 * Hobby class keeps the name, frequency and adress list where they can be practiced
 *
 */

import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private List<Adress> adressList;

    /**
     * setting the atributes for Hobbies
     *
     * @param name of the hobby
     * @param frequency of the hobby practicing
     * @param adressList where it can be practiced
     */
    public void setHobbies(String name, int frequency, List <Adress> adressList) {
       this.name = name;
       this.frequency = frequency;
       this.adressList = adressList;
    }

    @Override
    public String toString() {
        return "hobby is " + name + " and the country where it can be practiced is" + adressList ;

    }
}
