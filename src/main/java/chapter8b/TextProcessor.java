package chapter8b;



public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeAngie");
    }

    // /This program counts the number of spaces in  string
    public static void countWords(String text){
        String[] words  = text.split(" ");
        int numOfWords = words.length;

        String message = String.format("You text contains %d words: ", numOfWords);
        System.out.println(message);

        for (int i = 0; i <numOfWords; i ++){
            System.out.println(words[i]);
        }
    }

    // Prints a string in reverse order
    public static void reverseString(String text){
        for(int i = text.length()-1; i >= 0; i --){
            System.out.print(text.charAt(i));
        }
    }

    // Add spaces before each uppercase letter
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for(int i = 0; i < modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}