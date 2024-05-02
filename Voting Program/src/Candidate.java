public class Candidate {
    private String name = "";
    private int id = 0;
    private int num0fVotes = 0;

    public Candidate(String name, int id){
        this.name=name;
        this.id = id;
        this.num0fVotes=0;
    }
    public Candidate(){
        name="N/A";
        id=0;
        num0fVotes=0;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getNum0fVotes() {
        return num0fVotes;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNum0fVotes(int num0fVotes) {
        this.num0fVotes = num0fVotes;
    }
    public void voteFor(){
        num0fVotes++;
    }
    public String candidateInfo() {
        return "ID: "+id+", Name: "+name+", Votes: "+num0fVotes;
    }

    public String toString() {
        return name;
    }
}
