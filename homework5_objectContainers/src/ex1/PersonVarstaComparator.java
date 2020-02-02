package ex1;

import java.util.Comparator;

public class PersonVarstaComparator implements Comparator<Persoane> {
    @Override
    public int compare(Persoane p1, Persoane p2) {

        if (p1.getAge() < p2.getAge()) return 1;
        if (p1.getAge() > p2.getAge()) return -1;
        else return 0;


    }

}
