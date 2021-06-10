/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 */
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * @ modifier HarmanpreetSingh
 * @ Student Number 991630987
 */
public class CardTrick 
{
    
    public static void main(String[] args)
    {
        Card[] magicCard = new Card[7];
        for(int i=0;i<magicCard.length;i++)
        {
            Card c = new Card();
            c.setValue((int)Math.floor(Math.random()*13+1)); //Random Number is created
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);//call to random number from 0 and3
            magicCard[i]=c;
           
        }
        Scanner sc = new Scanner(System.in);//user input
        Card luckyCard = new Card();
        System.out.println("ENTER A CARD BETWEEN 1 TO 13");
        int gValue = sc.nextInt();//enter number
        luckyCard.setValue(gValue);
        System.out.println("ENTER A SUIT :1(Hearts), 2(Diamonds),3(Spades),4(Clubs)");
        int gSuits = sc.nextInt();//enter your suit choice
        luckyCard.setSuit(Card.SUITS[gSuits-1]);
     
        boolean match = true;
        for(int i= 0;i<magicCard.length;i++)
        {
        if(luckyCard.getValue() == magicCard[i].getValue()&&luckyCard.getSuit()
                == magicCard[i].getSuit())
        {
        match = true;
        break;
        }
        else
        {
        match = false;
        }
        }
        if(match)
        {
        System.out.println("YOU ARE A WINNER");//if win this will be displayed
        }
        else
        {
        System.out.println("OPPS!YOU LOST");//if lose this will be displayed
        }
    }
    }   
