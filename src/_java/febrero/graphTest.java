package _java.febrero;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class graphTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de nodos: ");
        int nodeNum = sc.nextInt();
        Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= nodeNum; i++) {
            graph.put(i, new LinkedList<Integer>());
        }

        System.out.print("Numero de aristas: ");
        int edgeNum = sc.nextInt();
        System.out.println("Conexiones: ");
        for (int i = 0; i < edgeNum; i++) {
            int nodeO = sc.nextInt();
            int nodeF = sc.nextInt();
            graph.get(nodeO).add(nodeF);
            graph.get(nodeF).add(nodeO);
        }

        System.out.print("Nodos origen y destino: ");
        int nodeO = sc.nextInt();
        int nodeF = sc.nextInt();

        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> usedNodes = new HashSet<>();
        queue.offer(nodeO);
        int counter = 0;
        boolean found = false;

        queue.offer(nodeO);
        usedNodes.add(nodeO);

        while (!queue.isEmpty() && !found) {
            int nodeInLevel = queue.size();
            // if (queue.peek() == firstNextGen){
            //     counter ++;
            //     for (int i = 0; i < graph.get(queue.peek()).size(); i++) {
            //         if (!usedNodes.contains(graph.get(queue.peek()).get(i))) {
            //             firstNextGen = graph.get(queue.peek()).get(i);
            //             break;
            //         }
            //     }
            // }
            
            for (int i = 0; i < nodeInLevel; i++) {
                int currentPlace = queue.poll();

                if (currentPlace == nodeF) {
                    found = true;
                }

                for (Integer num : graph.get(currentPlace)) {
                    if (!usedNodes.contains(num))
                        usedNodes.add(currentPlace);
                        queue.offer(num);
                }
            }
            if (!found) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}
