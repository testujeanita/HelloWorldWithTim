public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Anita");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore <100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <=90)) {
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is suppose to happen isCar for true !isCar for false");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

        if (isDomestic) {
            System.out.println("This make of Car is Domestic");
        }

        String s = (isDomestic) ? "This car is Domestic" : "This car is not Domestic";
        System.out.println(s);

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is " + ageText);

        double step1 = 20.00;
        double step2 = 80.00;
        double step3 = (step1 + step2) * 100.00;
        double step4 = step3 % 40.00;
        boolean isTrue = step4 == 0.00;
        System.out.println("isTrue = " + isTrue);
        if (!isTrue) {
            System.out.println("Got some remainder");
        }
        System.out.println("step3 = " + step3);
        System.out.println("step4 = " + step4);

//        boolean isTrue = (step4 == 0.00) ? true : false;
//        System.out.println(isTrue);

//        if (step4 != 0.00) {
//            System.out.println("Got some remainder");






    }
}
