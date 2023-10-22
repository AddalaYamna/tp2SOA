package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService {
	public double conversion(double mt)
	{
		return mt*10.6;

	}
	
	public compte getCompte( int code) {
		return new compte("code", Math.random()*12345," new Date()"); 
	}

	public List<compte> getComptes(){
		List<compte> l = new ArrayList<compte>();
		l.add(new compte("1", Math.random()*12345, "new Date()")); 
		l.add(new compte("2", Math.random()*12345, "new Date()"));
		l.add(new compte("3", Math.random()*12345, "new Date()"));
		return l;
	
		} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crée une instance de BanqueService
        BanqueService banqueService = new BanqueService();

        // Test de la méthode getCompte
        compte compte = banqueService.getcompte();

        if (compte != null) {
            System.out.println("Code du compte : " + compte.getCode());
            System.out.println("Solde du compte : " + compte.getSolde());
            System.out.println("Date de création : " + compte.getDateCreation());
        } else {
            System.out.println("Aucun compte trouvé.");
        }

        // Test de la méthode getComptes
        List<compte> comptes = banqueService.getComptes();

        if (!comptes.isEmpty()) {
            System.out.println("\nListe des comptes :");
            for (compte c : comptes) {
                System.out.println("Code du compte : " + c.getCode());
                System.out.println("Solde du compte : " + c.getSolde());
                System.out.println("Date de création : " + c.getDateCreation());
                System.out.println("..............................");
            }
        } else {
            System.out.println("Aucun compte trouvé.");
        }
    }

	private compte getcompte() {
		// TODO Auto-generated method stub
		return null;
	}


	    }
	


