/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author ramses
 */
public class PasswordValidator {
    
    public boolean validatePassword( String password ) {
        return checkSpecialChars( password ) && checkMinLength( password );
    }
    
    
    private boolean checkSpecialChars( String password ) {
        int specialCharCount=0;
        //iterate over each character to see if it is a special character
        for(int i=0;i<password.length(); i++)
        {
            if(!(Character.isLetterOrDigit(password.charAt(i))))
            {
                //now we know there is at least one special character
                specialCharCount++;
            }
        }
        return specialCharCount > 0;     
    }
    
    private boolean checkMinLength( String password ) {
        return password.length() > 7;
    }    
   
}
