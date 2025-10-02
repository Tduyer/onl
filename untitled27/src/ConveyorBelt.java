public class ConveyorBelt implements Machine {
    @Override
    public void start() { System.out.println("Conveyor started"); }

    @Override
    public void performTask() { System.out.println("Moving items"); }

    @Override
    public void stop() { System.out.println("Conveyor stopped"); }
}
