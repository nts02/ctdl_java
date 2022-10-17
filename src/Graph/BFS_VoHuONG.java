package Graph;

import java.util.*;

public class BFS_VoHuONG {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            int u = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                dske[i] = new ArrayList();
                chuaxet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                dske[a].add(b);
                dske[b].add(a);
            }

            bfs(u);
            System.out.println();
        }

    }

    public static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u);
        chuaxet[u] = false;
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");
            for (Integer i : dske[v]) {
                if (chuaxet[i] == true) {
                    q.add(i);
                    chuaxet[i] = false;
                }
            }
        }
    }
}
