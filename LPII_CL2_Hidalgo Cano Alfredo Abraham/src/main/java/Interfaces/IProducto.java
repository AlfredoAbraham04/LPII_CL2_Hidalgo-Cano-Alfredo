package Interfaces;

import java.util.List;

import model.Producto;

public interface IProducto {
	public void RegistrarProducto(Producto producto);
	public void ActualizarProducto(Producto producto);
	public void EliminarProducto(Producto producto);
	public Producto buscarProducto(Producto producto);
	public List<Producto> milista();
}
