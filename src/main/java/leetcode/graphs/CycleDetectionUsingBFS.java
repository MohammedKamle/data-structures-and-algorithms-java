package leetcode.graphs;

import java.util.*;

class Node {
    int node;
    int parent;

    public Node(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}

public class CycleDetectionUsingBFS {

    public boolean isCycle(int numberOfNodes, ArrayList<ArrayList<Integer>> adjacencyList) {
        boolean visited[] = new boolean[numberOfNodes + 1];
        Arrays.fill(visited, false);
        for (int i = 1; i <= numberOfNodes; i++) {
            if (!visited[i]) {
                if (checkForCycle(i, visited, adjacencyList)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkForCycle(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adjacencyList) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(i, -1));
        visited[i] = true;
        while (!queue.isEmpty()) {
            int node = queue.peek().node;
            int parent = queue.peek().parent;
            queue.remove();
            for (Integer it : adjacencyList.get(node)) {
                if (!visited[it]) {
                    queue.add(new Node(it, node));
                    visited[it] = true;
                } else if (it != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        adjList.add(new ArrayList<>());
        adjList.add(new ArrayList<>(List.of(2)));
        adjList.add(new ArrayList<>(List.of(1, 4)));
        adjList.add(new ArrayList<>(List.of(5)));
        adjList.add(new ArrayList<>(List.of(2)));
        adjList.add(new ArrayList<>(List.of(3, 10, 6)));
        adjList.add(new ArrayList<>(List.of(5, 7)));
        adjList.add(new ArrayList<>(List.of(6, 8)));
        adjList.add(new ArrayList<>(List.of(7, 9, 11)));
        adjList.add(new ArrayList<>(List.of(10, 8)));
        adjList.add(new ArrayList<>(List.of(5, 9)));
        adjList.add(new ArrayList<>(List.of(8)));

        System.out.println(new CycleDetectionUsingBFS().isCycle(11,adjList));

    }
}
