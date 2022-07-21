package pe.com.hotel.impl;

import pe.com.hotel.entity.Clientes;
import pe.com.hotel.repository.ClientesRepository;
import pe.com.hotel.service.ClientesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientesServiceImpl implements ClientesService{
    
    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public List<Clientes> findAll() {
        return clientesRepository.findAll();
    }

    @Override
    public List<Clientes> findAllCustom() {
        return clientesRepository.findAllCustom();
    }

    @Override
    public List<Clientes> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Clientes> findById(Long id) {
        return clientesRepository.findById(id);
    }

    @Override
    public Clientes add(Clientes c) {
        return clientesRepository.save(c);
    }

    @Override
    public Clientes update(Clientes c) {
        Clientes objcliente=clientesRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcliente);
        return clientesRepository.save(objcliente);
    }

    @Override
    public Clientes delete(Clientes c){
        Clientes objclientes=clientesRepository.getById(c.getCodigo());
        objclientes.setEstado(false);
        return clientesRepository.save(objclientes);
    }
}
