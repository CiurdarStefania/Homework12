package ro.fasttractit.curs12.Homework12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TryMap {
    private final List<Person> pers;

    public TryMap(List<Person> pers) {
        this.pers = pers;
    }
    public Map<Integer, List<Person>> getListPers(){
        Map<Integer, List<Person>> result = new HashMap<>();
      return  result;
    }
    public Map<String,List<String>> getColor(){
        Map<String, List<String>> result = new HashMap<>();
        result.entrySet();
        return result;
    }

    public Map<String, Integer> getAgee() {
        Map<String, Integer> result = new HashMap<>();
        for (Person prs : pers){
            if(prs.getAge()>20){
                result.remove(prs.getName());
            }
        }
        return result;
    }

    public Map<List<String>, Integer> getPerson() {
        Map<List<String>, Integer> result = new HashMap<>();
        return result;
    }

    public Map<List<String>, String> removeNume() {
        Map<List<String>, String> result = new HashMap<>();
        return (Map<List<String>, String>) result.keySet();
    }
}
