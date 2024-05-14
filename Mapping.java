import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args){
        Map<String, Integer> students = new HashMap<>();
        students.put("Felix", 28);
        students.put("Hymie", 12);
        students.put("Medo", 36);
        students.put("Kayo", 10);

//        System.out.println(students.get("Felix"));
        System.out.println(students.keySet()); // [Felix, Hymie, Medo, Kayo]

        for (String name: students.keySet()){
            System.out.println(name + ": " + students.get(name) );
        }

    }
}
