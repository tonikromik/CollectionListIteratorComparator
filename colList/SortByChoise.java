package colList;

import java.util.Comparator;

public class SortByChoise {

    public Comparator<Person> sortByChoise(int choise) {
        switch (choise) {
            case 1:
                return new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                };
            case 2:
                return new SortByAge();
            default:
                return new SortByName();
        }
    }
}
