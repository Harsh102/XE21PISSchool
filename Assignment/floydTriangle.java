// Not working
package Assignment;
class floydTriangle
{
    public static void main(int num)   
    
    
    {
       int value= 1;
       for(int row=1; row<=num; row++)
        
       {
            for(int coulumn = 1; coulumn>=row; coulumn++)
            {
                System.out.println(value++);
            }
            
       }
 }
}
