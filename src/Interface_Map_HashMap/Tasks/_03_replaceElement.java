package Interface_Map_HashMap.Tasks;

import java.util.HashMap;

public class _03_replaceElement {
    public static void main(String[] args) {
        HashMap<Integer,String>languages=new HashMap<>();
        languages.put(1,"java");
        languages.put(2,"Python");
        languages.put(3,"JavaScript");
        languages.put(4,"C++");
        System.out.println("Original hashmap : "+languages);
        //changing element
        languages.replace(2,"Spring Boot");

        System.out.println("Updated hashmap : "+languages);

    }
}
