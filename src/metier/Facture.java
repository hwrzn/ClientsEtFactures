package metier;

import java.time.LocalDate;

public class Facture
{
	private int numFacture;
	private int montantFacture;
	private String dateFacture;
	private String reglementFacture;
	
	public Facture(int numFacture, int montantFacture, String dateFacture, String reglementFacture) {
		this.numFacture = numFacture;
		this.montantFacture = montantFacture;
		this.dateFacture = dateFacture;
		this.reglementFacture = reglementFacture;
	}
	
	
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */²
	
	public Client getClient()
	{
		return null;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return 0;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return true;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return null;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return null;
	}
}