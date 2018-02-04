/**
 * Created by DouJe1335787 on 2018-01-22.
 */
public class Entreprise {
    private String nomEnt;
    private Adresse ad2 = new Adresse();

    public Entreprise ()
    {

    }
    public String getNomEnt() { return this.nomEnt; }
    public Adresse getAd2() { return this.ad2; }

    public void setNomEnt(String _newNomEnt) { this.nomEnt = _newNomEnt; }
    public void setAd2(Adresse _newAd2) {this.ad2 = _newAd2; }
}
