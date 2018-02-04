/**
 * Created by DouJe1335787 on 2018-01-22.
 */
public class Occupation {
    private String poste;
    private Entreprise ent1 = new Entreprise();


    public Occupation()
    {

    }
    public String getPoste(){ return this.poste; }
    public Entreprise getEnt1(){ return this.ent1; }

    public void setPoste(String _newPoste) { this.poste = _newPoste; }
    public void setEnt1(Entreprise _newEnt1) { this.ent1 = _newEnt1; }
}