import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));

        /*String[] tests = {"4 + 8", "IV * VIII",
                "X + 8",
                "5 +- 5",
                "5  * 5",
                "5 + 5 * 5",
                "5+5",
                "5 % 5"};
        for(String test : tests)
        {
            try {System.out.println(calc(test));}
            catch (Exception e){System.out.println("Exception");}
        }*/
    }

    public static String calc(String input) throws Exception
    {
        String[] parts = input.split(" ");
        if (parts.length != 3)
        {
            throw new Exception();
        }
        try {
            int firstNumb = checkValue(parts[0]);
            int secondNumb = checkValue(parts[2]);

            if (parts[1].length() == 1) {
                if (firstNumb < 11 && secondNumb < 11)
                {
                    if (parts[1].charAt(0) == '+') {return firstNumb + secondNumb + "";}
                    if (parts[1].charAt(0) == '-') {return firstNumb - secondNumb + "";}
                    if (parts[1].charAt(0) == '*') {return firstNumb * secondNumb + "";}
                    if (parts[1].charAt(0) == '/') {return firstNumb / secondNumb + "";}
                    throw new Exception();
                }
                if (firstNumb > 10 && secondNumb > 10)
                {
                    firstNumb -= 10;
                    secondNumb -= 10;
                    if (parts[1].charAt(0) == '+') {return romaninConverter(firstNumb + secondNumb);}
                    if (parts[1].charAt(0) == '-') {return romaninConverter(firstNumb - secondNumb);}
                    if (parts[1].charAt(0) == '*') {return romaninConverter(firstNumb * secondNumb);}
                    if (parts[1].charAt(0) == '/') {return romaninConverter(firstNumb / secondNumb);}
                    throw new Exception();
                }
            }
            throw new Exception();
        }
        finally {}

    }

    //Если введенное число не подходит выкинет исключение
    //Римские числа на 10 больше для выделения от арабских
    public static int checkValue(String value) throws Exception
    {
        switch (value)
        {
            case ("1"): return 1;
            case ("2"): return 2;
            case ("3"): return 3;
            case ("4"): return 4;
            case ("5"): return 5;
            case ("6"): return 6;
            case ("7"): return 7;
            case ("8"): return 8;
            case ("9"): return 9;
            case ("10"): return 10;

            case ("I"): return 11;
            case ("II"): return 12;
            case ("III"): return 13;
            case ("IV"): return 14;
            case ("V"): return 15;
            case ("VI"): return 16;
            case ("VII"): return 17;
            case ("VIII"): return 18;
            case ("IX"): return 19;
            case ("X"): return 20;

        }
        throw new Exception();
    }


    //Конвертер (индекс равен значению)
    public static String romaninConverter(int numb) throws Exception
    {
        if (numb < 1)
            throw new Exception();
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII",
                "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII",
                "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX",
                "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI",
                "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI",
                "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI",
                "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        return roman[numb];
    }
}
