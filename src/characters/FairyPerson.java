package characters;

public class FairyPerson extends Person {
    private String superPowerDescription;
    public FairyPerson(String name, int age, String superPowerDescription) {
        super(name, age);
        this.superPowerDescription = superPowerDescription;
    }

    @Override
    public String toString() {
        return "FairyPerson{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() + '\'' +
                ", superPowerDescription='" + superPowerDescription + '\'' +
                '}';
    }
}
