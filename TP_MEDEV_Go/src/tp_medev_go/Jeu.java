/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev_go;

/** Classe gérant le jeu dans sa globalité.
 * Permet la création d'une nouvelle partie, gère les points et les tours de
 * jeu.
 *
 * @author Yann CAMUS, Hicham DAHER, Victor ENAUD, Ken PLANAS
 */
public class Jeu {
    
    //private Goban plateau;
    private boolean jeuEnCours;
    private int tour;
    private int[] points;
    
    /** Constructeur par défaut.
     * Intialise un Goban de taille 9*9, un jeu qui débute normalement - 
     * jeuEnCours = true, tour = 1, et des points à 0.
     */
    public Jeu() {
        // this.plateau = ??? TODO
        this.jeuEnCours = true;
        this.tour = 1;
        this.points = new int [2];
        this.points[0] = 0;
        this.points[1] = 0;
    }

    public Jeu(boolean jeuEnCours, int tour, int[] points) {
        // this.plateau = ??? TODO
        this.jeuEnCours = jeuEnCours;
        this.tour = tour;
        this.points = points;
    }    

    public boolean isJeuEnCours() {
        return jeuEnCours;
    }

    public int getTour() {
        return tour;
    }

    public int[] getPoints() {
        return points;
    }

    public void setJeuEnCours(boolean jeuEnCours) {
        this.jeuEnCours = jeuEnCours;
    }

    public void setTour(int tour) {
        this.tour = tour;
    }

    public void setPoints(int[] points) {
        this.points = points;
    }
}
