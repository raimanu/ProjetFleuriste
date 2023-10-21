package classJava;

/**
 * La classe classJava.Fleur représente une fleur.
 */
public class Fleur {

    /** Le nom de la fleur */
    protected String nom;

    /** Le prix de la fleur */
    protected double prix;

    /** La couleur de la fleur */
    protected String couleur;

    /** La taille de la fleur */
    protected int taille;

    /** La quantité de fleur */
    protected int quantite;

    /**
     * L'age de la fleur
     */
    protected int age;

    /**
     * La durée de vie de la fleur
     */
    protected String dureeVie;

    /**
     * Si la fleur est vivante ou non
     */
    protected boolean vivant = true;


    public Fleur(String nom, double prix, String couleur, int taille, int age, String dureeVie, int quantite){
        this.nom = nom;
        this.prix = prix;
        this.couleur = couleur;
        this.taille = taille;
        this.quantite = quantite;
        this.age = age;
        this.dureeVie = dureeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Permet de changer le prix de la classJava.Fleur
     *
     * @param Nvprix Un nombre de type double qui sera le nouveau prix de la classJava.Fleur
     */
    public void setPrix(double Nvprix) {
        this.prix = Nvprix;
    }

    /**
     * Renvoie le prix de la classJava.Fleur
     *
     * @return Le prix de la classJava.Fleur de type double
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Permet de changer la couleur de la classJava.Fleur
     *
     * @param NvCouleur La nouvelle couleur de la classJava.Fleur
     */
    public void setCouleur(String NvCouleur) {
        this.couleur = NvCouleur;
    }

    /**
     * Renvoie la couleur de la classJava.Fleur
     *
     * @return La couleur de la classJava.Fleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Permet de changer la taille de la classJava.Fleur
     *
     * @param NvTaille La nouvelle taille de la classJava.Fleur
     */
    public void setTaille(int NvTaille) {
        this.taille = NvTaille;
    }

    /**
     * Renvoie la taille de la classJava.Fleur
     *
     * @return La taille de la classJava.Fleur
     */
    public int getTaille() {
        return taille;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    /**
     * Modifie l'âge de la classJava.Fleur en lui attribuant une nouvelle valeur.
     *
     * @param age la nouvelle valeur de l'âge de l'objet
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Renvoie l'âge actuel de la classJava.Fleur.
     *
     * @return l'âge actuel de la classJava.Fleur
     */
    public int getAge() {
        return age;
    }

    /**
     * Modifie la durée de vie de la classJava.Fleur en lui attribuant une nouvelle valeur.
     *
     * @param dureeVie la nouvelle valeur de la durée de vie de la classJava.Fleur
     */
    public void setDureeVie(String dureeVie) {
        this.dureeVie = dureeVie;
    }

    /**
     * Renvoie la durée de vie actuelle de la classJava.Fleur.
     *
     * @return la durée de vie actuelle de la classJava.Fleur
     */
    public String getDureeVie() {
        return dureeVie;
    }

    /**
     * Fait mourir la classJava.Fleur en changeant sa variable vivant en false.
     */
    public void faner(){
        this.vivant = false;
    }

    /**
     * Vérifie si l'objet est vivant ou non.
     *
     * @return true si l'objet est vivant, false sinon
     */
    public boolean estVivant(){
        return vivant;
    }

    /**
     *Permet d'afficher les caractéristiques de la classJava.Fleur
     */
    public void showProduct() {
        System.out.println(nom+" : coûte "+prix+" euro\n"+"Elle est de couleur "+couleur+", elle a " + age + " jour, mesure "+ taille + " cm et dure "+dureeVie+" en bouquet.\n");
    }
}