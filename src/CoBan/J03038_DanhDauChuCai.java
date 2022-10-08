package CoBan;

import java.util.*;

public class J03038_DanhDauChuCai {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Set<Character> se = new TreeSet<>();
        String s = in.nextLine();
        for(int i = 0 ;i < s.length();i++){
            se.add(s.charAt(i));
        }
        System.out.println(se.size());
        long t= in.next().chars().distinct().count();
        System.out.println(t);
    }
}
