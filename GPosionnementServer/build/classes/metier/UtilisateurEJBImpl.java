package ma.metier;

import java.util.List;
import java.util.Map;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;

import ma.entites.Compte;
import ma.entites.Utilisateur;

@Stateless(name = "Utilisateur")
public class UtilisateurEJBImpl implements UtilisateurLocal {

	@PersistenceContext
	private EntityManager em;
	
	public UtilisateurEJBImpl() {
		em =new EntityManager() {
			
			@Override
			public <T> T unwrap(Class<T> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void setProperty(String arg0, Object arg1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFlushMode(FlushModeType arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void remove(Object arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void refresh(Object arg0, LockModeType arg1, Map<String, Object> arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void refresh(Object arg0, LockModeType arg1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void refresh(Object arg0, Map<String, Object> arg1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void refresh(Object arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void persist(Object arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public <T> T merge(T arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void lock(Object arg0, LockModeType arg1, Map<String, Object> arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void lock(Object arg0, LockModeType arg1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void joinTransaction() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isOpen() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isJoinedToTransaction() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public EntityTransaction getTransaction() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T getReference(Class<T> arg0, Object arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, Object> getProperties() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Metamodel getMetamodel() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public LockModeType getLockMode(Object arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public FlushModeType getFlushMode() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EntityManagerFactory getEntityManagerFactory() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> List<EntityGraph<? super T>> getEntityGraphs(Class<T> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EntityGraph<?> getEntityGraph(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getDelegate() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CriteriaBuilder getCriteriaBuilder() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void flush() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public <T> T find(Class<T> arg0, Object arg1, LockModeType arg2, Map<String, Object> arg3) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T find(Class<T> arg0, Object arg1, LockModeType arg2) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T find(Class<T> arg0, Object arg1, Map<String, Object> arg2) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T find(Class<T> arg0, Object arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void detach(Object arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public StoredProcedureQuery createStoredProcedureQuery(String arg0, String... arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public StoredProcedureQuery createStoredProcedureQuery(String arg0, Class... arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public StoredProcedureQuery createStoredProcedureQuery(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> TypedQuery<T> createQuery(String arg0, Class<T> arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Query createQuery(CriteriaDelete arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Query createQuery(CriteriaUpdate arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> TypedQuery<T> createQuery(CriteriaQuery<T> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Query createQuery(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Query createNativeQuery(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Query createNativeQuery(String arg0, Class arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Query createNativeQuery(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public StoredProcedureQuery createNamedStoredProcedureQuery(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> TypedQuery<T> createNamedQuery(String arg0, Class<T> arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Query createNamedQuery(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EntityGraph<?> createEntityGraph(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> EntityGraph<T> createEntityGraph(Class<T> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean contains(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
		};
	}

	@Override
	@PermitAll
	public Utilisateur Create(Utilisateur u) {
		em.persist(u);
		return u;
	}

	@Override
	@PermitAll
	public Utilisateur findById(int id) {
		Utilisateur cm = em.find(Utilisateur.class, id);
		if (cm == null)
			throw new RuntimeException("User introvable");
		return cm;
	}

	@Override
	@PermitAll
	public List<Utilisateur> findAll() {
		Query query = em.createQuery("from Utilisateur");
		return query.getResultList();
	}

	@Override
	@PermitAll
	public boolean update(Utilisateur u) {
		em.persist(em.contains(u)? u:em.merge(u));
		return true;
	}

	@Override
	@PermitAll
	public boolean delete(Utilisateur u) {
		em.remove(em.contains(u)? u:em.merge(u));
		return true;
	}

}

