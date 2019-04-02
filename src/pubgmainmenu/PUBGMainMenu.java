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
import java.util.Scanner;

public class PUBGMainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int komando = 0;
        Game game = new GamePUBG();
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = input.nextLine();
        game.playPUBG(nama);
        do {
            System.out.print("Masukkan perintah : ");
            komando = input.nextInt();
            game.doOperation(nama, komando);
        } while (komando != 8);
        
    }
    
}
