package Assignment;
class intRandom
{
    public static void main (String args[])
    {
        
        for(int limit=1; limit<=20; limit++ )
        {
          double randomNo= (Math.random()*100);
          System.out.println(randomNo);
          
        }
    }
}