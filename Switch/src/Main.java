public class Main {

    public static void main(String[] args) {

        char swVal = 'E';

        switch(swVal) {
            case 'A':
                System.out.println("A found");
                break;
            case 'B':
                System.out.println("B found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(swVal + " found");
                break;
            default:
                System.out.println("No match");
                break;
        }

        String month = "June";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }


    }

    public static void printNumberInWord(int num) {
        switch(num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }

    public static int getDaysInMonth (int month, int year) {
        if (month < 1 || month > 12)
            return -1;

        if (year < 1 || year > 9999)
            return -1;

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;

        }
    }

    public static boolean isOdd(int num) {
        if (num < 0)
            return false;

        if (num % 2 == 0)
            return false;
        return true;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || end < 0 || start < 0)
            return -1;

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int lastDigit;

        if (num < 0) {
            num *= -1;
        }

        int original = num;

        while (num > 0) {
            lastDigit = num % 10;
            reverse = (reverse*10) + lastDigit;

            num /= 10;
        }


        return reverse == original;

    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0)
            return -1;

        int firstDigit = 0, lastDigit = 0;

        lastDigit = num % 10;

        while (num >= 10) {
            num /= 10;
        }

        firstDigit = num;

        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;

        int sum = 0;
        int digit = 0;

        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }
}
