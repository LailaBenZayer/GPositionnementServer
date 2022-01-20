package ma.metier;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.entites.Position;

public class PositionEJBImpl implements PositionLocal {

	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll
	public Position Create(Position u) {
		em.persist(u);
		return u;
	}

	@Override
	public Position findById(int id) {
		Position cm = em.find(Position.class, id);
		if (cm == null)
			throw new RuntimeException("User introvable");
		return cm;
	}

	@Override
	@PermitAll
	public List<Position> findAll() {
		Query query = em.createQuery("from Position");
		return query.getResultList();
	}

	@Override
	public boolean update(Position u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Position u) {
		// TODO Auto-generated method stub
		return false;
	}

}

