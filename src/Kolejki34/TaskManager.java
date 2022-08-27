package Kolejki34;

import java.util.PriorityQueue;

public class TaskManager {
    public static void main(String[] args) {
        PriorityQueue<Task>priorityQueue=new PriorityQueue<>();
        priorityQueue.offer(new Task("taskone","cos",Priority.LOW));
        priorityQueue.offer(new Task("tasktwo","cosinnego",Priority.HIGH));
        priorityQueue.offer(new Task("taskthree","cosdwa",Priority.MEDIUM));
        priorityQueue.offer((new Task("taskfour","zadanko",Priority.HIGH)));
        System.out.println(priorityQueue);
        priorityQueue.poll();
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
    }
}
