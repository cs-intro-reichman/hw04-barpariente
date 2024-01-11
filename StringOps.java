public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
       
        String S = "   Intro to  coMPUter"; 
        int [] a = allIndexOf(S, 'l'); 
        System.out.println("camelCase :"+camelCase(S));
          /*   for (int i =0; i<a.length; i++){
                 System.out.println(a[i]);
           } */    
  
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String newString = ""; 
        char s = ' '; 
        for (int i=0; i<string.length(); i++){
            s = string.charAt(i);
            
            if ((s >= 65)&&(s <= 90)){

                s = (char)(s + 32); 

            }
            if ((s == 'a') || (s == 'e')|| (s == 'i')|| (s == 'o')||(s == 'u')) {
                s = (char)(s - 32); 
           
                }
            newString = newString + s; 
        }
        return newString;
    }

    public static String camelCase (String string) {
        // Write your code here:
        int i = 0; 
        char s = string.charAt(i); 
        String newString = ""; 
        while (s == ' '){
            i++; 
            s = string.charAt(i);
        }
        while (i < string.length()) {

            s = string.charAt(i);
            
            if ((s >= 65)&&(s <= 90)){
                s = (char)(s + 32); 
            }    
            while (s == 32) {
                i ++; 
                s = string.charAt(i);

                    if ((s >= 97)&&(s <= 122)){
                      s = (char)(s - 32);
                    }
            }
            i++;
            newString = newString + s; 
        }
        return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
     
        int count = 0; 
        int place = 0; 
        int sum = 0; 
        int [] a = new int[string.length()];
        for (int i = 0 ; i<string.length(); i++){

                if (string.charAt(i) == chr) {
                    count ++; 
                    a [i] ++; 
                }     
            }
        int [] b = new int[count];

        int j =0; 

            for (int i = 0 ; i<string.length(); i++){

               if (a[i] == 1){
                 b [j] = i; 
                 j++; 
               }
            
            } 
        
        return b;
    }
}
