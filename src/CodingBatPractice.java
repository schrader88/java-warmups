public class CodingBatPractice {
    public static void main(String[] args) {

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
            return a + b;
        }
    }


//    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return 21 - n;
        }
    }


//    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

    public boolean parrotTrouble(boolean talking, int hour) {
        return (hour < 7 || hour > 20) && talking;
    }


//    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10) {
            return true;
        } else if (a + b == 10) {
            return true;
        } else {
            return false;
        }
    }


//    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

    public boolean nearHundred(int n) {
        if (n >= 90 && n <= 110) {
            return true;
        } else if (n >= 190 && n <= 210) {
            return true;
        } else {
            return false;
        }
    }


//    Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a > 0 && b < 0) || (a < 0 && b > 0);
        }
    }


//    Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

    public String notString(String str) {
        String firstThreeChars;

        if (str.length() < 3) {
            firstThreeChars = "";
        } else {
            firstThreeChars =  str.substring(0,3);
        }

        if (firstThreeChars.equals("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }


//    Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

    public String missingChar(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.deleteCharAt(n);
        return stringBuilder.toString();
    }


//    Given a string, return a new string where the first and last chars have been exchanged.

    public String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }

        char[] ch = str.toCharArray();

        char temp = ch[0];
        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = temp;

        return String.valueOf(ch);
    }

//    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

    public String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        } else {
            char[] chars = str.toCharArray();
            String newStr = "" + chars[0] + chars[1] + chars[2] + "";
            return newStr + newStr + newStr;
        }
    }


//    Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

    public String backAround(String str) {
        char[] chars = str.toCharArray();

        return chars[chars.length - 1] + String.valueOf(chars) + chars[chars.length - 1];
    }


//    Return true if the given non-negative number is a multiple of 3 or a multiple of 5.

    public boolean or35(int n) {
        return (n % 5 == 0) || (n % 3 == 0);
    }


//    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

    public String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            return str.substring(0,2) + str + str.substring(0,2);
        }
    }


//    Given a string, return true if the string starts with "hi" and false otherwise.

    public boolean startHi(String str) {
        if (str.startsWith("hi")) {
            return true;
        } else {
            return false;
        }
    }


//    Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    public boolean icyHot(int temp1, int temp2) {
        if (temp1 > 100 && temp2 < 0) {
            return true;
        } else return temp2 > 100 && temp1 < 0;
    }


//    Given 2 int values, return true if either of them is in the range 10..20 inclusive.

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }


//    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }


//    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

//    public boolean loneTeen(int a, int b) {
//
//    }
}
