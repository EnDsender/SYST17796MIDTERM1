/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author r2kar
 */

public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    Seasons season;
    private boolean abc=true;
    public enum Seasons{
        FALL,
        WINTER,
        SPRING,
        SUMMER
    }
    //a constructor
    public JavaApplication11(Seasons season)
    {
        this.season = season;
    }
   
    public boolean isSeason(String userSeason) 
    {
        if(userSeason.equals(season.name()))
        {
            return true; 
        }

        else
        {
            return false;
        }//esle
    
    }//method



    public void seasonDescription()
    {
       switch (season){
            case FALL:
                System.out.println("my fav. season!");
                break;
            case WINTER:
                System.out.println("it is too cold!");
                break;
            case SPRING:
                System.out.println("my allerg!");
                break;
            case SUMMER:
                System.out.println("it is hot!");
                break;
     }//hctiws
    }//method
   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a season");
        String myStr = input.nextLine();

        JavaApplication11 test1= new JavaApplication11(Seasons.valueOf(myStr));
        
      System.out.println(test1.isSeason(myStr));

        test1.seasonDescription(); //test1.isSeason();
       
        
        int ord = Seasons.valueOf(myStr).ordinal();
        System.out.println(Seasons.valueOf(myStr).ordinal());
        //a for loop that iterated thru the Seasons Enum using values() method
        
        for (Seasons mySeason: Seasons.values())
        {    
            System.out.println(mySeason);
        }
       

        }//naim
    }//ssalc
    

