import java.util.ArrayList;
import java.util.List;

public class ProductionLineController {
    private List<Machine> machines = new ArrayList<>();

    public void addMachine(Machine m) {
        machines.add(m);
    }

    public void runCycle() {
        for (Machine m : machines) {
            m.start();
            m.performTask();
            m.stop();
            System.out.println("----");
        }
    }
}
