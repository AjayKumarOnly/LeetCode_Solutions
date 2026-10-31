class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {

        // Build graph
        List<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
        }

        // dist[node][consecutive count]
        int[][] dist = new int[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        // {distance, node, consecutiveCount}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // Start from node 0
        dist[0][1] = 0;
        pq.offer(new int[]{0, 0, 1});

        while (!pq.isEmpty()) {

            int[] cur = pq.poll();

            int distance = cur[0];
            int node = cur[1];
            int count = cur[2];

            // Outdated state
            if (distance != dist[node][count]) {
                continue;
            }

            // Destination reached
            if (node == n - 1) {
                return distance;
            }

            for (int[] edge : graph[node]) {

                int next = edge[0];
                int weight = edge[1];

                int newCount;

                // Same character
                if (labels.charAt(node) == labels.charAt(next)) {
                    newCount = count + 1;
                } 
                // Different character
                else {
                    newCount = 1;
                }

                // More than k consecutive characters
                if (newCount > k) {
                    continue;
                }

                int newDistance = distance + weight;

                if (newDistance < dist[next][newCount]) {

                    dist[next][newCount] = newDistance;

                    pq.offer(new int[]{
                        newDistance,
                        next,
                        newCount
                    });
                }
            }
        }

        return -1;
    }
}