package OOP;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();

    public WordSet() {

    }

    public WordSet(String s) {
        StringTokenizer st = new StringTokenizer(s.toLowerCase());
        while (st.hasMoreTokens()) {
            set.add(st.nextToken());
        }
    }

    public String toString() {
        String res = "";
        for (String i : set) {
            res = res + i + " ";
        }
        return res.trim();
    }

    public WordSet union(WordSet w) {
        WordSet result = new WordSet();
        result.set.addAll(set);
        result.set.addAll(w.set);
        return result;
    }

    public WordSet intersection(WordSet w) {
        WordSet result = new WordSet();
        result.set.addAll(set);
        result.set.retainAll(w.set);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
