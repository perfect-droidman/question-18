package student;

public class main {
    public static void main(String[] args) {
        
        MaxPriorityQueue<Student> maxPriorityQueue = new MaxPriorityQueue<>(0.0);
        maxPriorityQueue.enqueue(new Student("Arvin", 40));
        maxPriorityQueue.enqueue(new Student("Ban", 32));
        maxPriorityQueue.enqueue(new Student("Cashes", 42));
        maxPriorityQueue.enqueue(new Student("Dork", 100));
        maxPriorityQueue.enqueue(new Student("Gabe", 69));
        maxPriorityQueue.enqueue(new Student("Bean", 0));
        
        
        while(!maxPriorityQueue.isEmpty()){
            System.out.println(maxPriorityQueue.removeFront());
        }
    }
}
