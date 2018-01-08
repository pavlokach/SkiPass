import java.util.ArrayList;
import java.util.List;

public abstract class Factory {
    private int id = 0;
    private List<SkiPass> skiPasses = new ArrayList<SkiPass>();

    public void passDay() {
        for (SkiPass pass : getSkiPasses()
                ) {
            if (pass.isDaily()) {
                pass.setDaysLeft(pass.getDaysLeft() - 1);
            }
        }
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public List<SkiPass> getSkiPasses() {
        return skiPasses;
    }


    public void addPass(SkiPass skiPass) {
        skiPasses.add(skiPass);
    }


}

