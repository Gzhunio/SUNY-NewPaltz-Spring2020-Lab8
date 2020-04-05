public class Q1and2 {
    public static void main(String[] args) {
        String firstName = "GISELA";
        char first = firstName.charAt(0);
        char last = firstName.charAt(firstName.length() - 1);


        char[] chars = firstName.toCharArray();
        //for(char newChars : chars ) {
        //System.out.println(newChars);
        //for( int i = chars.length-1; i >= 0; i--) {
        //System.out.print(chars[i]);
        //System.out.println("String To Uppercase : " + firstName.toUpperCase() );
        //System.out.println("String To Lowercase : " + firstName.toLowerCase());

        String s = "Zhunio,Gisela";
        String s2= s.substring(3);
        s2=s.substring(s.length()-2);
        s2=s.substring(0);
        //System.out.println(s2);

        String s3=s.substring(0,s.length());
        s3=s.substring(1,3);
        s3=s.substring(s.length()-2,s.length());
        System.out.println(s3);
    }
}

