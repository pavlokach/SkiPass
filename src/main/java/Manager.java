public class Manager {
    public static void main(String[] args) {
        WeekendFactory weekendFactory = new WeekendFactory();
        WeekendPass pass = weekendFactory.createPass(1, 0);
        Turnstile turnstile = new Turnstile();
        turnstile.checkPass(pass);
        weekendFactory.passDay();
        turnstile.checkPass(pass);
    }
}
