package edu.akki.practice;

public class Questions {

    /**
     * Method to check if two strings are anagrams or not
     *
     * @param inp
     * @return
     */
    public boolean checkForAnagrams(String inp) {
        return (new StringBuffer(inp).reverse().toString().equals(inp));
    }

    /**
     * Method to replace input string with replacement string for all spaces
     *
     * @param inp
     * @param rep
     * @return
     */
    public String replacement(String inp, String rep) {
        return inp.replace(" ", rep);
    }


    /**
     * Method to determine if string contains all unique characters
     *
     * @param inp
     */
    public Boolean findUniqueness(final String inp) {
        boolean flag = true;
        for (int i = 0; i < inp.length(); i++) {
            for (int j = i + 1; j < inp.length(); j++) {
                if (inp.charAt(i) == inp.charAt(j)) {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public Boolean findUniquenessWithLesscomplexity(final String inp) {
        boolean flag = true;
       char[] c=inp.toCharArray();
       for(int i=0;i<c.length;i++){
           if(c[i]!=c[i+1]){
               continue;
           }else{
               flag=false;
               break;
           }

       }
        return flag;
    }



}
