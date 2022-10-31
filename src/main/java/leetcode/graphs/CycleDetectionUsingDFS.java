package leetcode.graphs;

import leetcode.graphs.traversals.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleDetectionUsingDFS {

    public boolean isCycle(int numberOfNodes, ArrayList<ArrayList<Integer>> adjacencyList) {
        boolean visited[] = new boolean[numberOfNodes + 1];
        Arrays.fill(visited, false);
        for (int i = 1; i <= numberOfNodes; i++) {
            if (visited[i] == false) {
                if (checkForCycle(i, -1, visited, adjacencyList)==true) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkForCycle(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adjacencyList) {
        visited[node] = true;
        for (Integer it : adjacencyList.get(node)) {
            if (visited[it] == false) {
                if (checkForCycle(it, node, visited, adjacencyList)==true) {
                    return true;
                }
            } else if (it != parent) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        adjList.add(new ArrayList<>());
        adjList.add(new ArrayList<>(List.of(1)));
        adjList.add(new ArrayList<>(List.of(5)));
        adjList.add(new ArrayList<>(List.of(1,4)));
        adjList.add(new ArrayList<>(List.of(3)));
        adjList.add(new ArrayList<>(List.of(2,6,8)));
        adjList.add(new ArrayList<>(List.of(5,7)));
        adjList.add(new ArrayList<>(List.of(6,8)));
        adjList.add(new ArrayList<>(List.of(7,5)));

        System.out.println(new CycleDetectionUsingDFS().isCycle(8,adjList));

    }


}
