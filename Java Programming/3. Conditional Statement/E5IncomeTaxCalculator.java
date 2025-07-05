public class E5IncomeTaxCalculator {
    
    public static void main(String[] args) {
        
        float income = 18000000;
        float tax;

        if (income < 500000) {
            tax = 0;
        } else if(income >= 500000 && income < 1000000){
            tax = 0.2f;
        } else{
            tax = 0.3f;
        }

        float taxPrice = income * tax;
        float finalPrice = income - taxPrice;
        System.out.println("Your Income after paying tax will be: " + finalPrice + " With tax is: " + taxPrice);
    }
}
