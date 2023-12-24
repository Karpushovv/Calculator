import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        CalculatorService service = new CalculatorService();

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа: ");

        String num1 = reader.next();
        Boolean isNum1Rome = service.isRomanNumber(num1);
        String num2 = reader.next();
        Boolean isNum2Rome = service.isRomanNumber(num2);
        service.isRomanNumber(num2);
        Integer num1ArabianFromRome = null;
        Integer num2ArabianFromRome = null;

        if (isNum1Rome == true & isNum2Rome != true) {
            throw new Exception("You gay bleat");
        }
        if (isNum1Rome != true & isNum2Rome == true) {
            throw new Exception("You dirty little");
        }

        if (isNum1Rome == true) {
            num1ArabianFromRome = service.fromRomeToArabian(num1);
        } else {
            num1ArabianFromRome = Integer.valueOf(num1);
        }
        if (isNum2Rome == true) {
            num2ArabianFromRome = service.fromRomeToArabian(num2);
        } else {
            num2ArabianFromRome = Integer.valueOf(num2);
        }

        System.out.print("\nВведите знак: ");

        Character sign = reader.next().charAt(0);
        Integer output = service.calculate(num1ArabianFromRome, num2ArabianFromRome, sign);
        String result = null;
        if (isNum1Rome == true) {
            result = service.getNameByArabicValue(output);
        } else {
            result = String.valueOf(output);
        }

        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + sign + " " + num2 + " = " + result);
    }
}