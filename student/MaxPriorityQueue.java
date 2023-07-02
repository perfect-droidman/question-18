package student;

import java.util.ArrayList;

public class MaxPriorityQueue<T extends Comparable<? super T>>{
    private final ArrayList<T> data;
    private final String name = "";
    private double percentageScore;
    private int numberOfItems = 0;
    Student student = new Student(name, percentageScore);
    
    public MaxPriorityQueue(double percentageScore){
        this.percentageScore = percentageScore;
        data = new ArrayList<>();
        numberOfItems = 0;
        
        student.setPercentageScore(this.percentageScore);
        student.setName(name);
    }
    
    public void enqueue(T student){
        data.add(student);
        
        upheap(numberOfItems);
        
        numberOfItems++;
    }
    
    public boolean isEmpty(){
        return numberOfItems == 0;
    }
    
    public T peek(){
        if(isEmpty()){
            throw new IllegalAccessError();
        }
        
        return data.get(0);
    }
    
    public T removeFront(){
        T item = data.get(0);
        
        numberOfItems--;
        
        data.set(0, data.get(numberOfItems));
        
        data.remove(numberOfItems);
        
        downheap(0);
        
        return item;
    }
    
    private void downheap(int index){
        int leftChildIndex = leftChild(index);
        if(leftChildIndex < numberOfItems){
            int largestChildIndex = leftChildIndex;
            int rightChildIndex = rightChild(index);
            if(rightChildIndex < numberOfItems){
                if(data.get(rightChildIndex).compareTo(data.get(largestChildIndex)) > 0){
                    largestChildIndex = rightChildIndex;
                }
            }
            if(data.get(largestChildIndex).compareTo(data.get(index)) > 0){
                swap(index, largestChildIndex);
                downheap(largestChildIndex);
            }
        }
    }
    
    private void upheap(int index){
        int parentIndex = parent(index);
        if(data.get(index).compareTo(data.get(parentIndex)) > 0){
            swap(index, parentIndex);
            upheap(parentIndex);
        }
    }
    
    
    private void swap(int index1, int indicesSwapping){
        T temp = data.get(index1);
        data.set(index1, data.get(indicesSwapping));
        data.set(indicesSwapping, temp);
    }
    
    private int parent(int index){
        return (index - 1) / 2;
    }
    
    private int leftChild(int index){
        return (index * 2) + 1;
    }
    
    private int rightChild(int index){
        return (index * 2) + 2;
    }
}
