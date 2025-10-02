public class Main {
    public static void main(String[] args) {
        ProductionLineController controller = new ProductionLineController();

        Machine conveyor = MachineFactory.createMachine("conveyor");

        Machine legacyWeld = new LegacyWeldingAdapter(new LegacyWeldingMachine());

        controller.addMachine(conveyor);
        controller.addMachine(legacyWeld);

        controller.runCycle();
    }
}
