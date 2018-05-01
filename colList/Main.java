package colList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        //creating arraylist
//        List<String> list = new ArrayList<>();
//
//        // to add something to arraylist
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("one");
//        list.add("six");
//
////        List<String> s = new ArrayList<>();
////        s.add("two");
////        s.add("three");
////        s.add("six");
////        s.add("seven");
//
////        // to sout list 2 methods: ass array or by foreach cycle
////        System.out.println(list);
////        for (String s : list) {
////            System.out.print(s + " ");
////        }
////        System.out.println();
////
////        //to see size of arraylist
////        System.out.println(list.size());
////
////        //to sse if there are such elements as we want to see
////        System.out.println(list.contains("two"));
////
////        //to get element by id number
////        System.out.println(list.get(2));
////
////        //to get last using of element (index)
////        System.out.println(list.lastIndexOf("one"));
////
////        //to remove some element from list
////        list.remove(1);
////        System.out.println(list);
////
////        //to replace element for new one by setting index of element,
////        // which we want to replace and setting new value
////        list.set(0, "seven");
////        System.out.println(list);
////
////        //to clear list
////        list.clear();
////        System.out.println(list);
//
////        //to remove all elements, which are the same
////        // to our second list's elements
////        list.removeAll(s);
////        System.out.println(list);
//
////        //to remove all unique elements in two collections
//////        list.retainAll(s);
//////        System.out.println(list);
//////
//////        //to check if list is empty
//////        System.out.println(list.isEmpty());
//////
//
//        //ArrayList as Class, which implements List Interface
//
//        //to put one collection to another
//        ArrayList<String> arrayList = new ArrayList<>(list);
//        System.out.println(arrayList);
//        //or
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.addAll(list);
//        System.out.println(arrayList1);
//
//        // method trimToSize() will free our memory if size of array list
//        // is too big and there are many empty "cells"
//        arrayList.trimToSize();
//
//        // to set min size of your arrayList
//        arrayList.ensureCapacity(40);
//
//        //LinkedList as Class, which implements List Interface
//
//        LinkedList<String> linkedList = new LinkedList<>(list);
//
//        // as add but puts element at first place
//        linkedList.push("five");
//        System.out.println(linkedList);
//        // the same
//        linkedList.addFirst("eight");
//        // on last place
//        linkedList.addLast("ten");
//        System.out.println(linkedList);
//
//
//        //to delete first element of list
//        linkedList.pop();
//        System.out.println(linkedList);
//        //the same
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        System.out.println(linkedList);
//
//
//
//
//

// Ітератор

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Roman", 28));
        people.add(new Person("Vova", 29));
        people.add(new Person("lena", 32));
        people.add(new Person("Anna", 5));
        people.add(new Person("oleg", 12));


        //Ітератор - інтерфейс - готовий паттерн проектування,
        //який допомагає працювати з колекціями.
        //В <> вказуємо по чому буде "ходити" ітератор
        // Використовується як з індексованими колекціями, так і з сетом
        //Перебирає колекцію тільки вперід (в одному напрямку)
//        Iterator <Person> personIterator = people.iterator();
//        //personIterator.hasNext.while
//        while (personIterator.hasNext()) {
//            Person person = personIterator.next();
//            System.out.println(person);
//        }
//
//        while (personIterator.hasNext()) {
//            Person person = personIterator.next();
        //// видаляємо олега з колекції
//            if (person.getName().equals("oleg")){
//               personIterator.remove();
//            }
//        }
//        System.out.println(people);


        //ListIterator

        //ListIterator перебирає колекцію як вперід, так і назад
        //використовується тільки з індексованими колекціями (
        // linkedList та arrayList)

//        ListIterator<Person> listIterator = people.listIterator();
//        //  Прохід вперед
//        while (listIterator.hasNext()) {
//            Person person = listIterator.next();
//            System.out.println(person);
//        }
//        System.out.println();
//        // Пройшли в кінець списку і Олега заміняємо на Олю
//        listIterator.set(new Person("Olya", 19));
//        // Прохід назад
//        while (listIterator.hasPrevious()) {
//            Person person = listIterator.previous();
//            System.out.println(person);
//        }


        // Сортування за допомогою вже готового інтерфейсу
        // Collections (java.util)
        ArrayList<String> strings = new ArrayList<>();
        strings.add("b");
        strings.add("h");
        strings.add("w");
        strings.add("a");
        System.out.println(strings);
        System.out.println();

        Collections.sort(strings);
        System.out.println(strings);


        //Або можна посортувати відразу звернувшись в нашу колекцію
        //через компаратор
//        Collections.sort(people); // буде наразі помилка,
        // бо невідомо по чому сортувати: по імені чи по віку
        // тому створюємо допоміжні класи для сортування
        //SortByName, SortByAge і SortByChoise

        //Компаратор - інтерфейс, за допомогою якого можна сортувати
        //свої колекції, якщо його імплементувати і переписати його метод
        // (ctrl+o) і вибираємо єдиний абстрактний метод compare()

        Collections.sort(people, new SortByChoise().sortByChoise(2));
        System.out.println(people);

    }
}
