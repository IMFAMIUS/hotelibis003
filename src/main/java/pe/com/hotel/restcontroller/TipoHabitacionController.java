package pe.com.hotel.restcontroller;

import pe.com.hotel.entity.TipoHabitacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.hotel.service.TipoHabitacionService;

@RestController
@RequestMapping("/tipoHabitacion")
public class TipoHabitacionController {
    
    @Autowired
    private TipoHabitacionService tipohabitacionService;
    
    @GetMapping
    public List<TipoHabitacion> findAll(){
        return tipohabitacionService.findAll();
    }
    @GetMapping("/custom")
    public List<TipoHabitacion> findAllCustom(){
        return tipohabitacionService.findAllCustom();
    }  
    @GetMapping("/{id}")
    public Optional<TipoHabitacion> finById(@PathVariable Long id){
        return tipohabitacionService.findById(id);
    }
    @PostMapping
    public TipoHabitacion add(@RequestBody TipoHabitacion th){
        return tipohabitacionService.add(th);
    }  
    @PutMapping("/{id}")
    public TipoHabitacion update(@PathVariable Long id,@RequestBody TipoHabitacion th){
        th.setCodigo(id);
        return tipohabitacionService.update(th);
    }
    @DeleteMapping("/{id}")
    public TipoHabitacion delete(@PathVariable Long id){
        TipoHabitacion objthabitacion= new TipoHabitacion();
        objthabitacion.setCodigo(id);
        return tipohabitacionService.delete(objthabitacion);
    }  
}
