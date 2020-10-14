import java.util.*;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        List<Character> result = new ArrayList<>();
        char[] letters = phrase.toLowerCase().toCharArray();
        for(char letter : letters){
            if(Character.compare(letter, ' ') == 0 || Character.compare(letter, '-') == 0){
                continue;
            }
            if(result.contains(letter)){
                return false;
            }
            else{
                result.add(letter);
            }
        }
        return true;


    }
}
