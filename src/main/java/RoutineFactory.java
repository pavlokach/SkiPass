public class RoutineFactory extends Factory {
    public RoutinePass createPass(int daysLeft, int ridesLeft) {
        RoutinePass temporary = new RoutinePass(super.getId(), daysLeft, ridesLeft);
        super.addPass(temporary);
        super.setId(getId() + 1);
        return temporary;
    }
}
