package ProjectIPhone.main.java;

import ProjectIPhone.CellPhone.Iphone;

public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Telephone");

        //Telephone
        iphone.toConnect();
        iphone.toMeet();
        iphone.startVoicemail();

        System.out.println("Browser");

        //Browser
        iphone.displayPage();
        iphone.addNewPage();
        iphone.updatePage();

        System.out.println("Player");

        // Player
        iphone.selectMusic("Simple man - Lynyrd Skynyrd");
        iphone.playMusic("Simple man - Lynyrd Skynyrd");
        iphone.pauseMusic("Simple man - Lynyrd Skynyrd");



    }
}
