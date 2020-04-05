public class Q9 {
    public static void main(String[] args){
        String r = method ( "Gisela", "Gis");
        System.out.println(r);
    }
    public static String method(String a, String b){
        if (a.contains(b)){
            return a + b.toUpperCase();
        } else {
            return "";
        }
    }
}
