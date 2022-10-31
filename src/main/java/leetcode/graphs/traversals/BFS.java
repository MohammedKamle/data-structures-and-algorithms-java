package leetcode.graphs.traversals;

import java.util.*;

public class BFS {

    //https://www.youtube.com/watch?v=UeE67iCK2lQ&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=5&ab_channel=takeUforward

    public ArrayList<Integer> bfsOfGraph(int numberOfNodes, ArrayList<ArrayList<Integer>> adjacencyList) {
        ArrayList<Integer> bfsList = new ArrayList<>();
        boolean visited[] = new boolean[numberOfNodes + 1];
        Arrays.fill(visited, false);

        for (int i = 1; i <= numberOfNodes; i++) {
            if (visited[i] == false) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                visited[i] = true;

                while (!queue.isEmpty()) {
                    Integer node = queue.remove();
                    bfsList.add(node);

                    for (Integer it : adjacencyList.get(node)) {
                        if (visited[it] == false) {
                            visited[it] = true;
                            queue.add(it);
                        }
                    }
                }
            }
        }
        return bfsList;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        adjList.add(new ArrayList<>());
        adjList.add(new ArrayList<>(List.of(2)));
        adjList.add(new ArrayList<>(List.of(1, 3, 7)));
        adjList.add(new ArrayList<>(List.of(2, 5)));
        adjList.add(new ArrayList<>(List.of(6)));
        adjList.add(new ArrayList<>(List.of(3, 7)));
        adjList.add(new ArrayList<>(List.of(4)));
        adjList.add(new ArrayList<>(List.of(2, 5)));

        System.out.println(new BFS().bfsOfGraph(7, adjList));
    }
}
