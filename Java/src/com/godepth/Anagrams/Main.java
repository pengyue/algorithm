package com.godepth.Anagrams;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Anagrams anagrams = new Anagrams();
        anagrams.delete();
    }
}

class Anagrams {

    public void delete()
    {
        String leftRemoveString = "";
        String rightRemoveString = "";
        String anagramString = "";
        String leftString = "cdesvsdctykyuwcfdvdfv";
        String rightString = "abchdfbrbrtbvervwdveasxfdbthwc";

        Map<String, String> left = new HashMap<>();
        left.put("a", "0");
        left.put("b", "0");
        left.put("c", "0");
        left.put("d", "0");
        left.put("e", "0");
        left.put("f", "0");
        left.put("g", "0");
        left.put("h", "0");
        left.put("i", "0");
        left.put("j", "0");
        left.put("k", "0");
        left.put("l", "0");
        left.put("m", "0");
        left.put("n", "0");
        left.put("o", "0");
        left.put("p", "0");
        left.put("q", "0");
        left.put("r", "0");
        left.put("s", "0");
        left.put("t", "0");
        left.put("u", "0");
        left.put("v", "0");
        left.put("w", "0");
        left.put("x", "0");
        left.put("y", "0");
        left.put("z", "0");

        Map<String, String> right = new HashMap<>();
        right.put("a", "0");
        right.put("b", "0");
        right.put("c", "0");
        right.put("d", "0");
        right.put("e", "0");
        right.put("f", "0");
        right.put("g", "0");
        right.put("h", "0");
        right.put("i", "0");
        right.put("j", "0");
        right.put("k", "0");
        right.put("l", "0");
        right.put("m", "0");
        right.put("n", "0");
        right.put("o", "0");
        right.put("p", "0");
        right.put("q", "0");
        right.put("r", "0");
        right.put("s", "0");
        right.put("t", "0");
        right.put("u", "0");
        right.put("v", "0");
        right.put("w", "0");
        right.put("x", "0");
        right.put("y", "0");
        right.put("z", "0");

        for (char item : leftString.toCharArray()) {
            left.put(Character.toString(item), Integer.toString(Integer.parseInt(left.get(Character.toString(item))) + 1));
            System.out.println(Character.toString(item) + ":" + left.get(Character.toString(item)));
        }

        System.out.println("=====================================================");

        for (char item : rightString.toCharArray()) {
            right.put(Character.toString(item), Integer.toString(Integer.parseInt(right.get(Character.toString(item))) + 1));
            System.out.println(Character.toString(item) + ":" + right.get(Character.toString(item)));
        }

        String list[] = {"a","b","c", "d", "e" , "f", "g", "h" , "i", "j", "k" , "l", "m", "n" , "o", "p", "q" , "r", "s", "t" , "u", "v", "w" , "x", "y", "z"};

        for (String element : list) {
            if (Integer.parseInt(left.get(element)) >= 1 && Integer.parseInt(right.get(element)) >= 1) {
                anagramString += element;
            } else if (Integer.parseInt(left.get(element)) >= 1 && Integer.parseInt(right.get(element)) == 0) {
                leftRemoveString += element;
            } else if (Integer.parseInt(left.get(element)) == 0 && Integer.parseInt(right.get(element)) >= 1) {
                rightRemoveString += element;
            }
        }

        System.out.println("Anagrams: " + anagramString);
        System.out.println("Anagrams remove chars (left): " + leftRemoveString);
        System.out.println("Anagrams remove char number (left): " + leftRemoveString.length());
        System.out.println("Anagrams remove chars (right): " + rightRemoveString);
        System.out.println("Anagrams remove char number (right): " + rightRemoveString.length());
        System.out.println("Anagrams remove char number (total): " + ((leftRemoveString.length()) + (rightRemoveString.length())));

    }
}
