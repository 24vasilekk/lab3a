package other;

public enum Room {
    LivingRoom("Гостиная", "большая"),
    Kitchen("Кухня", "маленькая");
    private String name;
    private String size;
    Room(String name, String size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
