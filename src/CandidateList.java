import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class CandidateList {

    private StringBuilder stringBuilder = new StringBuilder();
    private NavigableSet<Candidate> candidateSet = new TreeSet<>();

    public void addInList(Candidate candidate) {
        candidateSet.add(candidate);
    }

    @Override
    public String toString() {
        Iterator<Candidate> iter = candidateSet.iterator();
        while (iter.hasNext()) {
             stringBuilder.append(iter.next().toString() + "\n");
        }
        return stringBuilder.toString();
    }
}
