import java.util.Random;

public class Cards {
    public static void main() {
        String[][] cards = new String[20][2];

        //declares each value with a card
        cards[0] = new String[]{"Squirrels Secret Stash\na friendly squirrel leads you to his secret nut stash, filled with shiny trinkets\ntake", "150"};
        cards[1] = new String[]{"Owl Delivers Inheritance\na wise old owl drops a scroll, turns out a distant raccoon relative left you a fortune\ntake", "200"};
        cards[2] = new String[]{"Beaver Builds You a Lodge\nthe beaver community thanks you with a cash reward for helping them repair their dam\ntake", "100"};
        cards[3] = new String[]{"Penguin Dance Goes Viral\nyour funky penguin waddle becomes an internet sensation\ntake", "125"};
        cards[4] = new String[]{"Lucky Ladybug Landing\na rare golden ladybug lands on your nose, local bugs say it's a sign of riches\ntake", "75"};
        cards[5] = new String[]{"Skunk Encounter!\nyou got sprayed and had to buy de-skunk shampoo for days\npay", "80"};
        cards[6] = new String[]{"Hungry Hippo Ate Your Lunch\nthe picnic was expensive... and now it’s gone\npay", "60"};
        cards[7] = new String[]{"Parrot Repeats Your Credit Card Number\nchaos ensues. fraud prevention fees apply\npay", "120"};
        cards[8] = new String[]{"Ferret Frenzy!\nyour ferret stole your wallet and hid it in a maze of tunnels\npay", "90"};
        cards[9] = new String[]{"Ant Invasion\nyou left food out and now have to pay for pest control\npay", "100"};
        cards[10] = new String[]{"Golden Goose\nyou've discovered the legendary golden goose! It lays a golden egg just for you\ntake", "200"};
        cards[11] = new String[]{"Lucky Cat Cafe\nyou opened a cat café and it's a roaring success! Customers love the purring service\ntake", "150"};
        cards[12] = new String[]{"Rescue Hero\nyou rescued an endangered panda and got rewarded by the Wildlife Foundation\ntake", "100"};
        cards[13] = new String[]{"Turtle Taxi\nyour turtle-powered ride service goes viral on social media\ntake", "75"};
        cards[14] = new String[]{"Busy Bee Bonus\nyour beekeeping hobby yields extra honey, and extra cash\ntake", "50"};
        cards[15] = new String[]{"Runaway Rhino\na rhino charges through your garden and causes major damage\npay", "200"};
        cards[16] = new String[]{"Penguin Plumbing Problem\nyour pet penguins break the pipes playing in the bathroom\npay", "150"};
        cards[17] = new String[]{"Snake in the Sofa\na snake hides in your couch, emergency services aren't cheap\npay", "100"};
        cards[18] = new String[]{"Monkey Mischief\nmonkeys steal your wallet at the zoo\npay", "75"};
        cards[19] = new String[]{"Parrot Lawsuit\nyour talking parrot accidentally insults a guest. Legal fees ensue\npay", "50"};


        //generates random number between 1 and 20, then assigns array value to it
        Random rand = new Random();
        int randomNum = rand.nextInt(cards.length);

        String message = cards[randomNum][0];
        int amount = Integer.parseInt(cards[randomNum][1]);

        String fullMessage = message + " $" + amount;

        String border = "+" + "-".repeat(fullMessage.length()) + "+";

        System.out.println();
        System.out.println(border);
        System.out.println(fullMessage);
        System.out.println(border);
    }
}