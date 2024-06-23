package Test;

import DAO.ClassProductolmp;
import model.Producto;

public class TestEntidades {
	public static void main(String[] args) {
		Producto pro =  new Producto();
		ClassProductolmp lmp = new ClassProductolmp();
		
		pro.setNombre("hola");
		pro.setPrecioVenta(234.4);
		pro.setPrecioCompra(233.4);
		pro.setEstado("disponible");
		pro.setDescrip("es buen estado");
		lmp.RegistrarProducto(pro);
	}
}
