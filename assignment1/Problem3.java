/* Student Name: <your name>, Lab Section: <your lab section #> */
package assignment1;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        MaxentTagger tagger = new MaxentTagger("models/english-left3words-distsim.tagger");
        String tagged = tagger.tagString(s);
        System.out.println(tagged);
        sc.close();
    }
}
