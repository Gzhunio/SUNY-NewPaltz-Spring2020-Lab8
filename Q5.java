public class Q5 {
    public static void main (String[] args){
        String result = remove("chard", "Richard");
        String result1 = moveToFront("chard", "Richard");

        System.out.println(result);
        System.out.println(result1);
    }

    public static String remove(String subString, String from) {
        int first = from.indexOf(subString);
        int last = first + subString.length();

        return from.substring(0,first) + from.substring(last);
    }
    public static String moveToFront(String subString, String from) {
        return subString + remove (subString, from);
    }
}
