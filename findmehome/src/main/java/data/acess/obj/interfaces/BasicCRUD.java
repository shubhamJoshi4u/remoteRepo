package data.acess.obj.interfaces;

import java.util.List;

public interface BasicCRUD {
	
	public String create();
	public boolean remove();
	public boolean update();
	public Object fetchById(String id);
	public List<Object> fetchAll();

}
