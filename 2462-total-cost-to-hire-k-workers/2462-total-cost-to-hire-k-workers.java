class Pair {
    int cost;
    int index;

    Pair(int cost, int index) {
        this.cost = cost;
        this.index = index;
    }
}
class PairCompare implements Comparator<Pair> {
    public int compare(Pair a, Pair b) {
        if (a.cost == b.cost) {
            return a.index - b.index;
        }
        return a.cost - b.cost;
    }
}
class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;

        PriorityQueue<Pair> left = new PriorityQueue<>(new PairCompare());
        PriorityQueue<Pair> right = new PriorityQueue<>(new PairCompare());

        int leftPtr = 0;
        int rightPtr = n - 1;

        while (leftPtr < candidates && leftPtr <= rightPtr) {
            left.offer(new Pair(costs[leftPtr], leftPtr));
            leftPtr++;
        }

        while (rightPtr >= n - candidates && rightPtr >= leftPtr) {
            right.offer(new Pair(costs[rightPtr], rightPtr));
            rightPtr--;
        }

        long total = 0;

        while (k > 0) {

            if (right.isEmpty() ||
                (!left.isEmpty() && left.peek().cost <= right.peek().cost)) {

                Pair curr = left.poll();
                total += curr.cost;

                if (leftPtr <= rightPtr) {
                    left.offer(new Pair(costs[leftPtr], leftPtr));
                    leftPtr++;
                }

            } else {

                Pair curr = right.poll();
                total += curr.cost;

                if (leftPtr <= rightPtr) {
                    right.offer(new Pair(costs[rightPtr], rightPtr));
                    rightPtr--;
                }
            }
            k--;
        }

        return total;
    }
}