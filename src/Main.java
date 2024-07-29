import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //* ArrayLists
//! when add smt the list get bigger
//! search process -> O(1)
//! remove process -> O(n)
        //? create a list
        ArrayList cities = new ArrayList();
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("Bursa");
        cities.add("Ankara"); // can add the same value

        System.out.println(cities); // [Ankara, İstanbul, Bursa, Ankara]
        cities.forEach(city -> System.out.println(city));


        //? if has memory location
        cities.add(2,"İzmir");
        System.out.println(cities); // [Ankara, İstanbul, İzmir, Bursa, Ankara]

        cities.remove(2);
        System.out.println(cities); // [Ankara, İstanbul, Bursa, Ankara]

        //? there is no memory location
        int middleIndex = cities.size() / 2; // 4 / 2
        System.out.println("middleIndex: "+ middleIndex);
        cities.add(middleIndex, "X");
        System.out.println("Add into middle: " + cities); // [Ankara, İstanbul, X, Bursa, Ankara]

        middleIndex = cities.size() / 2;
        System.out.println("middleIndex: "+ middleIndex);
        cities.remove(middleIndex);
        System.out.println("remove from middle " + cities); // [Ankara, İstanbul, Bursa, Ankara]

        //* LinkedLists
//! search process -> O(n)
//! remove process -> O(1) because of doubly-linked
        //? create a linked list
        LinkedList linkedCities = new LinkedList();
        linkedCities.add("Tokyo");
        linkedCities.add("Paris");
        linkedCities.add("Berlin");

        System.out.println(linkedCities); // [Tokyo, Paris, Berlin]
        linkedCities.forEach(city -> System.out.println(city));

        //? if has memory location
        linkedCities.add(1,"NewYork");
        System.out.println(linkedCities); // [Tokyo, NewYork, Paris, Berlin]

        linkedCities.remove(1);
        System.out.println(linkedCities); // [Tokyo, Paris, Berlin]


        //? there is no memory location
        int linkedMiddleIndex = linkedCities.size() / 2; // 3 / 2
        System.out.println("linkedMiddleIndex: "+ linkedMiddleIndex);
        linkedCities.add(linkedMiddleIndex, "Y");
        System.out.println("Add into middle: " + linkedCities); // [Tokyo, Y, Paris, Berlin]

        linkedMiddleIndex = linkedCities.size() / 2;
        System.out.println("linkedMiddleIndex: "+ linkedMiddleIndex);
        linkedCities.remove(linkedMiddleIndex);
        System.out.println("remove from middle " + linkedCities); // [Tokyo, Y, Berlin]

    }}