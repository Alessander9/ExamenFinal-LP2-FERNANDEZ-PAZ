package pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.model.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String>{
	UsuarioEntity findByCorreo(String correo);

}
