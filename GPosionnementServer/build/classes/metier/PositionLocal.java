package ma.metier;

import java.util.List;

import javax.ejb.Local;

import ma.entites.Position;


@Local
public interface PositionLocal {

	public Position Create(Position u);
	public Position findById(int id);
	List<Position> findAll();
	boolean update(Position u);
	boolean delete(Position u);
}
