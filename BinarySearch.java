import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Taking inputs from the user on how many elements he wants in the array
        System.out.println("Enter number of elements you want to search for");
        int a = sc.nextInt();
        int[] user = new int[a]; // Setting the size of the array
        for(int enter=0;enter<a;enter++)
        {
            System.out.println("enter element: "+(enter+1)); //user enters element by element
            user[enter] = sc.nextInt();
        }
        System.out.println("Your entered array is "+Arrays.toString(user)); //The array is displayed for the user after he enters all the elements

        //Bubble Sort
        // Optimized the bubble sort algorithm by reducing with i and swap
        for(int i=0; i<a-1;i++)
        {
            int swap = 0;
            for(int j=0; j<a-1-i;j++)
            {
                if(user[j]>user[j+1])
                {
                    user[j] = user[j]+user[j+1]; //3,4-j,j+1
                    user[j+1] = user[j] - user[j+1];
                    user[j] = user[j] - user[j+1];

                    // increment swap
                    swap = 1;
                }
            }

            if(swap == 0){
                System.out.println(i);
                break;
            }
        }
        //Displaying the sorted array to perform Binary Search
        System.out.println("Your Sorted array is: "+Arrays.toString(user));

        //Binary Search Logic
        System.out.println("Enter the element you want to search for ");
        int search = sc.nextInt();

        int l=0;
        int h = a-1;
        while(l<=h) {
            int mid = (l+h)/2;
            if(user[mid]==search)
            {
                System.out.println("Element found at index "+mid);
                break;
            }
            else if(search<user[mid]) {
                h = mid - 1;
            }

            else if(search>user[mid])
                {
                    l = mid + 1;
                }
        }
        if(l>h)
        {
            System.out.println("Element not found");
        }
    }
}
