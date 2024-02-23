package other;

public enum Drink {
    Coffee("Кофе", "горячий"),
    Lemonade("Лимонад", "холодный");
    private String name;
    private String description;
    Drink(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
