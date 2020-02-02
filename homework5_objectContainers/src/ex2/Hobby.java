package ex2;

import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private List<Adress> adressList;

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
