import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
// Class of ReverseString 
class ReverseString 
{ 
    public static void main(String[] args) 
    { 
        String input = "GeeksforGeeks"; 
  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result)); 
    } 
} 
Output:

skeeGrofskeeG
Using built in reverse() method of the StringBuilder class: String class does not have reverse() method, we need to convert the input string to StringBuilder, which is achieved by using the append method of StringBuilder. After that, print out the characters of the reversed string by scanning from the first till the last index.
filter_none
edit
play_arrow

brightness_4
// Java program to ReverseString using StringBuilder 
import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
// Class of ReverseString 
class ReverseString 
{ 
    public static void main(String[] args) 
    { 
        String input = "Geeks for Geeks"; 
  
        StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        input1.append(input); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
  
        // print reversed String 
        System.out.println(input1); 
    } 
} 