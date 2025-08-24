import java.util.*;

class BeingZero {

    public List<String> solve(int n, List<List<String>> edges, String src, String dest) {
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, List<String>> reverseGraph = new HashMap<>();
        Set<String> nodes = new HashSet<>();

        for (List<String> edge : edges) {
            String from = edge.get(0), to = edge.get(1);
            nodes.add(from);
            nodes.add(to);
            graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
            reverseGraph.computeIfAbsent(to, k -> new ArrayList<>()).add(from);
        }

        Set<String> reachableFromSrc = bfs(src, graph);
        Set<String> canReachDest = bfs(dest, reverseGraph);

        List<String> intermediate = new ArrayList<>();
        for(String node : nodes) {
            if(!node.equals(src) && !node.equals(dest) &&
               reachableFromSrc.contains(node) && canReachDest.contains(node)) {
                intermediate.add(node);
            }
        }

        Collections.sort(intermediate);
        return intermediate;
    }

    private Set<String> bfs(String start, Map<String, List<String>> graph) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()) {
            String node = queue.poll();
            for(String neigh : graph.getOrDefault(node, Collections.emptyList())) {
                if(!visited.contains(neigh)) {
                    visited.add(neigh);
                    queue.add(neigh);
                }
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());
        BeingZero solver = new BeingZero();

        while(T-- > 0) {
            String[] nm = sc.nextLine().trim().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            List<List<String>> edges = new ArrayList<>();

            for(int i=0; i<m; i++) {
                String[] edge = sc.nextLine().trim().split(" ");
                edges.add(Arrays.asList(edge[0], edge[1]));
            }

            // Problem states src=Hyderabad, dest=Delhi
            List<String> result = solver.solve(n, edges, "Hyderabad", "Delhi");
            if(result.isEmpty()) System.out.println();
            else System.out.println(String.join(" ", result));
        }
        sc.close();
    }
}
