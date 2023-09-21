package ProjectIPhone.CellPhone;

import ProjectIPhone.Interfaces.Telephone;
import ProjectIPhone.Interfaces.InternetBrowser;
import ProjectIPhone.Interfaces.MusicPlayer;

public  class Iphone implements Telephone, MusicPlayer, InternetBrowser {

    // Display page method
    @Override
    public void displayPage() {
        System.out.println("Page open");
    }

    // Add page method
    @Override
    public void addNewPage() {
        System.out.println("New page");
    }

    // Metodo atualzar pagina
    @Override
    public void updatePage() {
        System.out.println("Page updated");
    }

    /*--------------------------------------------------------------------------------*/

    // Method select music
    @Override
    public void selectMusic(String music) {
        System.out.println("Music: " + music + " selected");
    }

    // Method of playing music
    @Override
    public void playMusic(String music) {
        System.out.println("Music: " + music + " playing");
    }

    // Method of pause music
    @Override
    public void pauseMusic(String music) {
        System.out.println("Music: " + music + " paused");
    }

    /*--------------------------------------------------------------------------------*/

    // Call method
    @Override
    public void toConnect() {
        System.out.println("Calling...");
    }

    // Answer the phone method
    @Override
    public void toMeet() {
        System.out.println("Answered Call!");
    }

    // Start voicemail method
    @Override
    public void startVoicemail() {
        System.out.println("Got to voicemail ...");
    }
}
