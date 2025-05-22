public class B_copy{
    public static void main(String[] args) {

        //
        // WhileLoops 1
        //

        int i = 0;
        // Voeg een while loop toe die van 1 tot en met 10 telt.

        while (i < 10) {
            i += 1;
            System.out.println(i);
        }

        //
        // WhileLoops 2
        //

        int x = 20;
        int y = 3;
        // Voeg een while loop toe zodat onderstaand statement wordt geprint zolang x of y niet kleiner worden dan 1

        while (x >= 1 && y >= 1) {
            System.out.println("Size = " + x-- + " x " + y--);
        }

        //
        // WhileLoops 3
        //

        int smallest = 0;
        int largest = 10;
        int numberOfLoops = 0;
        while(smallest < largest) {
            // pas de increment en decrement van smallest en largest aan zodat de loop 4x wordt uitgevoerd.
            System.out.println("Loop " + (numberOfLoops + 1) + ": smallest = " + smallest + ", largest = " + largest);
            smallest += 1;
            largest -= 2;
            numberOfLoops++;
        }
        System.out.println(numberOfLoops);

    }
}