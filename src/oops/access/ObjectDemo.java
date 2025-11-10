package oops.access;

public class ObjectDemo {
    int num;
    float gpa;


    public ObjectDemo(int num, float v){
        this.num=num;
        this.gpa=v;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // hashCode() returns an integer value that represents an object’s hash,
    // used for efficient storage and lookup in hash-based collections like HashMap and HashSet
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(10, 9.55f);
        ObjectDemo obj2 = new ObjectDemo(10, 7.5f);

        // checks weather it points to same location or not
        if(obj == obj2){
            System.out.println("obj == obj2");
        }

        // checks the content
        if(obj.equals(obj2)){
            System.out.println("obj == obj2 using equals");
        }

        System.out.println(obj2 instanceof ObjectDemo);

        // getClass() helps to get data
        System.out.println(obj.getClass().getClasses());
    }


}
