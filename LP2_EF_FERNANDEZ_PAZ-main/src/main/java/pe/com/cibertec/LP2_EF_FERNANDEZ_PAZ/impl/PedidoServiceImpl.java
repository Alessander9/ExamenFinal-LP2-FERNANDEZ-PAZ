package pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.model.entity.PedidoEntity;
import pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.repository.PedidoRepository;
import pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.service.PedidoService;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService{

	private final PedidoRepository pedidoRepository;
	
	@Override
	public void crearPedido(PedidoEntity pedidoEntity) {
		// TODO Auto-generated method stub
		pedidoRepository.save(pedidoEntity);
		
	}

}
