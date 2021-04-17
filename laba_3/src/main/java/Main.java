import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        TimeCollection timeCollection = new TimeCollection();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        timeCollection.addMethod(arrayList, "ArrayList");
        timeCollection.addMethod(linkedList, "LinkedList");

        timeCollection.deleteBeginMethod(arrayList, "ArrayList");
        timeCollection.deleteBeginMethod(linkedList, "LinkedList");

        timeCollection.getMidMethod(arrayList, "ArrayList");
        timeCollection.getMidMethod(linkedList, "LinkedList");

        timeCollection.getEndMethod(arrayList, "ArrayList");
        timeCollection.getEndMethod(linkedList, "LinkedList");

        timeCollection.replaceAllMethod(arrayList, "ArrayList");
        timeCollection.replaceAllMethod(linkedList, "LinkedList");

        timeCollection.sizeMethod(arrayList, "ArrayList");
        timeCollection.sizeMethod(linkedList, "LinkedList");
    }
}
