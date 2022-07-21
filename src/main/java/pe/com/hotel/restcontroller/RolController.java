package pe.com.hotel.restcontroller;

import pe.com.hotel.entity.Roles;
import pe.com.hotel.service.RolService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rol")
public class RolController {
    
    @Autowired
    private RolService rolService;
    
    @GetMapping
    public List<Roles> findAll(){
        return rolService.findAll();
    }
    @GetMapping("/custom")
    public List<Roles> findAllCustom(){
        return rolService.findAllCustom();
    }  
    @GetMapping("/{id}")
    public Optional<Roles> finById(@PathVariable Long id){
        return rolService.findById(id);
    }
    @PostMapping
    public Roles add(@RequestBody Roles ro){
        return rolService.add(ro);
    }  
    @PutMapping("/{id}")
    public Roles update(@PathVariable Long id,@RequestBody Roles ro){
        ro.setCodigo(id);
        return rolService.update(ro);
    }
    @DeleteMapping("/{id}")
    public Roles delete(@PathVariable Long id){
        Roles objrol= new Roles();
        objrol.setCodigo(id);
        return rolService.delete(objrol);
    }  
}
