/**
 * Created by DouJe1335787 on 2018-01-22.
 */
public class Adresse {
    private String porte;
    private String rue;
    private String appartement;
    private String ville;
    private String province;
    private String pays;

    public Adresse()
    {

    }

    public String getPorte() { return this.porte; }

    public String getRue() { return this.rue; }

    public String getAppartement() { return this.appartement; }

    public String getVille() { return this.ville; }

    public String getProvince() { return this.province; }

    public String getPays() { return this.pays; }

    public void setPorte(String _newPorte) { this.porte = _newPorte; }

    public void setRue(String _newRue) { this.rue = _newRue; }

    public void setAppartement(String _newAppartement) { this.appartement = _newAppartement; }

    public void setVille(String _newVille) { this.ville = _newVille; }

    public void setProvince(String _newProvince) { this.province = _newProvince; }

    public void setPays(String _newPays) { this.pays = _newPays; }
}
