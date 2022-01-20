package ma.metier;

import java.util.List;

import javax.ejb.Local;

import ma.entites.SmartPhone;

@Local
public interface SmartPhoneLocal {

	public SmartPhone Create(SmartPhone u);
	public SmartPhone findById(int id);
	List<SmartPhone> findAll();
	boolean update(SmartPhone u);
	boolean delete(SmartPhone u);
}
