public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13_676; //Цена билета
        int rubForBonusMiles = 20; //Количчество рублей необходимое для одной бонусной мили
        int bonusMiles = ticketPrice / rubForBonusMiles; //Количество бонусных миль
        System.out.println("Количество бонусных миль: " + bonusMiles);


    }
}