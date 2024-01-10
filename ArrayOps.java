public class ArrayOps {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4};
        int [] array2 = {-1,-2,-3,-4}; 

        // System.out.println(findMissingInt(array1)); 
        // System.out.println(secondMaxValue(array1));
       // System.out.println(containsTheSameElements(array1,array2));
       System.out.println(isSorted(array2));

        
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        boolean missing = false; 
        int j = 0; 

        for (int i = 0; i <= array.length+1; i++){
           missing = false; 
           j = 0;

            while ((missing == false) && (j < array.length)) {
            

                missing = (i == array[j]);
                j++ ;                      
                    
            }
            if (missing == false) {
                return i; 
            }

        }        
        
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max = array[0];
        int max1 = max; 
        for (int i =0; i <array.length; i++){
            max = Math.max(max, array[i]);
        }
        for (int i =0; i <array.length; i++){
            if (array[i]!=max){
                max1 = Math.max(max1, array[i]);
            }
            
        }
        return max1;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean missing = false; 
        int j = 0; 


        for (int i = 0; i < array1.length; i++){
           missing = false; 
           j = 0;

            while ((missing == false) && (j < array2.length)) {
            
                missing = (array1[i] == array2[j]);
                j++ ;                      
                    
            }
            if (missing == false) {
                return false; 
            }

        }        
        
        return true;
}

    public static boolean isSorted(int [] array) {
        // Write your code here:
        if (array[0]>array[1]){
            for (int i = 1; i<array.length-1; i++){
                if (array[i]<array[i+1]){
                    return false;
                }
            }

        }
        else {
            for (int i = 1; i<array.length-1; i++){
                if (array[i]>array[i+1]){
                    return false;
                }
            }
        }
        return true;
    }

}
