/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan32.daftar_film;

/**
 *
 * @author Indra F
 * Nama                    : Indra Febriastanto
 * NIM                      : 10116588
 * KELAS                    : PBO6K
 * Deskripsi program        : Program ini berisi untuk menampilkan Daftar Film
 */
public class PBO6k10116588Latihan32Daftar_Film {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film film1 = new Film("Venom", "Action, Horor, scifi", 8.5, 120);
        film1.nowPlaying();

        Film film2 = new Film("Small Foot", "Animation", 9, 96);
        film2.nowPlaying();
        
        Film film3 = new Film("Crazy Poor Asia", "Comedy", 7.8, 119);
        film3.nowPlaying();

        Film film4 = new Film("Asih", "Horor", 6.0, 100);
        film4.nowPlaying();
    }
    
}
