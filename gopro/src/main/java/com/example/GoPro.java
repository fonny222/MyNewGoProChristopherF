package com.example;

import java.util.Scanner;

public class GoPro {


    Boolean moving;
    Boolean size;
    Boolean touchScreen;

    // constructor lifeStyle = movement while recording
    //             size = how big camera is
    //             touchScreen = does it have a touchscreen
    GoPro(){
        moving = false;
        size = false;
        touchScreen = false;

    }

    // this gets the value for the variable moving
    public Boolean getMoving(){

        Scanner inputDevice = new Scanner(System.in);

        String getChoice;

        System.out.println("When you use your GoPro will you be:");
        System.out.println("A: Shooting from a still position");
        System.out.println("B: Moving or holding your GoPro as you are moving");

        getChoice = inputDevice.next();
        System.out.println();

        // this helps determine if the user input an A or B
        while (getChoice.compareToIgnoreCase("A") != 0 && getChoice.compareToIgnoreCase("B") != 0) {
           System.out.println("Please choose either A or B");
            getChoice = inputDevice.next();
        }

        // if you don't move while shooting then moving is false
        if(getChoice.compareToIgnoreCase("A") == 0){
            moving = false;
        }
        // if you move alot while filming then moving is true
        if(getChoice.compareToIgnoreCase("B") == 0){
            moving = true;
        }

        System.out.println();

        return moving;
    }


    // this checks to see if size of the gopro is important
    public Boolean getSize(){

        Scanner inputDevice = new Scanner(System.in);

        String getChoice2;

        System.out.println("When you use your GoPro:");
        System.out.println("A: You will need it to be as small as possible");
        System.out.println("B: Size is not as important as having features or ease of use");

        getChoice2 = inputDevice.next();
        System.out.println();

        // this helps determine if the user input an A or B
        while (getChoice2.compareToIgnoreCase("A") != 0 && getChoice2.compareToIgnoreCase("B") != 0) {
            System.out.println("Please choose either A or B");
            getChoice2 = inputDevice.next();
        }

        // if you don't move while filming then moving is false
        if(getChoice2.compareToIgnoreCase("A") == 0){
            size = true;
        }
        // if you move alot while filming then moving is true
        if(getChoice2.compareToIgnoreCase("B") == 0){
            size = false;
        }

        System.out.println();

        return size;
    }

    public Boolean getTouchScreen(){

        Scanner inputDevice = new Scanner(System.in);

        String getChoice3;

        System.out.println("When you use your GoPro:");
        System.out.println("A: Having a touch screen display is necessary");
        System.out.println("B: I prefer a more compact size not a touch screen display");

        getChoice3 = inputDevice.next();

        System.out.println();

        // this helps determine if the user input an A or B
        while (getChoice3.compareToIgnoreCase("A") != 0 && getChoice3.compareToIgnoreCase("B") != 0) {
            System.out.println("Please choose either A or B");
            getChoice3 = inputDevice.next();
        }

        // if you need a touchscreen display
        if(getChoice3.compareToIgnoreCase("A") == 0){
            touchScreen = true;
        }
        // if you don't need a touschscreen
        if(getChoice3.compareToIgnoreCase("B") == 0){
            touchScreen = false;
        }

        System.out.println();

        return touchScreen;
    }

    // this function just displays the introduction to the program
    public static void DisplayIntro(){
        System.out.println("We are offering a choice of three different styles of GoPro camera");
        System.out.println("The Hero Session, The Hero5 Session, and the Hero5 Black");
        System.out.println("Each Camera offers the following features");
        System.out.println();
        System.out.println("Still/Video Photography");
        System.out.println("WaterProof up to 33ft (10 Meters)");
        System.out.println("Wind Noise Reduction");
        System.out.println("Wifi and Bluetooth");
        System.out.println();
        System.out.println();
        System.out.println("With all that there are still several features that set each camera apart");
        System.out.println("In order to help you find the right GoPro for your lifestyle please answer");
        System.out.println("a few quick questions:");
        System.out.println();
        System.out.println();
    }


    // use this function to tabulate results find the right camera
    public static void getResults(Boolean move, Boolean size, Boolean display){

        int heroSession = 0;
        int hero5Session = 0;
        int hero5Black = 0;
        int maxGopro;
        String whatGoPro = "";

        if(move == true){

            hero5Session = hero5Session + 1;
            hero5Black = hero5Black + 1;

        }else if(move == false){

            heroSession = heroSession + 1;
        }

        if(size == true){

            heroSession = heroSession +1;
            hero5Session = hero5Session +1;

        }else if(size == false){

            heroSession = heroSession +1;
            hero5Session = hero5Session +1;
            hero5Black = hero5Black +1;
        }

        if(display == true){

            hero5Black = hero5Black +1;

        }else if(display == false){

            hero5Session = hero5Session +1;
            heroSession = heroSession +1;
        }


// each camera int variable can only add up to 3 max so whichever is at 3 is the highest one.
        if(hero5Session == 3){

            System.out.println("The Hero5 Session is the perfect GoPro to fit your needs!");
        }
        if(hero5Black == 3){

            System.out.println("The Hero5 Black is the perfect GoPro to fit your needs!");
        }
        if(heroSession == 3){

            System.out.println("The Hero Session is the perfect GoPro to fit your needs!");
        }

        System.out.println();
        // this shows the counts for each camera to check against what is displayed
      // System.out.println("Hero Session: "+heroSession+" Hero5 Session: "+hero5Session+" Hero 5 Black: "+hero5Black);
       System.out.println();
       // return whatGoPro;
    }



    public static void main(String[] args){

        Boolean move;
        Boolean size;
        Boolean screen;
       // String goProChoice;

        DisplayIntro();

// instance of object
        GoPro myGoPro = new GoPro();

        move =  myGoPro.getMoving();

        size = myGoPro.getSize();

        screen = myGoPro.getTouchScreen();

        getResults(move,size,screen);


        //System.out.println(move+""+size+""+screen);



    }
}
