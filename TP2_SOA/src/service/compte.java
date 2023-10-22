package service;

import java.util.Date;

public class compte {
	private String code;
	private double solde;
	private String datecreation;
	public compte(String code2 , double solde ,String date ) {
			this.code=code2;
			this.solde=solde;
			this.datecreation=date;
	 }
	
	   public String getCode() {
	        return code;
	    }

	    public void setCode(String code) {
	        this.code = code;
	    }

	    public double getSolde() {
	        return solde;
	    }

	    public void setSolde(double solde) {
	        this.solde = solde;
	    }

	    public String getDateCreation() {
	    	return datecreation; }
	    
	    public void setDateCreation(String dateCreation) { 
	    	this.datecreation = dateCreation; 
	    	} 
	  
	    
	        public static void main(String[] args) {
	            // Créer un compte
	            compte compte = new compte("12345", 1000.0, "2023-10-20");

	            // Afficher les détails du compte
	            System.out.println("Code du compte : " + compte.getCode());
	            System.out.println("Solde du compte : " + compte.getSolde());
	            System.out.println("Date de création du compte : " + compte.getDateCreation());
	        }
	    

	        }
	    




