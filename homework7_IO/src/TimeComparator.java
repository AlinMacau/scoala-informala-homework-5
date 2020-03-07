import java.util.Comparator;

public class TimeComparator implements Comparator<Athlete> {

    public int compare(Athlete a1, Athlete a2) {
        if (a1.getSkiTimeResult().isAfter(a2.getSkiTimeResult())) return 1;
        if (a1.getSkiTimeResult().isBefore(a2.getSkiTimeResult())) return -1;
        else return 0;
    }

}
