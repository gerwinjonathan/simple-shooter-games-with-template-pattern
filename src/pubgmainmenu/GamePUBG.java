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
public class GamePUBG extends Game {

    boolean end = false;
    int lifePemain = 100;
    int ammoPemain = 3;

    //init PUBG
    @Override
    void initialize() {
        System.out.println("Menginisialisasi PUBG Game.");
    }

    //start PUBG
    @Override
    void startPlay(String player) {
        System.out.println("Memulai PUBG Game." + " " + player + " telah memasuki ruangan. ");
        helpPlay();
    }

    //mengakhiri PUBG
    @Override
    void endPlay(String player) {
        end = true;
        System.out.println("Mengakhiri PUBG Game. Terima kasih telah bermain." + " " + player + " telah keluar dari ruangan.");
    }

    @Override
    void helpPlay() {
        System.out.println("List Perintah : ");
        System.out.println("1. Maju | 2. Mundur | 3. Kiri | 4. Kanan | ");
        System.out.println("5. Tembak | 6. Ambil Senjata | 7. Ambil Kostum | 8. Keluar Game |");
    }

    @Override
    public void doOperation(String player, int komando) {
        String aksi = "";
        lifePemain(komando);
        ammoPemain(komando);
        switch (komando) {
            case 1:
                aksi = " melakukan maju";
                break;
            case 2:
                aksi = " melakukan mundur";
                break;
            case 3:
                aksi = " melakukan kiri";
                break;
            case 4:
                aksi = " melakukan kanan";
                break;
            case 5:
                aksi = " melakukan tembak";
                break;
            case 6:
                aksi = " melakukan ambil senjata";
                break;
            case 7:
                aksi = " melakukan ambil kostum";
                break;
            case 8:
                aksi = "";
                endPlay(player);
                break;
        }
        if (!aksi.isEmpty()) {
            System.out.println("Player " + player + aksi);
        }

    }

    @Override
    void lifePemain(int komando) {
        if (komando == 5) {
            lifePemain-=3;
        } else if (komando == 7) {
            lifePemain++;
        }
        System.out.println("Life : " + lifePemain);
    }

    @Override
    void ammoPemain(int komando) {
        if (komando == 5 && ammoPemain != 0) {
            ammoPemain--;
        } else if (komando == 6) {
            ammoPemain++;
        }
        if (ammoPemain <= 0) {
            System.out.println("Ammo telah habis. Silahkan ambil");
        }
        System.out.println("Ammo : "+ammoPemain);
    }

}
