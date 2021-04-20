/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3withanotheroutput;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class JavaApplication3WithAnotherOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Number of states :");
        int nummberOfStates = sc.nextInt();
        System.out.println("How many words you want to store :");
        int numberOfWords = sc.nextInt();
        String[] arrayOfWordsOfregularExpression = new String[numberOfWords];
            System.out.println("Please enter words names in regex form :");                    
        for (int i = 0; i < numberOfWords; i++)
        {
            arrayOfWordsOfregularExpression[i] = sc.next();
        }
        //-----------------------------------------------------------------------------------------
        
        System.out.print("Enter the number of final states elements you want to store: ");  
        //reading the number of elements from the that we want to enter  
        int n=sc.nextInt();  
        //creates an array in the memory of length 10  
        Integer[] finalStatesArray = new Integer[n];  
        System.out.println("Enter the fianl states elements array one by one ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        finalStatesArray[i]=sc.nextInt();  
        }        
        //-----------------------------------------------------------------------------------------
        
        System.out.println("Enter highest array length in Transition Table which we made in copy work.");
        int enterHighestArrayLengthInTransitionTable = sc.nextInt()+1;
        Integer[][] transitionTable[] = new Integer[nummberOfStates][arrayOfWordsOfregularExpression.length][enterHighestArrayLengthInTransitionTable];        
        for(int i=0; i<nummberOfStates;i++)
         {            
            for(int j=0; j<arrayOfWordsOfregularExpression.length;j++)
            {             
                 System.out.println("Enter number of elements you want to store at position " + "[" + i + "]" + "[" + j + "]");
                 int numberOfElementAtSpecificPositionInTransitionTable = sc.nextInt();
                 for(int h=0; h<numberOfElementAtSpecificPositionInTransitionTable;h++)
                 {
                     transitionTable[i][j][h]=sc.nextInt();
                     
                 }
                 
//                 System.out.println(transitionTable[0][0][1]);
            }
         }
        
//        System.out.println(transitionTable[1][1][1]);
        
                   
        //-----------------------------------------------------------------------------------------
        
        do{
            six:{
        System.out.println("Enter input for checking with above finite automato which you given.");
        String input = sc.next();
        char[] wordForCheckingWithRegularExpression = new char[input.length()];
        // Copy character by character into array
        for (int i = 0; i < input.length(); i++) 
        {
            wordForCheckingWithRegularExpression[i] = input.charAt(i);
        }
        //-----------------------------------------------------------------------------------------
        Stack <Integer> stack =  new Stack <Integer> ();
        
        Integer q = 0;
        Integer r = 0;
        Integer g = 0;
        Integer w = 0;
        Integer var = 0;
        Integer var1 = 0;
        Integer var2 = 0;
        Integer var3 = 0;
        Integer f = 0;
        Stack <Integer> stack2 =  new Stack <Integer> ();
        Integer d= 0;
        Integer p;
        stack2.push(0);
        boolean tt=true;
        Integer save = 0;
        do{
            second:{
                five:{
        for(p=r; p<wordForCheckingWithRegularExpression.length;p++)
        {
            if(q==null)
            {
                stack.pop();
                stack2.pop();
                
                r=stack.size()-1;
                for(int z=0; z<arrayOfWordsOfregularExpression.length;z++)
                {
                    if(Pattern.matches(arrayOfWordsOfregularExpression[z],String.valueOf(wordForCheckingWithRegularExpression[r])))
                    {
                        g=z;
                    }
                }
                Integer zz = stack.peek();
                stack.pop();
              
                if(stack.isEmpty()==false)
                    {
                        f = stack.peek();
                    }
                else {f=0;}
           
                q=f;
                stack.push(zz);
                if(tt) break five;
                
            }
            for(int k=q;k<nummberOfStates;k++)
            {
                for(int j=0; j<arrayOfWordsOfregularExpression.length;j++)
                {
                    //if(String.valueOf(wordForCheckingWithRegularExpression[p])==arrayOfWordsOfregularExpression[j])
                    if(Pattern.matches(arrayOfWordsOfregularExpression[j],String.valueOf(wordForCheckingWithRegularExpression[p])))  
                    {
                        f=k;
                        stack2.push(var3);
                        stack.push(transitionTable[k][j][stack2.peek()]);
                        save = stack.peek();
                        q=save;
                        g=j;
                        
                        
                    }                    
                }
                break;
            }
            r=p;
            var3=0;
            
            
        }
        
   
        Integer y;
        for(y=0; y<n; y++)  
        {  
        //reading array elements from the user   
            if(finalStatesArray[y]==save)
            {
                System.out.print("Correct Input - ");
                
                break;
            }
            
        }
                }    
        
        while(transitionTable[f][g][stack2.peek() +1 ]==null)
        {
            stack.pop();
            stack2.pop();
            r=r-1;
            if(r==-1) {  System.out.println("Incorrect Input ");       break six;                                        }
            
                for(int t=0;t<arrayOfWordsOfregularExpression.length;t++)
                {
                    if(Pattern.matches(arrayOfWordsOfregularExpression[t],String.valueOf(wordForCheckingWithRegularExpression[r])))  
                    {
                        g=t;
                    }
                }
            
            var1=stack.peek();
            stack.pop();
            if(stack.isEmpty()==false)
            {
                var2 = stack.peek();
            }
            else {var2=0;}
            stack.push(var1);
            f=var2;
            q=f;
        }
        
        if(transitionTable[f][g][stack2.peek() +1 ]!=null && r==wordForCheckingWithRegularExpression.length-1)
        {
            var1 = stack.peek();
            stack.pop();
            if(stack.isEmpty()==false)
            {
            var2 = stack.peek();
            }
            else{  var2 =0; }
            stack.push(var1);
            f=var2;
            q=f;
            var3 = stack2.peek()+1;
            stack2.pop();
            stack.pop();
            if(tt) break second;
        }
        
        var3 = stack2.peek()+1;
        stack2.pop();
        stack.pop();     }//second           
        }while(1==1);   //do
         
        }//six
        }while(1==1);         
                    
                
        
    }
    
}

