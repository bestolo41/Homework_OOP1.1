public class Main {
    public static void main(String[] args) {

        Person maxim = new Person("Максим", 1988, "Минск", "Бренд-менеджер");
        Person anya = new Person("Аня", 1993, "Москва", "Методист образовательных программ");
        Person katya = new Person("Катя", 1992, "Калининград", "Продакт-менеджер");
        Person artem = new Person("Артем", 1995, "Москва", "Директор по развитию бизнеса");

        maxim.acquaintance();
        anya.acquaintance();
        katya.acquaintance();
        artem.acquaintance();
    }
}