package a690;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2021/5/1 22:20
 */
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}
public class Solution {


    Map<Integer,Integer> hashMap=new HashMap<>();
    Map<Integer, Employee> map = new HashMap<Integer, Employee>();
    public int getImportance(List<Employee> employees, int id) {
        if(map.containsKey(id)){
            return hashMap.get(id);
        }
        Employee e=null;
        for(Employee employee:employees){
            if(employee.id==id){
                e=employee;
            }
        }
        int res=e.importance;
        for (Integer integer:e.subordinates){
            res+=getImportance(employees,integer);
        }
        hashMap.put(id,res);
        return res;
    }

    public int getImportance2(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return dfs(id);
    }

    public int dfs(int id) {
        Employee employee = map.get(id);
        int total = employee.importance;
        List<Integer> subordinates = employee.subordinates;
        for (int subId : subordinates) {
            total += dfs(subId);
        }
        return total;
    }
}
