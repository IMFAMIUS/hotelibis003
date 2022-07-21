package pe.com.hotel.impl;

import pe.com.hotel.entity.Roles;
import pe.com.hotel.repository.RolRepository;
import pe.com.hotel.service.RolService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolServiceImpl implements RolService{
    
    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Roles> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public List<Roles> findAllCustom() {
        return rolRepository.findAllCustom();
    }

    @Override
    public List<Roles> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Roles> findById(Long id) {
        return rolRepository.findById(id);
    }

    @Override
    public Roles add(Roles ro) {
        return rolRepository.save(ro);
    }

    @Override
    public Roles update(Roles ro) {
        Roles objrol=rolRepository.getById(ro.getCodigo());
        BeanUtils.copyProperties(ro, objrol);
        return rolRepository.save(objrol);
    }

    @Override
    public Roles delete(Roles ro){
        Roles objrol=rolRepository.getById(ro.getCodigo());
        objrol.setEstado(false);
        return rolRepository.save(objrol);
    }
}
