class MedianFinder {
    PriorityQueue<Integer>  maxPQ;
    PriorityQueue<Integer>  minPQ;

    public MedianFinder() {
      maxPQ = new PriorityQueue<>((a,b)-> b-a);
      minPQ = new PriorityQueue<>();

    }
    
    public void addNum(int num) {
        maxPQ.add(num);

        if(minPQ.size()>0 && maxPQ.peek()>minPQ.peek()){
            int a = minPQ.poll();
            int b = maxPQ.poll();

            maxPQ.add(a);
            minPQ.add(b);

        }
        while(maxPQ.size()-minPQ.size() >1){
            minPQ.add(maxPQ.poll());
        }
    }
    
    public double findMedian() {
        if(maxPQ.size()-minPQ.size() == 1) return maxPQ.peek();

        else {
            double ans = (maxPQ.peek() + minPQ.peek()) / 2.0;
            return ans;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */