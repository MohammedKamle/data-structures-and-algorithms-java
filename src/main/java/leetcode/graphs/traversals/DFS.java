package leetcode.graphs.traversals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS {

    //https://www.youtube.com/watch?v=uDWljP2PGmU&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=6&ab_channel=takeUforward

    public ArrayList<Integer> dfsOfGraph(int numberOfNodes, ArrayList<ArrayList<Integer>> adjacencyList) {
        ArrayList<Integer> dfsList = new ArrayList<>();
        boolean visited[] = new boolean[numberOfNodes + 1];
        Arrays.fill(visited, false);
        for (int i = 1; i <= numberOfNodes; i++) {
            if (visited[i] == false) {
                dfs(i, visited, adjacencyList, dfsList);
            }
        }
        return dfsList;
    }

    private void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adjacencyList, ArrayList<Integer> dfsList) {
        dfsList.add(node);
        visited[node] = true;
        for (Integer it : adjacencyList.get(node)) {
            if (visited[it] == false) {
                dfs(it, visited, adjacencyList, dfsList); // tail recursion
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        adjList.add(new ArrayList<>());
        adjList.add(new ArrayList<>(List.of(2)));
        adjList.add(new ArrayList<>(List.of(1, 4, 7)));
        adjList.add(new ArrayList<>(List.of(5)));
        adjList.add(new ArrayList<>(List.of(2, 6)));
        adjList.add(new ArrayList<>(List.of(3)));
        adjList.add(new ArrayList<>(List.of(4, 7)));
        adjList.add(new ArrayList<>(List.of(2, 6)));

        System.out.println(new DFS().dfsOfGraph(7, adjList));
    }
}
