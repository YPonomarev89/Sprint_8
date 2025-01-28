package original;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // Проверка длины строки
        if (name.length() < 5 || name.length() > 19) {
            return false;
        }

        // Проверка, что в строке ровно один пробел
        int spaceIndex = name.indexOf(' ');
        if (spaceIndex == -1 || name.indexOf(' ', spaceIndex + 1) != -1) {
            return false;
        }

        // Проверка, что пробел не в начале и не в конце
        if (spaceIndex == 0 || spaceIndex == name.length() - 1) {
            return false;
        }

        return true;
    }
}
