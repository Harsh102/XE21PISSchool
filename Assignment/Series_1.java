package Assignment;
class Series_1
{
  public static void main (String args[])  
  {
      int s= 0,b=2;
      for(int a=1; a<=20; a++)
      {
          if(a%4==0)
          {
              s=s-b;
             
          }
          else if(a%2==0)
          {
               s=s+b;
          }
          b=b+1;
      }
      System.out.println(s);
  }
}