package chapter12b;

import java.util.Map;


public class Best {

    public static void main(String[] args) {
        Map<String, Integer> orig = TestResults.getOriginalGrades();
        Map<String, Integer> makeup = TestResults.getMakeUpGrades();

        for (var stud : makeup.entrySet()){
            int first = orig.get(stud.getKey());
            int sec = makeup.get(stud.getKey());

            if(sec > first){
                orig.put(stud.getKey(), sec);
            }
        }
        System.out.println("best grades");
        orig.forEach((k,v) -> System.out.println(k + " " + v));
    }

}