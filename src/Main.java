public class Main {
    public static void main(String[] args) {
        int ticketPrice = 123;   // стоимость билета
        int bonusMilePrice = 20;  // количество рублей для одной бонусной мили

        int bonus_mile = ticketPrice / bonusMilePrice; // количество бонусных миль
        System.out.println("Количество бонусных миль: " + bonus_mile);
    }
}
