import java.util.*;
public class VotingDatabase {
    private ArrayList<Candidate> candidates = new ArrayList<Candidate>();
    private HashMap<Candidate,Integer> votesPerCandidate = new HashMap<Candidate,Integer>();
    private ArrayList<Candidate> winners = new ArrayList<Candidate>();

    public VotingDatabase(ArrayList<Candidate> candidates, HashMap<Candidate,Integer> votesPerCandidate){
        this.candidates = candidates;
        this.votesPerCandidate = votesPerCandidate;
    }
    public VotingDatabase(){
    }
    public ArrayList<Candidate> getCandidates() {
        return candidates;
    }
    public HashMap<Candidate, Integer> getVotesPerCandidate() {
        return votesPerCandidate;
    }
    public ArrayList<Candidate> getWinners() {
        return winners;
    }
    public void setCandidates(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
    }
    public void setVotesPerCandidate(HashMap<Candidate, Integer> votesPerCandidate) {
        this.votesPerCandidate = votesPerCandidate;
    }
    public void setWinners(ArrayList<Candidate> winners) {
        this.winners = winners;
    }
    public void addCandidate(String name, int id){
        Candidate person = new Candidate(name,id);
        candidates.add(person);
        votesPerCandidate.put(person,0);
    }
    public void addVote(int id){
        candidates.get(id-1).voteFor();
        System.out.println("Vote registered for Candidate "+id);
    }
    public void formattedPrint(){
        System.out.println("\nCandidates:");
        for(int i=1;i<=candidates.size();i++){
            System.out.println(i+". "+candidates.get(i-1));
        }
    }

    private void updateVotes(){
        for (Candidate candidate : candidates) {
            if(candidate.getNum0fVotes()==0){
                votesPerCandidate.remove(candidate);
            }
            else {
                votesPerCandidate.put(candidate, candidate.getNum0fVotes());
            }
        }
    }

    public void determineWinners() {
        updateVotes();
        if (votesPerCandidate.isEmpty()) {
            System.out.println("\nNo Winners");
        } else {
            int highestVote = 0;
            for (Map.Entry<Candidate, Integer> entry : votesPerCandidate.entrySet()) {
                if (entry.getValue() > highestVote) {
                    highestVote = entry.getValue();
                }
            }
            for (Candidate candidate : candidates) {
                int votes = votesPerCandidate.get(candidate);
                if (votes == highestVote) {
                    winners.add(candidate);
                }
            }
        }
    }
    public void printWinners(){
        if (!votesPerCandidate.isEmpty()) {
            System.out.println("\nWinners: ");
            for (Candidate candidate : winners) {
                System.out.println(candidate.candidateInfo());
            }
        }
    }
}
