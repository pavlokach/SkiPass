public class Turnstile {
    public void checkPass(SkiPass skiPass) {
        if (!skiPass.isFine()) {
            System.out.println("Card declined");
        } else {
            if (skiPass.isDaily()) {
                if (skiPass.getDaysLeft() > 0) {
                    System.out.println("It's fine!");
                } else {
                    System.out.println("Your lucky days are over(");
                    skiPass.setFine(false);
                }
            } else {
                if (skiPass.getRidesLeft() > 0) {
                    skiPass.setRidesLeft(skiPass.getRidesLeft() - 1);
                    System.out.println("You've used one ride. Have fun!");
                } else {
                    System.out.println("You need more juice. Oh. I mean rides.");
                    skiPass.setFine(false);
                }
            }
        }
    }
}
