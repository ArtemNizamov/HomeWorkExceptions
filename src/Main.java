import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        boolean result = ValidatorService.validate("java_skypro","D_1hWiKjjP_9", "D_1hWiKjjP_9");
        if (result) {
            System.out.println("Проверка прошла успешно");
        } else {
            System.out.println("Проверка не прошла");

        }
    }
}