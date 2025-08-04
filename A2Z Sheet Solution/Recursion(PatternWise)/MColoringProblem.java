import java.util.ArrayList;
import java.util.List;

public class MColoringProblem {

    public boolean graphColoring(int[][] edges, int m, int n) {

        // Create adjacency list representation of the graph
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the graph from edges
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] colors = new int[n]; // Initialize all colors to 0 (uncolored)
        // Start solving from the first node
        return solve(0, m, n, colors, adj);
    }


    private boolean solve(int node, int m, int n, int[] colors, List<List<Integer>> adj) {
        // If all nodes are colored
        if (n == node) return true;
        // Try all colors from 1 to m
        for (int i = 1; i <= m; i++) {
            // Check if it is safe to color the node with color i
            if (isSafe(i, node, colors, adj)) {
                colors[node] = i; // Assign color i to node
                // Recursively try to color the next node
                if (solve(node + 1, m, n, colors, adj)) return true;
                colors[node] = 0; // Reset color if it doesn't lead to a solution
            }
        }
        return false; // No color can be assigned
    }



    private boolean isSafe(int col, int node, int[] colors, List<List<Integer>> adj) {

        for (int neighbor : adj.get(node)) {

            if (colors[neighbor] == col) return false;
        }
        return true;
    }
}
