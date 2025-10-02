public class MachineFactory {
    public static Machine createMachine(String type) {
        return switch (type) {
            case "conveyor" -> new ConveyorBelt();
            default -> throw new IllegalArgumentException("Unknown machine: " + type);
        };
    }
}
