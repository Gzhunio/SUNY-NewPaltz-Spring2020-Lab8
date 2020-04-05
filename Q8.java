public class Q8 {
    public static void main (String[] args){
        String r = substringFrom("karo",4);

    }
    public static String substringFrom(String str, int index){
        if(index >= str.length () || index < 0){
            System.out.println("Out of Bounds");
            return "";
        } else {
            return str.substring(index);
        }
    }

}
