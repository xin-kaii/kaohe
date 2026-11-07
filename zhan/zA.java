public class zA {
    static int n = 8;
    static int[] ans = new int[n];
    static boolean[] vis = new boolean[n + 1];

    public static void main(String[] args) {
        dfs(0);
    }

    static void dfs(int k) {
        if (k == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                vis[i] = true;
                ans[k] = i;
                dfs(k + 1);
                vis[i] = false;
            }
        }
    }
}