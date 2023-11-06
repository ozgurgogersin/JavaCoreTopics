package Interface_Map_HashMap.Tasks;

import java.util.HashMap;
import java.util.Map;

//TODO Write an array program in Java
//     to count the repeated elements in the given array
//     int[] array = {1, 2, 3, 2, 4, 1, 5, 2, 3, 6};
//    Repeated elements in the array:
//    1 - Count: 2
//    2 - Count: 3
//    3 - Count: 2
public class _05_CountRepeatedElementsfromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5, 2, 3, 6};
        Map<Integer,Integer>map=new HashMap<>();
        for (int element: array){
            if (map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }else {
                map.put(element,1);
            }
        }
        System.out.println(map);
//TODO Display the repeated elements and their counts
        for (Map.Entry<Integer,Integer> e:map.entrySet()){
            if (e.getValue()>1){
                System.out.println(e.getKey()+" -Count:"+e.getValue());
            }
        }
    }
}
