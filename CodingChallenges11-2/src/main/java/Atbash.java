import java.sql.SQLOutput;
import java.util.Scanner;

public class Atbash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(atBash(str));
    }

    public static String atBash(String str){

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!Character.isLetter(c)){
                result.append(c);
            }else if(Character.isUpperCase(c)){
                int diff = ('Z' - c) + 'A';
                result.append((char) diff);
            }else if(Character.isLowerCase(c)){
                int diff = ('z' - c) + 'a';
                result.append((char) diff);
            }
        }
        return result.toString();
    }
}
