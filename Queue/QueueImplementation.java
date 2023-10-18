import java.util.*;
class QueueImplementation{
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(90);
        q.add(30);
        q.add(50);
        q.add(60);
        q.add(10);
        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}