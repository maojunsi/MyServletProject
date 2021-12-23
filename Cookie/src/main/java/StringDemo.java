
/**
 * @author MJS
 * @description
 * @date 2021/8/21
 */
public class StringDemo {

    static String[] wordDict = {"leet", "code"};

    public static void main(String[] args) {

        String str = "leetcode";

        System.out.println(getMyString(str));

    }


    public static boolean getMyString(String str) {

        for (String s : wordDict) {
            if (str.contains(s)) {
                str = str.replaceAll(s, "");
            }
        }
        if ("".equals(str)) {
            return true;
        }
        return false;

    }

}
