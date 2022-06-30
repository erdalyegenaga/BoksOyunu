public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("A" ,10 ,100 ,100,0);
        Fighter f2 = new Fighter("B" ,20 ,80 ,85,0);

        Ring ring = new Ring(f1,f2, 85, 100);
        ring.run();
    }

}
