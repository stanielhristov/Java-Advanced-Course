package DefiningClassesExerciseOpinionPoll;

public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return name + " - " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
}
