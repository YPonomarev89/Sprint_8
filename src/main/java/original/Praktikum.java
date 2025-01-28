package original;

public class Praktikum {

    public static void main(String[] args) {
        // Пример строки для проверки
        String nameToCheck = "Тимоти Шаламе";

        // Создаем экземпляр класса Account
        Account account = new Account(nameToCheck);

        // Проверяем, можно ли напечатать имя на карте
        boolean isValid = account.checkNameToEmboss();

        // Выводим результат
        if (isValid) {
            System.out.println("Имя \"" + nameToCheck + "\" можно напечатать на карте.");
        } else {
            System.out.println("Имя \"" + nameToCheck + "\" не подходит для печати на карте.");
        }
    }
}
