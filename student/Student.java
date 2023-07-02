package student;

import java.util.Random;

public class Student implements Comparable<Student>{
    
    private String name;
    private double percentageScore;
    
    public Student(String name, double percentageScore){
        this.name = name;
        this.percentageScore = percentageScore;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPercentageScore(double percentageScore) {
        this.percentageScore = percentageScore;
    }
    
    public double getPercentageScore() {
        return percentageScore;
    }
    
    @Override
    public int compareTo(Student other){
        return (int) (percentageScore - other.percentageScore);
    }
    
    @Override
    public String toString() {
        return name + " " + percentageScore;
    }
    
}
