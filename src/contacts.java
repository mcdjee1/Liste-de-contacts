/**
 * Created by DouJe1335787 on 2018-01-22.
 */
public class contacts {
    private String nom;
    private String prenom;
    private Adresse aD1 = new Adresse();
    private Occupation oC1 = new Occupation();
    private Telephone nTel1[] = new Telephone[10];

    public contacts ()
    {

    }
    public String getNom() { return this.nom; }
    public void setNom (String _newNom) { this.nom = _newNom; }
    public String getPrenom() { return this.prenom; }
    public void setPrenom (String _newPrenom) { this.prenom = _newPrenom; }
    public Adresse getaD1() { return this.aD1; }
    public void setaD1(Adresse _newaD1) { this.aD1 = _newaD1; }
    public Occupation getoC1() {return this.oC1; }
    public void setoC1(Occupation _newoC1) {this.oC1 = _newoC1; }
    public Telephone[] getnTel1() {return this.nTel1; }
    public void setnTel1(Telephone[] _newnTell) {this.nTel1 = _newnTell; }
}