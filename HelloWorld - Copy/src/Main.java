//QUESTION 3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input  = userInput.nextLine();
        String[] wordArray = input.split(" ");
        String longest="";

        for(int i = 0;i<wordArray.length;i++){
            for(int j = 0;j<wordArray[i].length();j++){
                if(wordArray[i].length()>wordArray[i+1].length()){
                    longest = wordArray[i];
                }
            }
        }
        System.out.print(longest);

    }
}