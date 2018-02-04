import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

/**
 * Created by DouJe1335787 on 2018-01-22.
 */
public class main {
    public static void main(String[] args) {
        //declaration des variables
        int choix = 0;
        contacts tabContacts[] = new contacts[100];
        int nbContact = 0;
        int i = 0;
        int nContact = 0;
        int compteur = 0;
        boolean fini = false;
        int reponse = 0;
        int j = 0;

        //initialisation scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("bienvenue!");

        //boucle du programme
        while (choix != 4)
        {
            System.out.print("\n\n" + "1- Ajouter un contact" + "\n" + "2- Modifier un contact" + "\n" + "3- Afficher un contact" + "\n" + "4- Quitter");
            choix = sc.nextInt();

            switch (choix)
            {
                case 1:
                {
                    i = 0;
                    compteur = 0;
                    while (i < tabContacts.length)
                    {
                        if (tabContacts[i] != null) compteur++;
                        i++;
                    }
                    nbContact = compteur;
                    tabContacts[nbContact] = new contacts();
                    System.out.print("\n" + "Ce contact sera entré à la position #" + (nbContact + 1) + "\n" + "Veuillez entrer les informations suivantes : ");
                    System.out.print("\nPrénom : ");
                    tabContacts[nbContact].setPrenom(sc.next());
                    System.out.print("Nom : ");
                    tabContacts[nbContact].setNom(sc.next());
                    System.out.print("Adresse : \n\tNumero de porte : ");
                    tabContacts[nbContact].getaD1().setPorte(sc.next());
                    System.out.print("\tRue : ");
                    tabContacts[nbContact].getaD1().setRue(sc.next());
                    System.out.print("\tAppartement : ");
                    tabContacts[nbContact].getaD1().setAppartement(sc.next());
                    System.out.print("\tVille : ");
                    tabContacts[nbContact].getaD1().setVille(sc.next());
                    System.out.print("\tProvince : ");
                    tabContacts[nbContact].getaD1().setProvince(sc.next());
                    System.out.print("\tPays : ");
                    tabContacts[nbContact].getaD1().setPays(sc.next());
                    System.out.print("Occupation : ");
                    System.out.print("\n\tPoste : ");
                    tabContacts[nbContact].getoC1().setPoste(sc.next());
                    System.out.print("\tEntreprise : ");
                    System.out.print("\n\t\tNom : ");
                    tabContacts[nbContact].getoC1().getEnt1().setNomEnt(sc.next());
                    System.out.print("\t\tAdresse : ");
                    System.out.print("\n\t\t\tNumero de porte : ");
                    tabContacts[nbContact].getoC1().getEnt1().getAd2().setPorte(sc.next());
                    System.out.print("\t\t\tRue : ");
                    tabContacts[nbContact].getoC1().getEnt1().getAd2().setRue(sc.next());
                    System.out.print("\t\t\tAppartement : ");
                    tabContacts[nbContact].getoC1().getEnt1().getAd2().setAppartement(sc.next());
                    System.out.print("\t\t\tVille : ");
                    tabContacts[nbContact].getoC1().getEnt1().getAd2().setVille(sc.next());
                    System.out.print("\t\t\tProvince : ");
                    tabContacts[nbContact].getoC1().getEnt1().getAd2().setProvince(sc.next());
                    System.out.print("\t\t\tPays : ");
                    tabContacts[nbContact].getoC1().getEnt1().getAd2().setPays(sc.next());
                    reponse = 1;
                    i = 0;
                    while (reponse != 0 && i < tabContacts[nbContact].getnTel1().length)
                    {
                        System.out.print("Entrer un numero de téléphone (1- oui/0- non) ? ");
                        reponse = sc.nextInt();
                        if (reponse == 1)
                        {
                            tabContacts[nbContact].getnTel1()[i] = new Telephone();
                            System.out.print("À quoi correspond ce numero de téléphone? (cellulaire, maison, travail, etc)");
                            tabContacts[nbContact].getnTel1()[i].setType(sc.next());
                            System.out.print("Quel est le numero?");
                            tabContacts[nbContact].getnTel1()[i].setNumero(sc.next());
                            i++;
                        }
                        if (reponse != 1 && reponse != 0) System.out.print("Vous n'avez pas rentré correctement votre numero\n");
                    }
                    System.out.print("Votre contact a été ajouté avec succes!");
                    break;
                }
                case 2:
                {
                    i = 0;
                    compteur = 0;
                    while (i < tabContacts.length)
                    {
                        if (tabContacts[i] != null) compteur++;
                        i++;
                    }
                    if (compteur == 0)System.out.print("Vous n'avez pas de contact!");
                    else
                    {
                        fini = false;
                        while (fini == false)
                        {
                            System.out.print("\n\nQuel est le numero du contact ?");
                            nContact = sc.nextInt();
                            nContact = nContact - 1;
                            if (nContact + 1 > compteur || nContact < 0) System.out.print("\nVeuillez choisir un autre numero");
                            else
                            {
                                System.out.print("\nVeuillez entrer les informations suivantes  \nPrenom (" + tabContacts[nContact].getPrenom() + ") : ");
                                tabContacts[nContact].setPrenom(sc.next());
                                System.out.print("Nom (" + tabContacts[nContact].getNom() + ") : ");
                                tabContacts[nContact].setNom(sc.next());
                                System.out.print("Adresse :\n\tNumero de porte (" + tabContacts[nContact].getaD1().getPorte() + ") : ");
                                tabContacts[nContact].getaD1().setPorte(sc.next());
                                System.out.print("\tRue (" + tabContacts[nContact].getaD1().getRue() + ") : ");
                                tabContacts[nContact].getaD1().setRue(sc.next());
                                System.out.print("\tAppartement (" + tabContacts[nContact].getaD1().getAppartement() + ") : ");
                                tabContacts[nContact].getaD1().setAppartement(sc.next());
                                System.out.print("\tVille (" + tabContacts[nContact].getaD1().getVille() + ") : ");
                                tabContacts[nContact].getaD1().setVille(sc.next());
                                System.out.print("\tProvince (" + tabContacts[nContact].getaD1().getProvince() + ") : ");
                                tabContacts[nContact].getaD1().setProvince(sc.next());
                                System.out.print("\tPays (" + tabContacts[nContact].getaD1().getPays() + ") : ");
                                tabContacts[nContact].getaD1().setPays(sc.next());
                                System.out.print("Occupation");
                                System.out.print("\n\tPoste (" + tabContacts[nContact].getoC1().getPoste() + ") : ");
                                tabContacts[nContact].getoC1().setPoste(sc.next());
                                System.out.print("\tEnteprise : ");
                                System.out.print("\n\t\tNom (" + tabContacts[nContact].getoC1().getEnt1().getNomEnt() + ") : ");
                                tabContacts[nContact].getoC1().getEnt1().setNomEnt(sc.next());
                                System.out.print("\t\tAdresse : ");
                                System.out.print("\n\t\t\tNumero de porte (" + tabContacts[nContact].getoC1().getEnt1().getAd2().getPorte() + ") : ");
                                tabContacts[nContact].getoC1().getEnt1().getAd2().setPorte(sc.next());
                                System.out.print("\t\t\tRue (" + tabContacts[nContact].getoC1().getEnt1().getAd2().getRue() + ") : ");
                                tabContacts[nContact].getoC1().getEnt1().getAd2().setRue(sc.next());
                                System.out.print("\t\t\tAppartement (" + tabContacts[nContact].getoC1().getEnt1().getAd2().getAppartement() + ") : ");
                                tabContacts[nContact].getoC1().getEnt1().getAd2().setAppartement(sc.next());
                                System.out.print("\t\t\tVille (" + tabContacts[nContact].getoC1().getEnt1().getAd2().getVille() + ") : ");
                                tabContacts[nContact].getoC1().getEnt1().getAd2().setVille(sc.next());
                                System.out.print("\t\t\tProvince (" + tabContacts[nContact].getoC1().getEnt1().getAd2().getProvince() + ") : ");
                                tabContacts[nContact].getoC1().getEnt1().getAd2().setProvince(sc.next());
                                System.out.print("\t\t\tPays (" + tabContacts[nContact].getoC1().getEnt1().getAd2().getPays() + ") : ");
                                tabContacts[nContact].getoC1().getEnt1().getAd2().setPays(sc.next());
                                System.out.print("Telephone : ");
                                i = 0;
                                while (tabContacts[nContact].getnTel1()[i] != null)
                                {
                                    System.out.print(tabContacts[nContact].getnTel1()[i].getType() + "(" + tabContacts[nContact].getnTel1()[i].getNumero() + ") : ");
                                    tabContacts[nContact].getnTel1()[i].setNumero(sc.next());
                                    i++;
                                }
                                fini = true;
                            }

                        }
                    }

                    break;
                }
                case 3:
                {
                    i = 0;
                    compteur = 0;
                    while (i < tabContacts.length)
                    {
                        if (tabContacts[i] != null) compteur++;
                        i++;
                    }
                    nbContact = compteur;
                    System.out.print("\nVous avez " + nbContact + "contact(s)");
                    i = 0;
                    while (i < nbContact)
                    {
                        System.out.print(" contact (s)\n\nContact #" + (i + 1) + " : \n-------------");
                        System.out.print("\nPrénom : " + tabContacts[i].getPrenom() + "\nNom : " + tabContacts[i].getNom() +
                                "\nAdresse : \n\tNumero de porte :" + tabContacts[i].getaD1().getPorte() +
                                "\n\tRue : " + tabContacts[i].getaD1().getRue() +
                                "\n\tAppartement : " + tabContacts[i].getaD1().getAppartement() +
                                "\n\tVille : " + tabContacts[i].getaD1().getVille() +
                                "\n\tProvince : " + tabContacts[i].getaD1().getProvince() +
                                "\n\tPays : " + tabContacts[i].getaD1().getPays() +
                                "\nOccupation : " +
                                "\n\tPoste : " + tabContacts[i].getoC1().getPoste() +
                                "\n\tEntreprise : " +
                                "\n\t\tNom : " + tabContacts[i].getoC1().getEnt1().getNomEnt() +
                                "\n\t\tAdresse : " +
                                "\n\t\t\tNumero de porte : " + tabContacts[i].getoC1().getEnt1().getAd2().getPorte() +
                                "\n\t\t\tRue : " +  tabContacts[i].getoC1().getEnt1().getAd2().getRue() +
                                "\n\t\t\tAppartement : " + tabContacts[i].getoC1().getEnt1().getAd2().getAppartement() +
                                "\n\t\t\tVille : " + tabContacts[i].getoC1().getEnt1().getAd2().getVille() +
                                "\n\t\t\tProvince : " + tabContacts[i].getoC1().getEnt1().getAd2().getProvince() +
                                "\n\t\t\tPays : " + tabContacts[i].getoC1().getEnt1().getAd2().getPays() +
                                "\nTéléphone : ");
                        j = 0;
                        while (tabContacts[i].getnTel1()[j] != null)
                        {
                            System.out.print("\n\t" + tabContacts[i].getnTel1()[j].getType() + " : " + tabContacts[i].getnTel1()[j].getNumero());
                            j++;
                        }
                        i++;
                    }
                    break;
                }
            }
        }
        System.out.print("\nAu revoir!");

        //fermeture du scanner
        sc.close();
    }
}