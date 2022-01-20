package ma.metier;

import java.util.List;

import javax.ejb.Local;

import ma.entites.Utilisateur;

@Local
public interface UtilisateurLocal {
	
	public Utilisateur Create(Utilisateur u);
	public Utilisateur findById(int id);
	List<Utilisateur> findAll();
	boolean update(Utilisateur u);
	boolean delete(Utilisateur u);

}
