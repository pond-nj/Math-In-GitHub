/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtourl;

import java.util.Scanner;
import java.net.URLEncoder;

/**
 *
 * @author nutdranai.jaruthikorn
 */
public class StringToUrlForMathGitHub {
    
    //ask user to input math equation to convert to URL
    private static String getInputString( ){
        Scanner scan = new Scanner( System.in );
        System.out.println( "Please Enter a valid Math Equation You Would Like To Encode." );
        String input = scan.nextLine();
        
        while( !isValidString(input) ){
          System.out.println( "Input Equation is invalid." );
          System.out.println( "Please input a valid Equation" );
          input = scan.nextLine();
        }
        
        return input;
    }
    
    // check if a ,math equation is valid string
    private static boolean isValidString( String string){
        return !string.isEmpty() ;
  
    }
    
    //add string representation of encoded math equation to url
    private static String MathEquationToString( String encodedMathEQ ){
        String template = "https://render.githubusercontent.com/render/math?math=" + encodedMathEQ;
        return template;
        
    }
    
    
    public static void main(String[] args){
        
        
        String input = getInputString();
        //input must be a math equation
        
        try{
            System.out.println( "Your URL is: " + MathEquationToString( URLEncoder.encode(input) ) );
            System.out.println( "Image DOM is: " + "<img src=\""+ MathEquationToString( URLEncoder.encode(input) ) + "\">");          
            
            
        } catch( Exception e ){
            System.out.println( e.toString() );
        }
    }
}
