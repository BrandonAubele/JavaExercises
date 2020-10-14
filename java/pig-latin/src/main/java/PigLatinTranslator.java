
public class PigLatinTranslator{
    public String translate(String latin){

        String result = "";

        if (beginsWithVowel(latin))
            result = latin + "ay";
        else if (beginsWithBlend(latin))
            result = latin.substring(2) + latin.substring(0,2) + "ay";
        else if(beginsWithVowel(latin) && latin.substring(1,3) == "qu"){
            result = latin.substring(3) + latin.substring(0,3) + "ay";
        }
        else
            result = latin.substring(1) + latin.charAt(0) + "ay";

        return result;
    }
    private static boolean beginsWithVowel (String word)
    {
        String vowels = "aeiouy";

        char letter = word.charAt(0);

        return (vowels.indexOf(letter) != -1);
    }
    private static boolean beginsWithBlend (String word)
    {
        return ( word.startsWith ("bl") || word.startsWith ("sc") ||
                word.startsWith ("br") || word.startsWith ("sh") ||
                word.startsWith ("ch") || word.startsWith ("sk") ||
                word.startsWith ("cl") || word.startsWith ("sl") ||
                word.startsWith ("cr") || word.startsWith ("sn") ||
                word.startsWith ("dr") || word.startsWith ("sm") ||
                word.startsWith ("dw") || word.startsWith ("sp") ||
                word.startsWith ("fl") || word.startsWith ("sq") ||
                word.startsWith ("fr") || word.startsWith ("st") ||
                word.startsWith ("gl") || word.startsWith ("sw") ||
                word.startsWith ("gr") || word.startsWith ("th") ||
                word.startsWith ("kl") || word.startsWith ("tr") ||
                word.startsWith ("ph") || word.startsWith ("tw") ||
                word.startsWith ("pl") || word.startsWith ("wh") ||
                word.startsWith ("pr") || word.startsWith ("wr") );
    }


}