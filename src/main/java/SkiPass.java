public abstract class SkiPass {
    private boolean daily;
    private boolean fine = true;
    private int daysLeft;
    private int ridesLeft;
    private int id;


    public SkiPass(int id, int daysLeft, int ridesLeft) {
        if (daysLeft == 0){
            this.daily = false;
        }
        else{
            this.daily = true;
        }
        this.id = id;
        this.daysLeft = daysLeft;
        this.ridesLeft = ridesLeft;
    }

    public boolean isDaily() {
        return daily;
    }

    public void setDaily(boolean daily) {
        this.daily = daily;
    }

    public boolean isFine() {
        return fine;
    }

    public void setFine(boolean fine) {
        this.fine = fine;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public int getRidesLeft() {
        return ridesLeft;
    }

    public void setRidesLeft(int ridesLeft) {
        this.ridesLeft = ridesLeft;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
