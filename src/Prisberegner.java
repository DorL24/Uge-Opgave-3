public class Prisberegner {

    // opgave 3

/* Lav et program til en webshop der beregner slutprisen på et produkt ved at anvende rabat og derefter moms.*/
 // Metoder der returnerer værdier:


}
    double applyDiscount(double price, double discountPercent){
    double discount = price * discountPercent/100;
    return price - discount;

     }
     double addTax(double price){
      return price * ( price * 0.25);

     }

     double calculateFinalPrice(double basePrice,double discount){
     return addTax(applyDiscount(basePrice, discount));

     }



   void main (){
    double finalPrice = calculateFinalPrice(500,20); // I main: kald calculateFinalPrice() og gem resultatet i en variabel, udskriv det
       System.out.println("Final Price: " + finalPrice);

       // extra challenge

     Scanner Scanner = new Scanner (System.in);
       System.out.println("Type the basic Price and discount Percent");
       double basicPrice = Scanner.nextDouble();
       double discountProcent = Scanner.nextDouble();

       //switch (expression) {
       //    case value1:
       //        // code
       //        break;
       //    case value2:
       //        // code
       //        break;
       //    default:
       //        // code
       System.out.println(" customerType: Normal/Student/Senior");
       String customerType = Scanner.next();

        double discount = 0;
        switch (customerType){

            case "normal":
                discount = 0;
                break;

            case "Student":
                discount = 25;
                break;

            case "Senior":
                discount = 15;

            default:
                discount = 0;




       }







   }







