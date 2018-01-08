public class WeekendFactory extends Factory {
    public WeekendPass createPass(int daysLeft, int ridesLeft) {
        WeekendPass temporary = new WeekendPass(super.getId(), daysLeft, ridesLeft);
        super.addPass(temporary);
        super.setId(getId() + 1);
        return temporary;
    }
}
