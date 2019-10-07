public class Main {
    public static void main(String[] ignored) {
        // 1.)
        Locomotive bigChief = new Locomotive(15, 5311, "Big Chief");
        // 2.)
        Train santaFe = new Train(bigChief, "Santa Fe");
        // 3.)
        santaFe.add(new Car(12, 50));
        santaFe.add(new Car(15, 75));
        santaFe.add(new Car(20, 100));
        santaFe.print();

        // 4.)
        Locomotive steelHorse = new Locomotive(21, 5409, "Steel Horse");
        // 5.)
        Train rioGrandExpress = new Train(steelHorse, "Rio Grand Express");
        // 6.)
        rioGrandExpress.add(new Car(13, 60));
        rioGrandExpress.add(new Car(18, 80));
        rioGrandExpress.print();

        // 7.)
        rioGrandExpress.relink(santaFe);
        rioGrandExpress.print();
        // 8.)
        rioGrandExpress.revert();
        rioGrandExpress.print();
    }
}
