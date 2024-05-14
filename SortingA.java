import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentZ implements Comparable<StudentZ>{
    int age;
    String name;



    public StudentZ(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String  toString() {
        return "StudentZ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(StudentZ that) {
        if (this.age < that.age)
            return 1;
        else
            return -1;
    }
}

public class SortingA {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
//        nums.add(4);
//        nums.add(3);
//        nums.add(7);
//        nums.add(9);
//        System.out.println(nums);  // [4, 3, 7, 9]
//
//        Collections.sort(nums);
//        System.out.println(nums);  // [3, 4, 7, 9]

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            };
        };
        nums.add(43);
        nums.add(34);
        nums.add(72);
        nums.add(91);
//        Collections.sort(nums, comp);
//        System.out.println(nums);

        Comparator<StudentZ> comparator = ( i, j) -> i.age < j.age ? 1 : -1;


        List<StudentZ> stds = new ArrayList<>();
        stds.add(new StudentZ(35, "Beryl"));
        stds.add(new StudentZ(23, "Willo"));
        stds.add(new StudentZ(42, "Maureen"));
        stds.add(new StudentZ(12, "Tabby"));

        Collections.sort(stds);
        for (StudentZ s: stds)
            System.out.println(s);
    }
}
