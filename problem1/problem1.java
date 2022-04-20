class HelloWorld {
    public static void main(String[] args) {
        int[] a = {5,3,4,1,6,7,8};
        System.out.println(processResult(a));
    }
    
    public static int processResult(int[] incomingArray) {
        if (incomingArray == null || incomingArray.length % 2 == 0)
            return 0;
        
        int middleIndex = incomingArray.length / 2;
        int middleItemValue = incomingArray[middleIndex];
        for (int i = 0; i < incomingArray.length; i++) {
            if (middleItemValue >= incomingArray[i] && i != middleIndex) 
                return 0;
        }
        return 1;
    }

/*
Problem description:
An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly greater than the value of the middle element. 
Note that only arrays with an odd number of elements have a middle element. 
Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
*/
}