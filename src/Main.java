import characters.FairyPerson;
import characters.RealPerson;
import other.Drink;
import other.Room;

public class Main {
    public static void main(String[] args) {
        RealPerson malish = new RealPerson("Малыш", 10);
        RealPerson frekenBok = new RealPerson("Фрекен Бок", 60);
        RealPerson uncleJulius = new RealPerson("Дядя Юлиус", 30);
        FairyPerson karlson = new FairyPerson("Карлсон", 50, "Умеет летать со скоростью света");

        uncleJulius.toStayBehind(frekenBok);
        frekenBok.toSay("Конечно, это тоже способна понять, если как следует подумаю");
        frekenBok.toThinkAbout("Вот бы эти сказочные существа мешали мне пить кофе с дядей Юлиусом");
        frekenBok.toTakeAway(uncleJulius, Room.LivingRoom);

        malish.toDoSomething("оказался перед закрытой дверью");
        karlson.toDoSomething("оказался перед закрытой дверью");

        frekenBok.toDrink(Drink.Coffee);
        uncleJulius.toDrink(Drink.Coffee);

        malish.toThinkAbout("и смотреть в глазок было не очень-то весело");
        karlson.toThinkAbout("и смотреть в глазок было не очень-то весело");
    }
}