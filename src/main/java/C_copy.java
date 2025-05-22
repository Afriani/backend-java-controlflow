public class C_copy {
    public static void main(String[] args) {
        printCountdown();
        printAlphabets();
        printArrayElements();
    }

    //
    // ForLoops 1
    //

    static void printCountdown() {
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift off!");
    }

    //
    // ForLoops 2
    //

    // Bekijk onderstaand voorbeeld:
    // for(char c = 'a'; c <= 'z'; c++){
    // }
    // Dit voorbeeld gebruikt een for loop om door alle characters van a t/m z te loopen.
    // Implementeer 2 for-loops om a t/m z en daarna A t/m Z te printen.
    static void printAlphabets() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }
    }

    //
    // ForLoops 3
    //
    // Hieronder zie je een array. We gaan arrays later behandelen, voor nu hoef je maar 3 dingen te weten.
    // 1. De array is een lijstje van nummers
    // 2. Je kunt de lengte van een Array opvragen met de length property (numbers.length)
    // 3. Je kunt een individueel element ophalen met de index (numbers[0] == 4, numbers[1] == 3)
    static void printArrayElements() {
        int[] numbers = {4, 3, 6, 8, 2, 3, 2, 2, 0, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}