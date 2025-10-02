public class LegacyWeldingAdapter implements Machine {
    private LegacyWeldingMachine legacy;

    public LegacyWeldingAdapter(LegacyWeldingMachine legacy) {
        this.legacy = legacy;
    }

    @Override
    public void start() { System.out.println("Adapter init legacy welding"); }

    @Override
    public void performTask() { legacy.startWeld(3); }

    @Override
    public void stop() { System.out.println("Adapter stop legacy welding"); }
}
