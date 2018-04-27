package Array_String;

//Implement an algorithm to determine if a string has all unique characters, what if we cannot use additional data structure
public class IsUnique {
    public boolean checker(String s) {
        boolean[] allchar = new boolean[128];
        if (s.length() > 128) return false;
        for (char c : s.toLowerCase().toCharArray()) {
            int index = (int) c;
            if (allchar[index]) return false;
            allchar[index] = true;
        }
        return true;
    }

    public static void main(String argv[]) {
        String t1 = "MayAn";
        IsUnique is = new IsUnique();
        System.out.print(is.checker(t1));
    }
}
