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
}
