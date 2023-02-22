/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package drawtree;
import java.util.*;
/**
 *
 * @author Natan
 */
public class Drawtree {

    public static String[] getTree(int[] parents, String[] names) {
        int n = parents.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            if (parents[i] != -1) {
                adj.get(parents[i]).add(i);
            }
        }
        List<String> lines = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        DFS(0, adj, names, sb, "", "");
        lines.add(sb.toString());
        return lines.toArray(new String[0]);
    }

    private static void DFS(int u, List<List<Integer>> a, String[] name, StringBuilder sb, String pre, String pi) {
        sb.append(pre).append("+-").append(name[u]).append("\n");
        int m = a.get(u).size();
        for (int i = 0; i < m; i++) {
            int v = a.get(u).get(i);
            String newpre = pre + pi + "  ";
            String newpi = (i == m - 1) ? "   " : "|  ";
            DFS(v, a, name, sb, newpre, newpi);
        }
    }
    public static void main(String[] args) {
        int[] parents = {1,2,3,4,5,6,-1};
        String[] names = {"A","B","C","D","E","F","G"};
        String[] tree = getTree(parents, names);
        for (String line : tree) {
            System.out.print(line);
        }
    }
    
}
