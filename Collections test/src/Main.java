import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. ArrayList\n2. LinkedList\n3. HashSet\n4. PriorityQueue\n5. HashMap");
        System.out.print("Which Program (1-5): ");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                arrayLists();
                break;
            case 2:
                linkedLists();
                break;
            case 3:
                hashSet();
                break;
            case 4:
                priorityQueue();
                break;
            case 5:
                hashMap();
                break;
            default:
                System.out.println("Error");
        }
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
        PriorityQueue<Integer> nums1=new PriorityQueue<Integer>();
        PriorityQueue<Integer> nums2=new PriorityQueue<Integer>();
        for(int i=0;i<5;i++){
            nums1.add(i);
            nums2.add(i+6);
        }
        System.out.println(nums1);
        System.out.println(nums2);
        nums1.offer(10);
        System.out.println("Queue: "+nums1);
        System.out.println("Queue Size: "+nums1.size());
        System.out.println("First Element: "+nums1.peek());
        for(int element : nums1){
            System.out.print("Is "+ element + " in both Queues? ");
            System.out.println(nums2.contains(element) ? "Yes": "No");
        }
    }

    private static void hashMap() {
        HashMap<String, Boolean> sickPeople = new HashMap<String, Boolean>();
        sickPeople.put("Jack", true);
        sickPeople.put("Owen", false);
        sickPeople.put("Kareem", false);
        sickPeople.put("Mandy", true);
        int numOfSickPeople = 0;
        for (Map.Entry x : sickPeople.entrySet()) {
            System.out.println(x.getKey() + " Is Sick? " + x.getValue());
            if (Boolean.TRUE.equals(x.getValue())) {
                numOfSickPeople++;
            }
        }
        System.out.println("# of Sick People = "+numOfSickPeople);

        System.out.println("Is Mandy in The List?");
        if(sickPeople.containsKey("Mandy")){
            System.out.println("Yes. Is Sick? "+sickPeople.get("Mandy"));
        }
        else{
            System.out.println("Person Not Found");
        }
        System.out.println(sickPeople.values());
    }
}