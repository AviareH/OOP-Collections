import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. ArrayList\n2. LinkedList\n3. HashSet\n4. PriorityQueue\n5. TreeMap");
        System.out.print("Which Program (1-5): ");
        int choice = input.nextInt();
        arrayLists();
        linkedLists();
        hashSet();
        priorityQueue();
    }

    private static void arrayLists() {
        Scanner input = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Ethan");
        names.add("Jill");
        names.add("Alex");
        System.out.println("ArrayList: " + names);
        names.set(2, "Pierre");
        names.remove(0);
        System.out.println("ArrayList Size: " + names.size());
        System.out.println("Modified ArrayList: " + names);
        Collections.sort(names);
        System.out.println("Sorted ArrayList: " + names);
        System.out.print("Find person: ");
        String nameToFind = input.next().toLowerCase();
        String formattedName = nameToFind.substring(0, 1).toUpperCase() + nameToFind.substring(1);
        if (names.contains(formattedName)) {
            System.out.println("Name Found!");
        } else {
            System.out.println("Name Not Found");
        }
        System.out.print("Retrieve index (0-" + (names.size() - 1) + "): ");
        int arrayIndex = input.nextInt();
        if (arrayIndex < names.size()) {
            System.out.println(names.get(arrayIndex));
        } else {
            System.out.println("Out of Bounds");
        }
    }
    private static void linkedLists () {
        Scanner input = new Scanner(System.in);
        LinkedList<String> colours = new LinkedList<String>();
        colours.add("Yellow");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Purple");
        System.out.println("Linked List: " + colours);
        colours.add(2, "Red");
        colours.remove(0);
        colours.set(3, "Pink");
        Collections.swap(colours, 0, 2);
        colours.offerLast("Maroon");
        System.out.println("LinkedList Size: " + colours.size());
        System.out.println("Modified LinkedList: " + colours);
        Collections.shuffle(colours);
        System.out.println("Shuffled LinkedList: "+colours);
    }
    private static void hashSet(){
        HashSet<String> fruits = new HashSet<String>();
        HashSet<String> favoriteFruits = new HashSet<String>();
        fruits.add("Apple");
        fruits.add("Oranges");
        fruits.add("Pineapple");
        fruits.add("Peach");
        favoriteFruits.add("Strawberry");
        favoriteFruits.add("Peach");
        System.out.println("HashSet: "+fruits);
        System.out.println("HashSet Size: "+fruits.size());
        System.out.println("HashSet (Favorite Fruit): "+favoriteFruits);
        fruits.remove("Pineapple");
        fruits.add("Strawberry");
        System.out.println("Modified HashSet: "+fruits);
        System.out.println("HashSet Empty = "+fruits.isEmpty());
        favoriteFruits.retainAll(fruits);
        System.out.println("In Common: "+favoriteFruits);
    }
    private static void priorityQueue(){
        PriorityQueue<Integer> nums=new PriorityQueue<Integer>();
        for(int i=0;i<5;i++){
            nums.add(i);
        }
        System.out.println(nums);
    }

}