package Interface_List_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _00_Introduction {
        public static void main(String[] args) {
          // TODO
          //  --->List---< provides an ordered and indexed collection and can contain identical objects. If
          //      you need to invoke objects with index frequently in your project and you will store
          //      identical objects, List is the best because ArrayList provides the fastest access to
          //      objects because it stores objects by index.

            //TODO Array : It is used for data in cases where the number of dimensions is certain.
            // Its size cannot be changed later.
            int[] dizi=new int[5];

            //TODO  ArrayList : Its size can change dynamically, that is, it can increase as you add elements,
            //  Array that can decrease as you delete.
          ArrayList<Integer> integerList = new ArrayList<>(); // create an arraylist object
          ArrayList<Boolean> booleanList = new ArrayList<>();
          ArrayList<String> stringList = new ArrayList<>();

          //TODO  String ArrayList
          ArrayList<String> nameList=new ArrayList<>();

          //TODO  adding element
          nameList.add("ozgur");
          nameList.add("Ahmet");
          nameList.add("Ayşe");
          nameList.add("Kaya");
          nameList.add("Kaya");
          System.out.println("nameList = " + nameList);
          //nameList = [ozgur, Ahmet, Ayşe, Kaya, Kaya]

          //TODO  Adding an element to a certain index
          nameList.add(1, "Eray");
          System.out.println("nameList = " + nameList);
          //nameList = [ozgur, Eray, Ahmet, Ayşe, Kaya, Kaya]

          //TODO getting an element from a certain index
          String element=nameList.get(2);
          System.out.println("element = " + element);
          //element = Ahmet

          //TODO Updating an element at a certain index
          nameList.set(1,"Cankut");
          System.out.println("nameList = " + nameList);
          //nameList = [ozgur, Cankut, Ahmet, Ayşe, Kaya, Kaya]

          //TODO  size of list
          int size= nameList.size();
          System.out.println("size = " + size);
          //size = 6

          //TODO  is empty
          boolean isEmpty = nameList.isEmpty();
          System.out.println("isEmpty = " + isEmpty);
          //isEmpty = false

          //TODO  removing
          nameList.remove("Kaya");
          nameList.remove("Kaya");
          System.out.println("nameList = " + nameList);
          //nameList = [ozgur, Cankut, Ahmet, Ayşe]

          nameList.remove(1);  // remove according to index
          System.out.println("nameList = " + nameList);
          //nameList = [ozgur, Ahmet, Ayşe]

          //TODO  finding index of element
          int indexOfKaya= nameList.indexOf("Kaya");
          System.out.println("indexOfKaya = " + indexOfKaya);
          //indexOfKaya = -1

          //TODO  remove all elements of list
          // nameList.clear();
          System.out.println("nameList = " + nameList);
          //nameList = [ozgur, Ahmet, Ayşe]
          isEmpty = nameList.isEmpty();
          System.out.println("isEmpty = " + isEmpty);
          //nameList = [ozgur, Ahmet, Ayşe]

          //TODO  printing list
            for(int i=0; i< nameList.size();i++)
                System.out.println("nameList = " + nameList.get(i));
            //nameList = ozgur
            //nameList = Ahmet
            //nameList = Ayşe

          //TODO What is the difference between array and array list?
          // 1) Arrays-- size is fixed.. Array list size is dyanmic
          // 2) Arrays support primitive and non primitive ---> array list supports only non primitive
          // 3) arrray list is a type Collection  --> Array is a data structure in java

          Integer [] arr = new Integer [4];
          // This is an integer array which has 4 elements
          // 0 0 0 0

          arr[0] = 1;
          arr[1] = 2;
          System.out.println(Arrays.toString(arr));

          // 1, 2 , 0, 0
          // 1, 2 .................

        }
    }


