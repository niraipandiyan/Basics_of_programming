import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int n; 
        int max1=0;
        int max2=0;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements:  ");  
        n=sc.nextInt();    
        int[] array = new int[10];  
        System.out.println("Enter the elements: ");  
        for(int i=0; i<n; i++)  
        {  
            array[i]=sc.nextInt();  
        }  
        System.out.println("The elements are: ");   
        for (int i=0; i<n; i++)   
        {  
            System.out.println(array[i]);  
        }
        for(int i=0;i<n;i++)
        {
            if(array[i]>max1)
            {
		max2=max1;
                max1=array[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(array[i]<max1 && max2<array[i])
            {
		max2=array[i];
            }
        }
        System.out.println("The second largest value is :  ");
        System.out.print(max2);   
    }   
}

