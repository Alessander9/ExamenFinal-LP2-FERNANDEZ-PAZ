package pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.service;

import java.util.List;

import pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.model.entity.ProductoEntity;

public interface ProductoService {
    List<ProductoEntity> buscarTodosProductos();
    ProductoEntity buscarProductoPorId(Integer id);
    void nuevoProducto(ProductoEntity producto);
    void actualizarProducto(Integer id, ProductoEntity producto);
}
