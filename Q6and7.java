public class Q6and7 {
    public static void main(String[] args){
        int count = count("zzzzz", 'z');



        System.out.println(count);

    }

    public static int count(String name){
        int count = 0;

        for(char c: name.toCharArray()){
            if(c == 'a'){
                count++;
            }
        }

        return count;
    }

    public static int count(String name, char character){
        int count = 0;

        for(char c: name.toCharArray()){
            if(c == character){
                count++;
            }
        }

        return count;
    }
}
