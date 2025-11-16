import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        System.out.println("В лесу лето!");

        System.out.println("Список зайцев:");

        System.out.println("В лесу зима!");

        System.out.println("Список зайцев:");
    }

}

class MountainHare {
    private int age;
    private double weight;
    private int jumpLength;
    private static String color = "серо-рыжий";
    private static String season = "лето";

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    public static String getColor() { return color; }
    public static String getSeason() { return season; }

    public static void setSeason(String newSeason) {
        season = newSeason;
        if ("зима".equalsIgnoreCase(newSeason)) {
            color = "белый";
        } else {
            color = "серо-рыжий";
        }
    }

    @Override
    public String toString() {
        return "Заяц-беляк: age=" + age + ", weight=" + weight + ", jumpLength=" + jumpLength + ", color=" + color + '.';
    }
}

class Forest {
    private ArrayList<MountainHare> hares;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}