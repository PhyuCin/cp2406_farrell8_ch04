public class FormLetterWriter {

    public static void displaySalutation(String lastName){
        System.out.println("\nDear Mr. or Ms. " + lastName + ",");
    }

    public static void displaySalutation(String firstName, String lastName){
        System.out.println("\nDear " + firstName + " " + lastName + ",");
    }

    public static void displayLetter(){
        System.out.println("Thank you for your recent order.");
    }

    public static void main(String[] args){
        String firstName = "Harry";
        String lastName = "Potter";
        displaySalutation(firstName, lastName);
        displayLetter();
        displaySalutation(lastName);
        displayLetter();
    }
}
