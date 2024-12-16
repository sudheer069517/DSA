import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

    //Leetcode - 2942
    public List<Integer> findWordsContaining(String[] words, char x) {

        int length = words.length;
        int i = 0;
        List<Integer> indices = new ArrayList<>();

        while(i < length){
            String s = words[i];
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == x){
                    indices.add(i);
                    break;
                }
            }
            i++;
        }

        return indices;
    }

    public static void main(String[] args) {
        FindWordsContainingCharacter findWordsContainingCharacter = new FindWordsContainingCharacter();
        List<Integer> indices = findWordsContainingCharacter.findWordsContaining(new String[]{"leet","code"}, 'e');
        System.out.print(indices);
    }
}
