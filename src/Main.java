public class Main {
    public static void main(String[] args) {
        int ticket_price = 123;   // стоимость билета
        int bonus_mile_price = 20;  // количество рублей для одной бонусной мили

        int bonus_mile = ticket_price / bonus_mile_price; // количество бонусных миль
        System.out.println(bonus_mile);
    }
}
