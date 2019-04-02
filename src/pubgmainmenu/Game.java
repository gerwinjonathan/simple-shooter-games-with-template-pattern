/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubgmainmenu;

/**
 *
 * @author Gerwin Jo
 */
public abstract class Game {
    //init PUBG
    abstract void initialize();
    
    //mulai PUBG game
    abstract void startPlay(String player);
    
    //mengakhiri PUBG
    abstract void endPlay(String player);
    
    //dokumentasi cara bermain PUBG
    abstract void helpPlay();
    
    //cara bermain PUBG
    public final void playPUBG(String player) {
        initialize();
        startPlay(player);
    }
    
    //Aksi di PUBG
    abstract void doOperation(String player, int komando);
    
    //Life Pemain
    abstract void lifePemain(int komando);
    
    //Ammo Pemain
    abstract void ammoPemain(int komando);
}
