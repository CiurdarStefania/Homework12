package ro.fasttractit.curs12.Homework12;


import java.util.*;

public class Student {
    private final List<Grade> students;

    public Student(List<Grade> students) {
        this.students = new ArrayList<>(students);
    }

    public Map<String, Integer> addAll() {
        Map<String, Integer> result = new HashMap<>();
        result.put("Marian", 3);
        result.put("Ana", 6);
        result.put("Alin", 9);
        return result;
    }

    public Map<String, Integer> maxNumber() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            Map.Entry<String, Integer> maxEntry = null;
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return result;
    }
}