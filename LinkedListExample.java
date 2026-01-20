import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Grapes");
        list.addFirst("Orange");
        list.addLast("Mango");

        System.out.println(list.peek());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(2);
        list.removeFirst();
        list.removeLast();

        System.out.println(list.contains("Banana"));

        list.clear();
        System.out.println(list);
    }
}

// list.add(value) appends value at the end
// list.add(index, value) new node is inserted at index
// list.addFirst(value) or list.push(value) adds value at the beginning
// list.addLast(value) or list.offer(value) adds value at the end
// list.set(index, value) replaces the value at index
// list.remove(index) removes node at index
// list.removeFirst() or list.pop() removes first node
// list.removeLast() removes last node
// list.clear() removes all elements
// list.contains(value) returns boolean checking presence of value
// list.get(index) returns value at index
// list.getFirst() returns first element
// list.getLast() returns last element
// list.indexOf(value) returns index of first occurrence of value else -1
// list.size() returns number of elements in the list
// list.peek() returns first element without removing it
// list.toString() returns string representation of the list
// list.hasNext() and list.next() for iterators
// list.poll() retrieves and removes the head (first element) of the list
