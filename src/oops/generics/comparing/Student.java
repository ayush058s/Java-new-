package oops.generics.comparing;

public class Student implements Comparable<Student> {
    int rollNo;
    float score;

    public Student(int rollNo, float score){
        this.rollNo = rollNo;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.score - o.score);
        return diff;
    }

}
