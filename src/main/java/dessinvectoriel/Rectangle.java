package dessinvectoriel;

import java.awt.*;

public class Rectangle extends Surface {
	private double longueur;
	private double largeur;


	public Rectangle(Vecteur position, double longueur, double largeur)
	{
		super(position);
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public Rectangle(Vecteur position, Angle orientation, double longueur, double largeur)
	{
		super(position, orientation);
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public Rectangle(Vecteur position, Angle orientation, double longueur, double largeur, Color couleurTrait, Integer epaisseurTrait, Color couleurRemplissage)
	{
		super(position, orientation, couleurTrait, epaisseurTrait, couleurRemplissage);
		this.longueur = longueur;
		this.largeur = largeur;
	}


	@Override
	public double surface()
	{
		return longueur * largeur;
	}

	@Override
	public double perimetre()
	{
		return 2 * (longueur + largeur);
	}

	public double getLongueur()
	{
		return longueur;
	}

	public double getLargeur()
	{
		return largeur;
	}

	public Vecteur[] getSommets()
	{
		// TODO implement
		return null;
	}

	@Override
	public void dessiner(Graphics2D g)
	{
		Vecteur position = getPosition();
		g.drawRect((int)position.getX(), (int)position.getY(), (int)longueur, (int)largeur);
	}

	public Rectangle copier()
	{
		return new Rectangle(getPosition(), getOrientation(), longueur, largeur, getCouleurTrait(), getEpaisseurTrait(), getCouleurRemplissage());
	}

	@Override
	public void redimensionner(double facteur)
	{
		longueur *= facteur;
		largeur *= facteur;
	}

	@Override
	public String toString()
	{
		// TODO implement
		return null;
	}
}
