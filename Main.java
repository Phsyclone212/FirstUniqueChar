import java.util.HashMap;
import java.util.Scanner;
//This was a little challenge to find the first unique char in a string.
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> charCount = new HashMap<>();
        String input = in.nextLine();
        char[] chars = input.toCharArray();
        for(int i = 0; i<chars.length; i++){
            charCount.put(chars[i], charCount.getOrDefault(chars[i], 0) + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            if (charCount.get(input.charAt(i)) == 1) {
                System.out.println("First unique char is: " + input.charAt(i));
                return;
            }
        }
        System.out.println("No unique characters.");
    }
}
