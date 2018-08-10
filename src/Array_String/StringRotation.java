package Array_String;

/**
 * Question:
 * String Rotation:Assumeyou have a method isSubstringwhich checks if one word is a substring
 * of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
 * call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
 */
public class StringRotation {
    private boolean isRotation(String s1, String s2) {
        // aabb ab
        String s = s1 + s1;
        return this.isSubString(s, s2);
    }

    private boolean isSubString(String s1, String s2) {
        return s1.contains(s2);
    }

    public static void main(String[] argv) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(new StringRotation().isRotation(s1, s2));
    }

}
