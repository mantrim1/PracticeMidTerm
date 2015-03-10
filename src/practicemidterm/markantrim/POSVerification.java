/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicemidterm.markantrim;

/**
 *
 * @author Mark
 */
public class POSVerification {
    
        /**
     * generic method to test if a double is greater than 0
     * @param tester the double to be tested
     * @param message the name of the variable to be tested makes fixing the error easier
     */
    public static final void testIfDoubleAbove0(double tester, String message)throws IllegalArgumentException{
        if(0>=tester){
            throw new IllegalArgumentException(message+" can't be less than 0");
        }
    };
    /**
     * tests if a string is empty or null for strings that don't have specific requirements
     * @param tester the string to be tested
     * @throws IllegalArgumentException if the string is empty or null
     */
    public static void testIfEmpty(String tester)throws IllegalArgumentException{
          if(tester==null || tester.isEmpty()){
        throw new IllegalArgumentException("Data Was Not Entered Or Empty");
    }
    }
    /**
     * tests if id numbers match the selected format
     * @param tester string to be tested
     * @throws IllegalArgumentException if the format is not matched 
     */
    public static final void customerIdNumbers(String tester)throws IllegalArgumentException{
       POSVerification.testIfEmpty(tester);
       if(tester.length()!=3){
           throw new IllegalArgumentException( "Code does not match the corect length" );
       }
       char[] chars = tester.toCharArray();
            for(char t : chars){
                if(!Character.isDigit(t)){
                    throw new IllegalArgumentException( "Code must be numbers only");
                    
                }
            }
    }
    /**
     * tests if qty is greater than 0. if an there are 0 of an item it shouldn't be on th invoice
     * @param tester int to be tested
     * @throws IllegalArgumentException if qty is less than 0
     */
    public static final void testQty(int tester) throws IllegalArgumentException{
        
        POSVerification.testIfNotNegative(tester, "Qty");
    }
    /**
     * tests if cost is not negative
     * @param tester double to be tested
     * @throws IllegalArgumentException if cost is less than 0
     */
    public static final void testCost(double tester) throws IllegalArgumentException{
       if(0>tester){
            throw new IllegalArgumentException("Cost can't be less than 0");
        }
    }
    
    /**
     * tests if a number is not negative
     * @param tester the double to be tested
     * @param message the name of the item being tested for use in the error message
     */
    public static void testIfNotNegative(double tester, String message)throws IllegalArgumentException
    {
        if(0>tester){
            throw new IllegalArgumentException(message+" can't be less than 0");
        }
    }
    /**
     * tests if the discount is not negative
     * @param tester the amount to be tested
     * @throws IllegalArgumentException  f the item is negative
     */
    public static void testDiscount(double tester)throws IllegalArgumentException
    {
        POSVerification.testIfNotNegative(tester, "Discount");
    }
    
    
}
