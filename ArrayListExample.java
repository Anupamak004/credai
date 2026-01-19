import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(1);
        numArray.add(5);
        numArray.add(7);
        numArray.set(0, 5);
        numArray.add(1, 9);
        numArray.remove(5);
        System.out.println(numArray.indexOf(8));
        numArray.remove(Integer.valueOf(5));

        if (numArray.contains(5)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        for (int i = 0; i < numArray.size(); i++) {
            System.out.println(numArray.get(i));
        }

        numArray.clear();
        if (numArray.isEmpty()) {
            System.out.println("Array is empty");
        }
        System.out.println(numArray);
    }
}

// arrayList.add(value) will append value at the end
// arrayList.set(index, value) will replace the value
// arrayList.add(index, value) will shift elements to right and insert value at
// index
// arrayList.remove(index)
// for integers use arrayList.remove(Integer.valueOf(value))
// arrayList.remove(value)
// arrayList.contains(value) returns boolean checking presence of value
// arrayList.get(index) returns value at index
// arrayList.size()
// arrayList.clear()
// arrayList.isEmpty()
// arrayList.toString() returns string representation of arrayList
// arrayList.indexOf(value) returns index of first occurrence of value else -1
// arrayList.hasNext() and arrayList.next() for iterators
// arrayList extends AbstractList and implements List interface