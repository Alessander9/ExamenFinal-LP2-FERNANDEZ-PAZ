package pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.model.entity.PedidoEntity;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoEntity, Integer>{

}
