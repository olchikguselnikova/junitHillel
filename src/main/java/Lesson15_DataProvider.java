import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson15_DataProvider {
    static List< String > stringList = new ArrayList<>();
    static List< Integer > intList = new ArrayList<>();

    static {
        stringList.add("Kyev");
        stringList.add("Odesa");
        stringList.add("Dnepr");

        intList.add(123);
        intList.add(456);
        intList.add(789);
    }

    public static String getRandomString() {
        return stringList.get(new Random().nextInt(stringList.size()));
    }

    public static Integer getRandomInt() {
        return intList.get(new Random().nextInt(intList.size()));
    }


}
