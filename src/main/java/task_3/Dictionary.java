package task_3;

import java.util.*;

public class Dictionary {
    Map<String, List<String>> dictionary;

    public Dictionary(){
        dictionary = new HashMap<>();
    }

    public List<String> getTranslate(String wordOfGerman){
        return dictionary.get(wordOfGerman);
    }

    public void addIntoDictionary(String wordOfGerman, List<String> translateOfUkraine){
        if(dictionary.containsKey(wordOfGerman)){
            for (String word : translateOfUkraine) {
                if(!dictionary.get(wordOfGerman).contains(word)){
                    dictionary.get(wordOfGerman).add(word);
                }
            }
        }
        else {
            dictionary.put(wordOfGerman, translateOfUkraine);
        }
    }

    public void removeFromDictionary(String wordOfGerman, String translateWord){
        if(dictionary.get(wordOfGerman).contains(translateWord)){
            dictionary.get(wordOfGerman).remove(translateWord);
        }
        else{
            System.out.println("The translate word " + translateWord + " is not exists in dictionary.");
        }
    }
}
