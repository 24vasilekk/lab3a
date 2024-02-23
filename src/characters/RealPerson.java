package characters;

public class RealPerson extends Person {

    public RealPerson(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }
}
