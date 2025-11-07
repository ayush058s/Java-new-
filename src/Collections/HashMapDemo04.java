
package Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

// default array size of hashMap = 16
// map has key: value pair
// unique keys, key is mapped to only 1 value
// not synchronized (not thread safe)
// 0(1) => add, remove

// 4 components of hashMap => i)key, ii) value,
// iii) bucket (internal array that stores key-value pair),
// iv) Hash Function (take the key and return the fixed number, index where it is stored in an array
// called as hash code, hash value, hash)
public class HashMapDemo04 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ayush");
        map.put(2, "Navjot");
        map.put(3, "Shivam");

        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);

        System.out.println(map.containsKey(45)); //  false
        System.out.println(map.containsValue("Shivam")); // true

        // loop in hashmap
        Set<Integer> keys = map.keySet();
        for(int i : keys){
            System.out.println(map.get(i));
        }

        // loop
        Set<Map.Entry<Integer, String>> integerStringEntry = map.entrySet();
        for(Map.Entry<Integer, String> entry : integerStringEntry) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // remove
        //map.remove(1);
        map.remove(1, "Ayush");
        System.out.println(map);


        // how hashMap works
        //1) key is passed to hash function, and a unique hash code is generated
        //2) this code will tell where the pair will be stored in a bucket array
        // using formula ==>> int index = hashCode % arraySize

        // collision handling mechanism = each bucket can store multiple key value pairs
        // java uses (n)linked list (or Balanced tree => red-black tree) to avoid it
        // after 8 entries in one index it shifts to a red-black tree(log n)


        // HahMap of class
        // hashcode is generated with the help pf memory address and is unique || equals will check the reference

        HashMap<Student, String> mapClass = new HashMap<>();
        Student s1 = new Student("Ayush", 394); // hashCode1
        Student s2 = new Student("Dhrupad", 409); // hashCode2
        Student s3 = new Student("Ashish", 390); // hashCode3
        Student s4 = new Student("Ayush", 394); // hashCode4 because its memory is different

        mapClass.put(s1, "Employee");
        mapClass.put(s2, "Designer");
        mapClass.put(s3, "Engineer");
        mapClass.put(s4, "Manager");

        System.out.println("HashMap size: " + mapClass.size()); // it should print 3 but prints 4
        // as
        System.out.println("Value of s1: " + mapClass.get(s1));
        System.out.println("Value of s4: " + mapClass.get(s4));
        System.out.println(s1);

    }
}

class Student {
    // Student ka naam store karne ke liye variable
    private String name;

    // Student ka ID store karne ke liye variable
    private int id;

    // Constructor jo Student object banate time name aur id set karega
    public Student(String name, int id) {
        this.name = name;  // name assign kar rahe hai
        this.id = id;      // id assign kar rahe hai
    }

    // Getter method: student ka id return karega
    public int getId() {
        return id;
    }

    // Getter method: student ka name return karega
    public String getName() {
        return name;
    }

    // equals() method override kar rahe hai taaki do Student objects compare ho sake based on name & id
    @Override
    public boolean equals(Object obj) {
        // Agar same object ko compare kar rahe hai to true return karo
        if (this == obj) {
            return true;
        }
        // Agar dusra object null hai to false return karo
        if (obj == null) {
            return false;
        }
        // Agar class alag hai to false return karo
        if (getClass() != obj.getClass()) {
            return false;
        }
        // Object ko Student type me cast kar rahe hai
        Student other = (Student) obj;
        // Dono students ka id aur name match karte hai ya nahi check kar rahe hai
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    // hashCode() override kar rahe hai taaki equals() ke sath consistency rahe
    @Override
    public int hashCode() {
        return Objects.hash(name, id); // name aur id ke basis par hash code generate ho raha hai
    }

    // toString() override kar rahe hai taaki Student object readable form me print ho
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
