package Assignment;
class BankDeposit
{
  public static void main(int choose,double p,double r, double n)  
  {
      switch (choose)
      {
         case 1:
         double amount= (p*(Math.pow((100+r)/100,n)));
         System.out.println("The Amount is"+amount);
         break;
         case 2:
         double rate,term;
         rate= r/100;
         term=(n*(n+1))/(2*12);
         double amount1 = ((p*n)+p*rate*term);
         System.out.println("The Amount is"+amount1);
         break;
         default:
         System.out.println("Please enter 1 or 2 in 'choose' variable");
         break;
      }
  }
}