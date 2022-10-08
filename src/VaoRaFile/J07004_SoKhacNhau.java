package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J07004_SoKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        while (in.hasNext()) {
            int value = in.nextInt();
            if (m.containsKey(value)) {
                int count = m.get(value);
                m.put(value, count + 1);
            } else {
                m.put(value, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
