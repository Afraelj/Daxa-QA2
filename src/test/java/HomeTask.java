import org.junit.jupiter.api.Test;




public class HomeTask {
    @Test
    public void homeTask() {
        Double CreditAmount = 85000.00;
        Integer CreditTerm = 15;
        Double CreditPercentMonthly = 2.42;

        Double consumption = CreditAmount + CreditTerm * 12 * 2.42;


        System.out.println("We take " + CreditAmount + " were Month % is " + CreditPercentMonthly + ", based on" +
                " this information. The final amount will be equal " + consumption);


        String Str1 = "We take 85000.0 were Month % is 2.42, based on this information.";
        String Str2 = "The final amount will be equal 85435.685000";

        System.out.print("String Lenght :");
        System.out.println(Str1.length());

        System.out.print("String Length : ");
        System.out.println(Str2.length());


    }

      }

