public class CamelCase_Method {
    public static String camelCase(String str) {
        char[] arr = str.trim().toCharArray();
        boolean isUpper = true;

        for (int i = 0; i < arr.length; i++) {
            if (isUpper && arr[i] != ' ') {
                arr[i] = Character.toUpperCase(arr[i]);
                isUpper = false;
            } else if (arr[i] == ' ') isUpper = true;
        }
        return new String(arr).replace(" ", "");
    }
}
// https://www.codewars.com/kata/587731fda577b3d1b0001196
