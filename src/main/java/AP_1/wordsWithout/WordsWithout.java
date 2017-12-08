package AP_1.wordsWithout;

import java.util.ArrayList;
import java.util.List;

public class WordsWithout {

    public static String[] wordsWithout(String[] words, String target) throws Exception {
        if (words.length==0) {
            throw new Exception("Array can not be empty.");
        } else if(target.length() == 0){
            throw new Exception("String can not be empty");
        }

        List<String> list = new ArrayList<String>();
        for (String s1 : words) {
            if (!s1.equals(target)){
                list.add(s1);
            }
        }
        String[] arrayToReturn = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrayToReturn[i] = list.get(i);
        }

        return arrayToReturn;
    }
}
