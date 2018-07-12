package Array_String;

/**
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 * EXAMPLE
 * Input: "Mr John Smith ", 13
 * Output: "Mr%20John%20Smith"
 */
public class URLify {
    public String urlify(String s, int num) {
        //1st count the number of the space
        int numSpace = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                flag = true;
            }
            if (s.charAt(i) == ' ' && flag) {
                numSpace++;
            }
        }
        int resLen = num + 2 * numSpace;
        char[] res = new char[resLen];
        int j = 0;
        int i = 0;

        while (j < resLen) {
            while (i < num) {
                if (s.charAt(i) != ' ') {
                    System.out.println("s.charAt(i) is:" + s.charAt(i) + " and the loop is at:" + i);
                    res[j] = s.charAt(i);
                    j++;
                } else {
                    res[j] = '%';
                    res[j + 1] = '2';
                    res[j + 2] = '0';
                    j += 3;
                }
                i++;
            }

        }
        return new String(res);
    }

    public static void main(String[] argv) {
        String test = "mayan xihuan weiya   wei         ";
        URLify url = new URLify();
        String res = url.urlify(test, 24);
        System.out.println(res);
    }
}
