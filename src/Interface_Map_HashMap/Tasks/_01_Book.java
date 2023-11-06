package Interface_Map_HashMap.Tasks;

import java.util.HashMap;
import java.util.Map;

public class _01_Book {
    int id;
    String name, author;

    public _01_Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    static class MapExample {
        public static void main(String[] args) {
            HashMap<Integer, _01_Book> map = new HashMap<>();
            _01_Book b1 = new _01_Book(101, "Let us C", "Yaswent");
            _01_Book b2 = new _01_Book(102, "Java", "Ozgur");
            _01_Book b3 = new _01_Book(103, "Testing", "Burcu");

            map.put(1,b1);
            map.put(2,b2);
            map.put(3,b3);

            //Traversin map
            for (Map.Entry<Integer,_01_Book> e : map.entrySet()){
                int key=e.getKey();
                _01_Book b=e.getValue();
                System.out.println(key+"th. Book details");
                System.out.println(b.id+" "+b.name+" "+b.author);
            }
        }

    }
}
