package characters;

import interfaces.*;
import other.Drink;
import other.Room;

import java.util.Objects;

public abstract class Person implements IDrink, IThink, ISay, IDoSomething, IStand, ITakeAway {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void toDrink(Drink drink) {
        System.out.println(this.name + " пьет " + drink.getDescription().toLowerCase() + " " + drink.getName().toLowerCase() + "\n");
    }

    @Override
    public void toSay(String phrase) {
        System.out.println(this.name + " говорит:\n" + "-" + phrase + "\n");
    }

    @Override
    public void toThinkAbout(String something) {
        System.out.println(this.name + " думает: " + something + "\n");
    }

    @Override
    public void toThinkAbout(Person person) {
        System.out.println(this.name + " думает о " + person.getName() + "\n");
    }

    @Override
    public void toDoSomething(String action) {
        System.out.println(this.getName() + " " + action + "\n");
    }

    @Override
    public void toStand() {
        System.out.println(this.name + " стоит" + "\n");
    }

    @Override
    public void toStayBehind(Person person) {
        System.out.println(this.name + " стоит за " + person.getName() + "\n");
    }

    @Override
    public void toTakeAway(Person person, Room room) {
        System.out.println(this.getName() + " уводит " + person.getName() + " в " + room.getName() + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
