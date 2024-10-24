package pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.service;

import org.springframework.web.multipart.MultipartFile;

import pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.model.entity.UsuarioEntity;

public interface UsuarioService {
	void crearUsuario(UsuarioEntity usuarioEntity, MultipartFile foto);
	boolean validarUsuario(UsuarioEntity usuarioEntity);
	UsuarioEntity buscarUsuarioPorCorreo(String correo);
}
