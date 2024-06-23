package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.Producto;

public class ClassProductolmp implements IProducto{

	@Override
	public void RegistrarProducto(Producto producto) {
		// TODO Auto-generated method stub
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("bdhidalgocano");
		EntityManager em = fabr.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(producto);
		System.out.println("se registro correctamente");
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void ActualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarProducto(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto buscarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> milista() {
		// TODO Auto-generated method stub
		return null;
	}

}
