import java.util.Random;

public class Cards {
    public static void main() {
        String[] Cards = new String[20];

        //declares each value with a card
        Cards[0] = "Squirrels Secret Stash\na friendly squirrel leads you to his secret nut stash, filled with shiny trinkets\ntake $150";
        Cards[1] = "Owl Delivers Inheritance\na wise old owl drops a scroll, turns out a distant raccoon relative left you a fortune\ntake $200";
        Cards[2] = "Beaver Builds You a Lodge\nthe beaver community thanks you with a cash reward for helping them repair their dam\ntake $100";
        Cards[3] = "Penguin Dance Goes Viral\nyour funky penguin waddle becomes an internet sensation\ntake $125";
        Cards[4] = "Lucky Ladybug Landing\na rare golden ladybug lands on your nose, local bugs say it's a sign of riches\ntake $75";
        Cards[5] = "Skunk Encounter!\nyou got sprayed and had to buy de-skunk shampoo for days\npay $80";
        Cards[6] = "Hungry Hippo Ate Your Lunch : that picnic was expensive... and now it’s gone : pay $60";
        Cards[7] = "Parrot Repeats Your Credit Card Number\nchaos ensues. fraud prevention fees apply\npay $120";
        Cards[8] = "Ferret Frenzy!\nyour ferret stole your wallet and hid it in a maze of tunnels\npay $90";
        Cards[9] = "Ant Invasion\nyou left food out and now have to pay for pest control\npay $100";
        Cards[10] = "Golden Goose\nyou've discovered the legendary golden goose! It lays a golden egg just for you\ntake $200";
        Cards[11] = "Lucky Cat Cafe\nyou opened a cat café and it's a roaring success! Customers love the purring service\ntake $150";
        Cards[12] = "Rescue Hero\nyou rescued an endangered panda and got rewarded by the Wildlife Foundation\ntake $100";
        Cards[13] = "Turtle Taxi\nyour turtle-powered ride service goes viral on social media\ntake $75";
        Cards[14] = "Busy Bee Bonus\nyour beekeeping hobby yields extra honey, and extra cash\n$50";
        Cards[15] = "Runaway Rhino\na rhino charges through your garden and causes major damage\npay $200";
        Cards[16] = "Penguin Plumbing Problem\nyour pet penguins break the pipes playing in the bathroom\npay $150";
        Cards[17] = "Snake in the Sofa\na snake hides in your couch, emergency services aren't cheap\npay $100";
        Cards[18] = "Monkey Mischief\nmonkeys steal your wallet at the zoo\npay $ 75";
        Cards[19] = "Parrot Lawsuit\nyour talking parrot accidentally insults a guest. Legal fees ensue\npay $50";

        //generates random number between 1 and 20, then assigns array value to it
        Random rand = new Random();
        int randomNum = rand.nextInt(20);

        String message = Cards[randomNum];
        String border = "+";
        for (int i = 0; i < message.length(); i++) {
            border += "-"; //equivalent to: border = border + "-"
        }
        border += "+";

        //displays a border around text
        System.out.println(border);
        System.out.println(message);
        System.out.println(border);
    }
}