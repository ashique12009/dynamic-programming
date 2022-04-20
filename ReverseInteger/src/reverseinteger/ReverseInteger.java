/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseinteger;

/**
 *
 * @author HP
 */
public class ReverseInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");
        //int output = reverseInt(12345);
        //System.out.println(output);
        
//        int[] a = new int[]{1,2,3};
//        int output = is123Array(a);
        
//        int[] a = new int[]{1,3,9,27};
//        int output = isRapidlyIncreasing(a);
//        System.out.println(output);

        int result = sum(10);
        
        System.out.println("Sum =" + result);
        
    }
    
    public static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
    }
    
    public static int isRapidlyIncreasing(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        
        int  output = 1;
        int sum = 0;
        int outputFlag = 0;
        
        for (int index = 0; index < a.length - 1; index++){
            if (index == 0) {
                sum += a[index] * 2;
                continue;
            }
            
            sum += a[index] * 2;
            
            if (a[index+1] > sum) {
                outputFlag = 1;
            }
            else {
                outputFlag = 0;
            }
        }
        
        if (outputFlag == 0) {
            output = 0;
        }
        
        return output;
    }
    
    public static int isPairedN(int[] a, int n) {
        int isPairedN = 0;

        if (a.length - 1 + a.length - 2 < n || n < 0) {
            return 0;
        }

        for (int index = 0; index < a.length && isPairedN == 0; index++) {
            for (int nestedIndex = index; nestedIndex < a.length && isPairedN == 0; nestedIndex++) {
                if(a[index] + a[nestedIndex] == n) {
                    if (index + nestedIndex == n){
                        isPairedN = 1;
                    }
                }
            }
        }

        return isPairedN;
    }
    
    public static int is123Array(int[] a) {
        // If the length of the array is 0 or not a multiple of 3, then its not a solution
        if (a.length == 0 || a.length % 3 != 0) {
            return 0;
        }

        for (int index = 0; index < a.length; index += 3) {
            if (a[index] != 1 || a[index + 1] != 2 || a[index + 2] != 3) {
                return 0;
            }
        }

        return 1;
    }
    
    public static int reverseInt(int incomingNumber) {
        int reverseNumber = 0;
        
        while (incomingNumber != 0){
            // pop operation
            int pop = incomingNumber % 10;            
            incomingNumber /= 10;

            // push operation
            int temp = reverseNumber * 10 + pop;
            reverseNumber = temp;
        }
        
        return reverseNumber;
    }
    
}
