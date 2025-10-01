package Homework6;

public class Main {
    public static void main(String[] args) {
        final String eater = "Sanya";
        String meal = "glass";
        print(eater, meal);
        meal = "voda";
        print(eater, meal);
        meal = "sand";
        print(eater, meal);
        meal = "bruh";
        print(eater, meal);
        meal = "tea";
        print(eater, meal);
        meal = "salt";
        print(eater, meal);


    }

    private static void print(String eater, String meal1) {
        System.out.println(eater + " eats " + meal1 + " and was very sad");
    }


}
