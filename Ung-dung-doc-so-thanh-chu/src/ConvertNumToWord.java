import java.util.Scanner;

public class ConvertNumToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int number;
            number = sc.nextInt();
            String result = null;

            if(number < 1000){
                result = number4(number);
            } else {
                result = "Out of range";
            }

            System.out.println(result);
        }
    }

    public static String number1 (int num){
        String word = null;
        switch (num){
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
        }
        return word;
    }
    public static String number2 (int num){
        String word = null;

        if(num < 10 && num > 0){
            word = number1(num);
        } else {
            switch (num){
                case 10:
                    word = "ten";
                    break;
                case 11:
                    word = "eleven";
                    break;
                case 12:
                    word = "twelve";
                    break;
                case 13:
                    word = "thirteen";
                    break;
                case 14:
                    word = "Fourteen";
                    break;
                case 15:
                    word = "Fifteen";
                    break;
                case 16:
                    word = "Sixteen";
                    break;
                case 17:
                    word = "Seven teen";
                    break;
                case 18:
                    word = "Eightteen";
                    break;
                case 19:
                    word = "Nineteen";
                    break;
            }
        }
        return word;
    }
    public static String number3 (int num){
        String word = null;
        if(num < 20){
            word = number2(num);
        } else {
            int tens = num / 10;
            int ones = num % 10;

            switch (tens) {
                case 2:
                    word = "Twenty ";
                    break;
                case 3:
                    word = "Thirty ";
                    break;
                case 4:
                    word = "Forty ";
                    break;
                case 5:
                    word = "Fifty ";
                    break;
                case 6:
                    word = "Sixty ";
                    break;
                case 7:
                    word = "Seventy ";
                    break;
                case 8:
                    word = "Eighty ";
                    break;
                case 9:
                    word = "Ninety ";
                    break;
            }
            if(ones != 0)
                word += number1(ones);
        }
        return word;
    }
    public static String number4 (int num){
        String word = null;
        if(num < 100){
            word = number3(num);
        } else {
            int divineBy100 = num / 100;
            int modulusBy100 = num % 100;
            word = number1(divineBy100) + " hundred ";
            if(modulusBy100 != 0)
                word += "and " + number3(modulusBy100);
        }
        return word;
    }
}

