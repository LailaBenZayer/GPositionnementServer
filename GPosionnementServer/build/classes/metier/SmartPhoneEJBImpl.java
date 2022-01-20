package ma.metier;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.entites.SmartPhone;
import ma.entites.Utilisateur;

@Stateless(name = "SmartPhone")
public class SmartPhoneEJBImpl implements SmartPhoneLocal {

	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll
	public List<SmartPhone> findAll() {
		Query query = em.createQuery("from SmartPhone");
		return query.getResultList();
	}


	@Override
	@PermitAll
	public SmartPhone Create(SmartPhone u) {
		em.persist(u);
		return u;
	}

	@Override
	@PermitAll
	public SmartPhone findById(int id) {
		SmartPhone cm = em.find(SmartPhone.class, id);
		if (cm == null)
			throw new RuntimeException("Smart introvable");
		return cm;
	}

	@Override
	@PermitAll
	public boolean update(SmartPhone u) {
		em.persist(em.contains(u)? u:em.merge(u));
		return true;
	}

	@Override
	@PermitAll
	public boolean delete(SmartPhone u) {
		em.remove(em.contains(u)? u:em.merge(u));
		return true;
	}

}

