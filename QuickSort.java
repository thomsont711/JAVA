package oopj;
import java.util.Scanner;
public class QuickSort
{
    public static void main(String[] args)
    {
        int n;
        String temp;
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter number Elments:");
        n = sc.nextInt();
        String names[] = new String[n];
        System.out.println("Enter the names:");
        for(int i = 0; i < n; i++)
            names[i] = s1.nextLine();
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.print("Names in ascending order:\n");
        for (int i = 0; i < n - 1; i++)
            System.out.print(names[i] + "\n");
        System.out.print(names[n - 1]);
    }
}