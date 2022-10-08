package Sort;

import java.util.*;

public class TangDanGiamDan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            Set<Integer> list = new TreeSet<>();
            for(int i = 0 ;i <n;i++) {
                list.add(in.nextInt());
            }

            List<Integer> listChan = new ArrayList<>();
            List<Integer> listLe = new ArrayList<>();
            for(Integer i : list) {
                if(i % 2== 0) {
                    listChan.add(i);
                }
                else listLe.add(i);
            }
            Collections.sort(listChan);
            Collections.sort(listLe,Collections.reverseOrder());
            for(Integer i : listChan) {
                System.out.print(i+" ");
            }
            System.out.println();
            for(Integer i : listLe) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
