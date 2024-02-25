public class Main {
    public static void main(String[] args) {

        // Начальная сумма на счету клиента
        int currentBalance = 100;

        // Сумма пополнения
        int refillAmount = 2000;

        // Рассчитываем бонусные рубли
        int bonus = 0;
        if (refillAmount > 1000) {
            bonus = refillAmount / 100; // По 1 рублю за каждые полные 100 рублей пополнения
        }

        // Общая сумма на счету с учетом бонусов
        int totalBalance = currentBalance + refillAmount + bonus;

        // Выводим результаты
        System.out.println("Итоговый счет: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}


