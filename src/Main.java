import expression.exceptions.OverflowException;
import expression.exceptions.ParsingException;
import expression.parser.ExpressionParser;
import expression.parser.TripleParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите пример, допустимые операции: +, -, *, /, (, ), min, max, l0, t0. Допустимые переменные: x, y, z");

            String expression = scanner.nextLine();
            System.out.println("Введите x");
            int x = scanner.nextInt();
            System.out.println("Введите y");
            int y = scanner.nextInt();
            System.out.println("Введите z");
            int z = scanner.nextInt();
            TripleParser parser = new ExpressionParser();
            try {
                System.out.println("Результат: "+parser.parse(expression).evaluate(x, y, z));
            } catch (ParsingException e) {
                System.out.println("Проиошла ошибка при попытке распарсить вырежение:");
            } catch (OverflowException e) {
                System.out.println("Проиошла ошибка при попытке подсчитать выражение:");
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Произошла непредвиденная ошибка во время парсинга");
                System.out.println(e.getMessage());
            }
        } catch (IllegalArgumentException e){
            System.out.println("Ошибки ввода выражения или переменной (x,y,z должны быть типа int)");
        } catch (Exception e){
            System.out.println("Произошла непредвиденная ошибка во время парсинга");
        }
    }
}
