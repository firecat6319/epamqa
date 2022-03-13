package epamqa.lengthoflastword;

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lolw = new LengthOfLastWord();
        System.out.println(lolw.lengthOfLastWord("   fly me   to   the moon  "));
    }

    public int lengthOfLastWord(String s) {
        String[] splited = s.trim().split("\\s+");
        String spl = splited[splited.length - 1];

        return spl.length();
    }
}
