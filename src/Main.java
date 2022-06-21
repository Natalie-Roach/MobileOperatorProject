public class Main {
    public static void main(String[] args) {
        int initialAccount = 435; // рублей на счету клиента изначально
        int depositAmount = 1250; // сумма пополнения
        int finalAccount; // окончательный счет клиента
        int bonus; // бонус

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            finalAccount = initialAccount + depositAmount + bonus;
        } else {
            bonus = 0;
            finalAccount = initialAccount + depositAmount;
        }

        System.out.println("Итоговый счет клиента: " + finalAccount);
        System.out.println("Итоговый бонус клиента: " + bonus);

    }
}
