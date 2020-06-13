/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asschapt3part1;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Maram Tanani
 */
//QUESTION NUMBER 2
public class Frequency {
   public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(new File("input.txt"));
       HashMap<String, Integer> words = new HashMap<String, Integer>();
       while (in.hasNext()) {
           String key = in.next();
           if (words.containsKey(key)) {
               words.put(key, words.get(key) + 1);
           } else {
               words.put(key, 1);
           }
       }
       for (String k : words.keySet()) {
           int val = words.get(k);
           System.out.println(k + " : " + val);
           HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
           for (int i = 0; i < k.length(); i++) {
               char ch = k.charAt(i);
               if (chars.containsKey(ch)) {
                   chars.put(ch, chars.get(ch) + 1);
               } else {
                   chars.put(ch, 1);
               }
           }
           for (Character c : chars.keySet())
               System.out.println("src/asschapt3part1/input"+c + " : " + chars.get(c));
       }
   }
}
