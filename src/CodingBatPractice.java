import java.util.ArrayList;
import java.util.List;

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
            firstThreeChars = str.substring(0, 3);
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
            return str.substring(0, 2) + str + str.substring(0, 2);
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

    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b < 13 || b > 19)) {
            return true;
        } else return (b >= 13 && b <= 19) && (a < 13 || a > 19);
    }


//    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

    public String delDel(String str) {
        if ((str.length() > 3) && (str.substring(1, 4).equals("del"))) {
            return str.replace("del", "");
        } else {
            return str;
        }
    }


//    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

    public boolean mixStart(String str) {
        return (str.length() > 2) && (str.substring(1, 3).equals("ix"));
    }


//    Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

    public String startOz(String str) {
        if (str.startsWith("o")) {
            if (str.length() > 1 && str.charAt(1) == 'z') {
                return "oz";
            } else {
                return "o";
            }
        } else if (str.length() > 1 && str.charAt(1) == 'z') {
            return "z";
        } else {
            return "";
        }
    }


//    Given three int values, a b c, return the largest.

    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

//    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

    public int close10(int a, int b) {
        int aDifference = Math.abs(a - 10);
        int bDifference = Math.abs(b - 10);
        if (aDifference > bDifference) {
            return b;
        } else if (bDifference > aDifference) {
            return a;
        } else {
            return 0;
        }
    }


//    Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            return true;
        } else if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
            return true;
        } else {
            return false;
        }
    }


//    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

    public int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            if (a > b) {
                return a;
            } else if (a < b) {
                return b;
            }
        } else if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        }

        return 0;
    }


//    Return true if the given string contains between 1 and 3 'e' chars.

    public boolean stringE(String str) {
        char[] charArr = str.toCharArray();
        int accumulator = 0;
        for (char character : charArr) {
            if (character == 'e') {
                accumulator++;
            }
        }

        return accumulator >= 1 && accumulator <= 3;
    }


//    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

    public boolean lastDigit(int a, int b) {
        int first = a % 10;
        int second = b % 10;
        return first == second;
    }

//    Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

    public String endUp(String str) {
        if (str.length() >= 3) {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        } else {
            return str.toUpperCase();
        }
    }


//    Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

    public String everyNth(String str, int n) {
        char[] chars = str.toCharArray();
        String newString = "";
        for (int i = 0; i < chars.length; i += n) {
            newString += chars[i];
        }
        return newString;
    }


//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    public String stringTimes(String str, int n) {
        String outputString = "";
        for (int i = 0; i < n; i++) {
            outputString += str;
        }
        return outputString;
    }

//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

    public String frontTimes(String str, int n) {
        if (str.length() <= 3) {
            String outputThreeOrLess = "";
            for (int i = 0; i < n; i++) {
                outputThreeOrLess += str;
            }
            return outputThreeOrLess;
        } else {
            String output = "";
            for (int i = 0; i < n; i++) {
                output += str.substring(0, 3);
            }
            return output;
        }
    }


//    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count = count + 1;
            }
        }
        return count;
    }

//    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

    boolean doubleX(String str) {
        int indexOfX = str.indexOf("x");

        if (indexOfX == -1) {
            return false;
        }

        String twoX = str.substring(indexOfX);
        return twoX.startsWith("xx");
    }


//    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

    public String stringBits(String str) {
        String stringBuilder = "";
        for (int i = 0; i < str.length(); i += 2) {
            stringBuilder += str.charAt(i);
        }
        return stringBuilder;
    }


//    Given a non-empty string like "Code" return a string like "CCoCodCode".

    public String stringSplosion(String str) {
        String stringBuilder = "";
        for (int i = 0; i <= str.length(); i++) {
            stringBuilder += str.substring(0, i);
        }
        return stringBuilder;
    }


//    Given an array of ints, return the number of 9's in the array.

    public int arrayCount9(int[] nums) {
        int accumulator = 0;
        for (int num : nums) {
            if (num == 9) {
                accumulator++;
            }
        }
        return accumulator;
    }


//    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

    public boolean arrayFront9(int[] nums) {
        if (nums.length > 4) {
            for (int i = 0; i < 4; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        } else {
            for (int num : nums) {
                if (num == 9) {
                    return true;
                }
            }
        }
        return false;
    }


//    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

//    IN PROGRESS IN PROGRESS IN PROGRESS IN PROGRESS IN PROGRESS IN PROGRESS IN PROGRESS IN PROGRESS IN PROGRESS

//    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

//    public int stringMatch(String a, String b) {
//
//    }

//    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

    public String stringX(String str) {
        String stringBuilder = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                stringBuilder = stringBuilder + str.substring(i, i + 1);
            }

//            if (chars[i] == chars[0] || chars[i] == chars[chars.length - 1]) {
//                stringBuilder = stringBuilder + chars[i];
//            } else if (chars[i] != 'x') {
//                stringBuilder = stringBuilder + chars[i];
//            } else {
//                stringBuilder += "";
//            }
        }
        return stringBuilder;
    }


//    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

    public String altPairs(String str) {
        String stringBuilder = "";

        for (int i = 0; i < str.length(); i += 4) {
            int last = i + 2;
            if (last > str.length()) {
                last = str.length();
            }
            stringBuilder = stringBuilder + str.substring(i, last);
        }

        return stringBuilder;
    }


//    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

    public String stringYak(String str) {
        return str.replace("yak", "");
    }


//    Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

    public int array667(int[] nums) {
        int accumulator = 0;

        for (int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    accumulator++;
                }
            }
        }
        return accumulator;
    }

//    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1]) {
                if (nums[i + 1] == nums[i + 2]) {
                    return false;
                }
            }
        }
        return true;
    }


//    Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == (nums[i] + 5) && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }

//    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.

//    Notes: Need to fix edge case: makeBricks(3, 2, 9)

    public boolean makeBricks(int small, int big, int goal) {
        int newBig = big * 5;

        if (small + newBig >= goal) {
            if (((goal - small) % 5) == 0) {
                return true;
            } else if (Math.abs(newBig - goal) < small) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }


//    Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

//    IN PROGRESS  //

    public int loneSum(int a, int b, int c) {
        int accumulator = 0;

        if (a != b && a != c) {
            accumulator += a;
        } else if (b != a && b != c) {
            accumulator += b;
        } else if (c != a && c != b) {
            accumulator += c;
        }

        return accumulator;
    }


//    Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

    public int luckySum(int a, int b, int c) {
        int[] arrayOfNums = new int[]{a, b, c};
        int accumulator = 0;

        for (int num : arrayOfNums) {
            if (num != 13) {
                accumulator += num;
            } else {
                break;
            }
        }
        return accumulator;
    }

//    Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

    public int noTeenSum(int a, int b, int c) {
        int[] nums = new int[]{a, b, c};
        int accumulator = 0;

        for (int num : nums) {
            accumulator += fixTeen(num);
        }

        return accumulator;
    }

    public int fixTeen(int n) {
        if (n >= 13 && n <= 19) {
            if (n != 15 && n != 16) {
                n = 0;
            }
            return n;
        }
        return n;
    }


//    For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        int a = (num / 10) * 10;
        int b = a + 10;

        return (num - a >= b - num) ? b : a;
    }


//    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && (Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2)) {
            return true;
        } else if (Math.abs(a - c) <= 1 && (Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2)) {
            return true;
        }
        return false;
    }


//    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

//    Unknown edge cases fail. Want to rewrite stronger code here.

    public int blackjack(int a, int b) {
        if ((Math.abs(a - 21) < Math.abs(b - 21))) {
            if (a <= 21) {
                return a;
            } else if (b <= 21) {
                return b;
            }
        } else if ((Math.abs(b - 21) < Math.abs(a - 21))) {
            if (b <= 21) {
                return b;
            } else if (a <= 21) {
                return a;
            }
        }

        return 0;
    }


//    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

    public int makeChocolate(int small, int big, int goal) {
        int valueOfBig = big * 5;

        if (goal < 10 && goal >= 5) {
            valueOfBig = 5;
        } else if (goal < 5) {
            valueOfBig = 0;
        }

        int goalMinusBig = goal - valueOfBig;

        if (small >= goalMinusBig) {
            return goalMinusBig;
        } else {
            return -1;
        }
    }


//    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


//    We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }


//    The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.

    public int fibonacci(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


//    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            return 2 + bunnyEars2(bunnies - 1);
        }
    }


//    We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.

    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }

        return rows + triangle(rows - 1);
    }


//    Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

//    WORK IN PROGRESS

//    public int sumDigits(int n) {
//
//    }


//    Given a list of integers, return a list where each integer is multiplied by 2.

    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>();

        for (int num : nums) {
            num *= 2;
            newNums.add(num);
        }
        return newNums;
    }


//    Given a list of integers, return a list where each integer is multiplied with itself.

    public List<Integer> square(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>();

        for (int num : nums) {
            num *= num;
            newNums.add(num);
        }
        return newNums;
    }


//    Given a list of strings, return a list where each string has "*" added at its end.

    public List<String> addStar(List<String> strings) {
        List<String> newStrings = new ArrayList<>();

        for (String string : strings) {
            string = string + "*";
            newStrings.add(string);
        }
        return newStrings;
    }


//    Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.

    public List<String> copies3(List<String> strings) {
        List<String> newStrings = new ArrayList<>();

        for (String string : strings) {
            string = string + string + string;
            newStrings.add(string);
        }
        return newStrings;
    }

//    Given a list of strings, return a list where each string has "y" added at its start and end.

    public List<String> moreY(List<String> strings) {
        List<String> newStrings = new ArrayList<>();

        for (String string : strings) {
            string = "y" + string + "y";
            newStrings.add(string);
        }
        return newStrings;
    }


//    Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

    public List<Integer> math1(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>();

        for (Integer num : nums) {
            num += 1;
            num *= 10;
            newNums.add(num);
        }
        return newNums;
    }


//    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

    public List<Integer> rightDigit(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>();

        for (Integer num : nums) {
            num = num % 10;
            newNums.add(num);
        }
        return newNums;
    }


//    Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

    public List<String> lower(List<String> strings) {
        List<String> newStrings = new ArrayList<>();

        for (String string : strings) {
            newStrings.add(string.toLowerCase());
        }

        return newStrings;
    }


//    Given a list of strings, return a list where each string has all its "x" removed.

    public List<String> noX(List<String> strings) {
        List<String> newStrings = new ArrayList<>();

        for (String string : strings) {
            newStrings.add(string.replaceAll("x", ""));
        }
        return newStrings;
    }


//    Given a list of integers, return a list of the integers, omitting any that are less than 0.

    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>();

        for (Integer num : nums) {
            if (num > 0) {
                newNums.add(num);
            }
        }
        return newNums;
    }


//    Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

    public List<Integer> no9(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 10 != 9) {
                newNums.add(num);
            }
        }
        return newNums;
    }


//    Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

    public List<Integer> noTeen(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>();

        for (Integer num : nums) {
            if (num < 13 || num > 19) {
                newNums.add(num);
            }
        }
        return newNums;
    }


//    Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)

    public List<String> noZ(List<String> strings) {
        List<String> newStrings = new ArrayList<>();

        for (String string : strings) {
            if (!string.contains("z")) {
                newStrings.add(string);
            }
        }
        return newStrings;
    }


//    Given a list of strings, return a list of the strings, omitting any string length 4 or more.

    public List<String> noLong(List<String> strings) {
        List<String> newStrings = new ArrayList<>();

        for (String string : strings) {
            if (string.length() <= 3) {
                newStrings.add(string);
            }
        }
        return newStrings;
    }


//    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

    public List<String> no34(List<String> strings) {
        List<String> newStrings = new ArrayList<>();

        for (String string : strings) {
            if (string.length() < 3 || string.length() > 4) {
                newStrings.add(string);
            }
        }
        return newStrings;
    }


//    Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.

    public List<String> noYY(List<String> strings) {
        List<String> newStrings = new ArrayList<>();
        String stringWithY;

        for (String string : strings) {
            stringWithY = string + "y";
            if (!stringWithY.contains("yy")) {
                newStrings.add(stringWithY);
            }
        }
        return newStrings;
    }


//    Given a string, return a string where for every char in the original, there are two chars.

    public String doubleChar(String str) {
        char[] characters = str.toCharArray();
        String stringBuilder = "";

        for (char character : characters) {
            stringBuilder += character + "" + character;
        }
        return stringBuilder;
    }

//    Return the number of times that the string "hi" appears anywhere in the given string.

    public int countHi(String str) {
        char[] characters = str.toCharArray();
        int accumulator = 0;

        for (int i = 0; i < characters.length - 1; i++) {
            if (characters[i] == 'h' && characters[i + 1] == 'i') {
                accumulator++;
            }
        }
        return accumulator;
    }


//    Return true if the string "cat" and "dog" appear the same number of times in the given string.

    public boolean catDog(String str) {
        int catAccumulator = 0;
        int dogAccumulator = 0;
        char[] characters = str.toCharArray();

        for (int i = 0; i < characters.length - 2; i++) {
            if (characters[i] == 'c' && characters[i + 1] == 'a' && characters[i + 2] == 't') {
                catAccumulator++;
            } else if (characters[i] == 'd' && characters[i + 1] == 'o' && characters[i + 2] == 'g') {
                dogAccumulator++;
            }
        }

        return catAccumulator == dogAccumulator;
    }


//    Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    public int countCode(String str) {
        int accumulator = 0;
        char[] characters = str.toCharArray();

        for (int i = 0; i < characters.length - 3; i++) {
            if (characters[i] == 'c' && characters[i + 1] == 'o' && characters[i + 3] == 'e') {
                accumulator++;
            }
        }
        return accumulator;
    }


//    Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

    public boolean endOther(String a, String b) {
        if (a.toLowerCase().endsWith(b.toLowerCase())) {
            return true;
        } else return b.toLowerCase().endsWith(a.toLowerCase());
    }


//    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

    public boolean xyzThere(String str) {
        char[] characters = str.toCharArray();

        for (int i = 0; i < characters.length - 2; i++) {
            if (characters[i] == 'x' && characters[i + 1] == 'y' && characters[i + 2] == 'z') {
                if (characters[i] == characters[0] || characters[i - 1] != '.') {
                    return true;
                }
            }
        }
        return false;
    }


//    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    public boolean bobThere(String str) {
        char[] characters = str.toCharArray();

        for (int i = 0; i < characters.length - 2; i++) {
            if (characters[i] == 'b' && characters[i + 2] == 'b') {
                return true;
            }
        }
        return false;
    }


//    We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

    public boolean xyBalance(String str) {
        char[] characters = str.toCharArray();
        int xIndex = -1;
        int yIndex = -1;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == 'x') {
                xIndex = i;
            }
            if (characters[i] == 'y') {
                yIndex = i;
            }
        }

        return xIndex < yIndex || xIndex == -1;
    }


//    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

    public String mixString(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        String stringBuilder = "";
        int length = Math.max(aChars.length, bChars.length);

        for (int i = 0; i < length; i++) {
            if (aChars.length >= i) {
                stringBuilder += aChars[i];
            }
            if (bChars.length >= i) {
                stringBuilder += bChars[i];
            }
        }
        return stringBuilder;
    }


//    Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

    public String repeatEnd(String str, int n) {
        String stringBuilder = "";

        for (int i = 0; i < n; i++) {
            stringBuilder += str.substring(str.length() - n);
        }
        return stringBuilder;
    }


//    Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

    public String repeatFront(String str, int n) {
        String stringBuilder = "";
        int newN = n;

        for (int i = 0; i < n; i++) {
            stringBuilder += str.substring(0, newN);
            newN -= 1;
        }
        return stringBuilder;
    }


//    Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

    public String repeatSeparator(String word, String sep, int count) {
        String stringBuilder = "";

        if (count != 0) {
            stringBuilder += word;
        }

        for (int i = 0; i < count - 1; i++) {
            stringBuilder += sep + word;
        }
        return stringBuilder;
    }


//    Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        String end = str.substring(n);

        return end.contains(prefix);
    }


//    A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if ((last != -1) && (first != last)) {
            return str.substring(first + 5, last);
        } else {
            return "";
        }
    }


//    Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

    public boolean sameStarChar(String str) {
        char[] characters = str.toCharArray();

        for (int i = 1; i < characters.length - 1; i++) {
            if (characters[i] == '*' && characters[i - 1] != characters[i + 1]) {
                return false;
            }
        }
        return true;
    }


//    Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

    public String oneTwo(String str) {
        String stringBuilder = "";

        for (int i = 0; i < str.length(); i += 3) {
            stringBuilder = stringBuilder + str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return stringBuilder;
    }


//    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

    public String zipZap(String str) {
        String stringBuilder = "";

        if (str.length() <= 2) {
            return str;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                stringBuilder += "zp";
                i += 2;
            } else {
                stringBuilder += str.charAt(i);
            }
        }
        return  stringBuilder;
    }



//    Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }


//    Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100) {
                if (scores[i] != scores[0] && (scores[i + 1] == 100 || scores[i - 1] == 100)) {
                    return true;
                } else if (scores[i] == scores[0] && scores[i + 1] == 100) {
                    return true;
                }
            }
        }
        return false;
    }


//    Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.

    public boolean scoresClump(int[] scores) {
        int absOne;
        int absTwo;

        for (int i = 0; i < scores.length - 2; i++) {
            absOne = Math.abs(scores[i] - scores[i + 1]);
            absTwo = Math.abs(scores[i] - scores[i + 2]);
            if (absOne <= 2 && absTwo <= 2) {
                return true;
            }
        }
        return false;
    }


//    Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method
//    int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact.

    public int scoresAverage(int[] scores) {
        return Math.max(average(scores, 0, scores.length / 2), average(scores, scores.length / 2, scores.length));
    }

    public int average(int[] scores, int start, int end) {
        int accumulator = 0;

        for (int i = start; i < end; i++) {
            accumulator += scores[i];
        }
        return accumulator/(end - start);
    }

//    Given an array of strings, return the count of the number of strings with the given length.

    public int wordsCount(String[] words, int len) {
        int accumulator = 0;

        for (String word : words) {
            if (word.length() == len) {
                accumulator++;
            }
        }
        return accumulator;
    }


//    Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

    public String[] wordsFront(String[] words, int n) {
        String[] newWords = new String[n];

        for (int i = 0; i < n; i++) {
            newWords[i] = words[i];
        }
        return newWords;
    }


//    Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

//    public List wordsWithoutList(String[] words, int len) {
//
//    }

    }
