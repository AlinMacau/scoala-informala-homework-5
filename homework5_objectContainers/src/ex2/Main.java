package ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Country Romania = new Country();
        Romania.setCountries("Romania", "1");
        Country Ungaria = new Country();
        Ungaria.setCountries("Ungaria", "2");
        Country Bulgaria = new Country();
        Bulgaria.setCountries("Bulgaria", "3");

        Adress adress1 = new Adress();
        adress1.setAdress("Str Romaniei", Romania);
        Adress adress2 = new Adress();
        adress2.setAdress("Str Ungariei", Ungaria);
        Adress adress3 = new Adress();
        adress3.setAdress("Str Bulgariei", Bulgaria);

        Hobby football = new Hobby();
        football.setHobbies("Football", 5, Collections.singletonList(adress1));
        Hobby volley = new Hobby();
        volley.setHobbies("Voleyball", 3, Arrays.asList(adress1, adress2));
        Hobby cycling = new Hobby();
        cycling.setHobbies("Cycling", 7, Arrays.asList(adress1, adress2, adress3));

        Persoana Alin = new Persoana();
        Alin.setName("Alin");
        Persoana Alex = new Persoana();
        Alex.setName("Alex");
        Persoana Nicu = new Persoana();
        Nicu.setName("Nicu");

        Map<Persoana, List<Hobby>> hobbiesMap = new HashMap<>();
        hobbiesMap.put(Alin, new ArrayList<>(Arrays.asList(football, volley)));
        hobbiesMap.put(Alex, new ArrayList<>(Arrays.asList(volley, cycling)));
        hobbiesMap.put(Nicu, new ArrayList<>(Arrays.asList(football, volley, cycling)));

        showHobbies(hobbiesMap, Alex);
        showHobbies(hobbiesMap, Alin);
        showHobbies(hobbiesMap, Nicu);
    }

    private static void showHobbies(Map<Persoana, List<Hobby>> map, Persoana p) {
        for (Hobby h : map.get(p)) {
            System.out.println(p.getName() + "'s " + h.toString());
        }
    }
}



