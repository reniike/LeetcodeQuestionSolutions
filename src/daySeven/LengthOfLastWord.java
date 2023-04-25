package daySeven;

public class LengthOfLastWord {
    private static int lengthOfWord(String sentence){
//        String[] splitString = sentence.split(" ");
//        int result = splitString[splitString.length - 1].length();
//        return result;
        return sentence.split(" ")[sentence.split(" ").length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfWord("   fly me   to   the moon  "));
    }
}
