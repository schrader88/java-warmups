public class CodingBatPractice {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(monkeyTrouble(true, true));

    }


//    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }


//    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && !bSmile) {
            return false;
        } else if (!aSmile && bSmile) {
            return false;
        } else {
            return true;
        }
    }


//    Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else {
            return a * b;
        }
    }

}
