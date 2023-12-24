public class CalculatorService {
    public CalculatorService() {}
    public Integer calculate(Integer num1, Integer num2, Character sign) throws Exception {
        Integer output;

        switch(sign) {
            case '+': output = num1 + num2;
                return output;
            case '-': output = num1 - num2;
                return output;
            case '*': output = num1 * num2;
                return output;
            case '/': output = num1 / num2;
                return output;
            default:  System.out.printf("Некорректный знак");
                throw new Exception("Некорректный знак");
        }
    }
    public Integer fromRomeToArabian(String param){
        Dictionary value = Dictionary.valueOf(param);
        Integer result = value.getArabian();
       return result;
    }
    // Метод для получения имени элемента Enum по его арабскому значению
    public String getNameByArabicValue(Integer value) {
        for (Dictionary item : Dictionary.values()) {
            if (item.getArabian().equals(value)) {
                return item.name();
            }
        }
        return null; // или выбросить исключение, если элемент не найден
    }
    // Проверяем, является ли строка римским числом
    public Boolean isRomanNumber(String param) {
        try {
            Dictionary.valueOf(param);
            return true; // Если значение существует в перечислении, то это римское число.
        } catch (IllegalArgumentException e) {
            return false; // Если возникло исключение, значит строка не является римским числом.
        }
    }
}
