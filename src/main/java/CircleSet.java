import java.util.HashSet;

public class CircleSet<T> {
    private HashSet<T> hashSet = new HashSet<>();

    public HashSet<T> getHashSet() {
        return hashSet;
    }

    public void setHashSet(HashSet<T> hashSet) {
        this.hashSet = hashSet;
    }

    @Override
    public String toString() {

        StringBuilder hashSetString = new StringBuilder();

        for (T tmpObject : hashSet)
            hashSetString.append(tmpObject.toString()).append("\n");


        return hashSetString.toString();
    }

}
