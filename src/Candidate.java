public class Candidate implements Comparable<Candidate>{

    private String name;
    private int relevance;
    private int rate;

    public Candidate(String name, int relevance, int rate) {
        this.name = name;
        this.relevance = relevance;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return name + ", " + relevance + ", " + rate;
    }

    @Override
    public int compareTo(Candidate o) {
        if (o.relevance == this.relevance) {
            if (o.rate > this.rate) {
                return 1;
            } else if (o.rate < this.rate) {
                return -1;
            } else {
                return 0;
            }
        } else if (o.relevance > this.relevance) {
            return 1;
        } else {
            return -1;
        }
    }
}
