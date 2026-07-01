import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemergingSystem {
    public static List<Employee> demergePersonnel(List<Employee> inputList) {
        Queue<Employee> NU = new LinkedList<>();
        Queue<Employee> NAM = new LinkedList<>();

        for (Employee p : inputList) {
            if (p.getGender().equalsIgnoreCase("Nu")) {
                NU.add(p);
            } else if (p.getGender().equalsIgnoreCase("Nam")) {
                NAM.add(p);
            }
        }

        List<Employee> outputList = new ArrayList<>();

        while (!NU.isEmpty()) {
            outputList.add(NU.poll());
        }

        while (!NAM.isEmpty()) {
            outputList.add(NAM.poll());
        }

        return outputList;
    }
}
