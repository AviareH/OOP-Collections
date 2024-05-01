import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VotingDatabase database = new VotingDatabase();

        System.out.print("How Many Candidates: ");
        int numsOfCandidates = input.nextInt();
        for(int i=1;i<=numsOfCandidates;i++){
            System.out.println("Candidate "+i+".");
            System.out.print("\tName: ");
            String name = input.next();
            System.out.print("\tID: ");
            int id = input.nextInt();
        }
        Candidate h = new Candidate("John Smith",10001);
        System.out.println(h);

    }
}
