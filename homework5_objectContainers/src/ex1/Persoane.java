package ex1;

/**
 *
 *
 */

public abstract class Persoane {
    int age;
    String name;

    /**
     * Abstract class Persoane
     *
     * @param age the age of our persons
     * @param name the name of our person
     */
    public Persoane(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name +
                " is age " + age;
    }
}