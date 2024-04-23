import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Arraylists
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Ethan");
        names.add("Jill");
        names.add("Alex");
        System.out.println("Array: "+names);
        names.set(2,"Pierre");
        names.remove(0);
        System.out.println("Array Size: "+names.size());
        System.out.println("Modified Array: "+names);
        Collections.sort(names);
        System.out.println("Sorted Array: "+names);
        System.out.print("Find person: ");
        String nameToFind = input.next().toLowerCase();
        String formattedName = nameToFind.substring(0, 1).toUpperCase() + nameToFind.substring(1);
        if(names.contains(formattedName)){
            System.out.println("Name Found!");
        }else{
            System.out.println("Name Not Found");
        }
        System.out.print("Retrieve index (0-"+(names.size()-1)+"): ");
        int index = input.nextInt();
        if(index<names.size()){
            System.out.println(names.get(index));
        }else{
            System.out.println("Out of Bounds");
        }
    }
}
