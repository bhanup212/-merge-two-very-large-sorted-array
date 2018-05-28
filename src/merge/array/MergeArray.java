/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge.array;

import java.util.Scanner;

/**
 *
 * @author Bhanupro
 */
public class MergeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter elements of first array:");
        String lines=in.nextLine();
        String[] strs = lines.trim().split("\\s+");
        int[] array1 = new int[strs.length];
        int a1 = array1.length;
        for(int i=0;i<strs.length;i++){
            array1[i] = Integer.parseInt(strs[i]);
        }
        System.out.print("Enter elements of second array:");
        String lines2=in.nextLine();
        String[] strs2 = lines2.trim().split("\\s+");
        int[] array2 = new int[strs2.length];
        int a2 = array2.length;
        for(int i=0;i<strs.length;i++){
            array2[i] = Integer.parseInt(strs2[i]);
        }
        int[] sortedArray = new int[a1+a2];
        
       
        sortedArray = merge(array1,array2);
        
        System.out.println("Merged Array :");
		for (int i=0; i < a1+a2; i++)
			System.out.print(sortedArray[i] + " ");
    }
    
    public static int[] merge(int[] a, int[] b) {

    int[] answer = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length)
    {
        if (a[i] < b[j])
        {
            answer[k] = a[i];
            i++;
        }
        else
        {
            answer[k] = b[j];
            j++;
        }
        k++;
    }

    while (i < a.length)
    {
        answer[k] = a[i];
        i++;
        k++;
    }

    while (j < b.length)
    {
        answer[k] = b[j];
        j++;
        k++;
    }

    return answer;
    }
    
}
