package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1200, 600);
    }

    public ArrayList<Video> videos = new ArrayList<>();

    public void run() {
        videos.add(new Video("JwlY-zhQURU", "John Lewis Christmas Ad 2017 - #MozTheMonster", 7224515));
        videos.add(new Video("3s1rvMFUweQ", "Taylor Swift: ..Ready for It? (Live) - SNL", 1053632));
        videos.add(new Video("niWpP7iowLc", "Eminem - Walk On Water (Audio) ft. Beyoncé", 17158579));
        videos.add(new Video("rHwDegptbI4", "Dashcam captures truck's near miss with child in Norway", 9815));
        videos.add(new Video("2Vv-BfVog4g", "Ed Sheeran - Perfect (Official Music Video)", 33523622));
        videos.add(new Video("0HQ-fAp5X64", "CAN BABIES DO GYMNASTICS? **World Record**", 306724));
        videos.add(new Video("b4vTZx-AtHk", "How To Dry a Shirt in 30 Seconds", 2063667));
        videos.add(new Video("BsfhHKx6ajA", "Attracting An Alpaca With An Accordion | Nowhere Else", 728547));
        videos.add(new Video("DIU3xPdhCBI", "Sam Smith surprises brides at their wedding! (At The BBC)", 893462));
        videos.add(new Video("6p-QzY5bxJ0", "The 'Stranger Things' Kids Were Nearly a Motown Super Group", 5541767));
        videos.add(new Video("Ja_GMU7-sjs", "Google Pixelbook: $1000 of Weird!", 1575525));
        videos.add(new Video("YMqpKLKiSM", "Decluttering My Life ?", 106122));
        videos.add(new Video("cUtYh_ZUjc", "You Know You're British When... | The December Issue | British Vogue", 71231));
        videos.add(new Video("z7VBtM7clT4", "Justice League Movie Cast Reveal Funniest Moments Together | MTV Movies", 82639));

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show watchlist ");
            SaxionApp.printLine("* 2) Watch video");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                showAll();
                SaxionApp.pause();
            } else if (menuInput == 2) {
                watchVideo();
                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }

        } while (menuInput != 0);
    }

    public void showAll(){
        for (int i = 0; i < videos.size(); i++) {
            SaxionApp.print((i + 1) + ") " + videos.get(i) + " ");
            if (videos.get(i).getWatched()) SaxionApp.printLine(" [WATCHED]", Color.GREEN);
            else SaxionApp.printLine(" [NOT WATCHED]", Color.RED);
        }
    }

    public void watchVideo(){
        int video;

        showAll();

        SaxionApp.printLine();

        SaxionApp.print("Please enter a video to watch: ");
        video = SaxionApp.readInt();

        SaxionApp.printLine();

        videos.get(video - 1).watched();
        SaxionApp.printLine("You have watched: " + videos.get(video - 1));
    }

}