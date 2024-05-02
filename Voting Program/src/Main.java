import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VotingDatabase database = new VotingDatabase();
        int numsOfCandidates = 0;

        while(true) {
            System.out.print("How Many Candidates: ");
            try {
                numsOfCandidates = input.nextInt();
                if(numsOfCandidates > 0) {
                    for (int i = 1; i <= numsOfCandidates; i++) {
                        System.out.println("Candidate " + i + ".");
                        System.out.print("\tName: ");
                        String name = input.next();
                        database.addCandidate(name, i);
                    }
                    break;
                } else{
                    System.out.println("Number Must be Greater Than 0");
                }
            } catch(InputMismatchException e) {
                System.out.println("Please Enter an Integer");
                input.nextLine();
            }
        }

        while(true){
            database.formattedPrint();
            System.out.print("Enter the ID of the candidate you want to vote for (or enter 0 to stop): ");
            try {
                int choice = input.nextInt();
                if(choice > 0 && choice <= numsOfCandidates) {
                        database.addVote(choice);
                } else if (choice==0) {
                    System.out.println("Voting Aborted");
                    break;
                } else {
                    System.out.println("Number Must be Between 1-" + numsOfCandidates);
                }
            } catch(InputMismatchException e) {
                System.out.println("Please Enter an Integer");
                input.nextLine();
            }
        }

        database.determineWinners();
        database.printWinners();
    }
}
