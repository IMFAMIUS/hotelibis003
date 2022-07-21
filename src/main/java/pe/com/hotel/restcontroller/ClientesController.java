package pe.com.hotel.restcontroller;

import pe.com.hotel.entity.Clientes;
import pe.com.hotel.service.ClientesService;
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

@RestController
@RequestMapping("/cliente")
public class ClientesController {
    
    @Autowired
    private ClientesService clientesService;
    
    @GetMapping
    public List<Clientes> findAll(){
        return clientesService.findAll();
    }
    @GetMapping("/custom")
    public List<Clientes> findAllCustom(){
        return clientesService.findAllCustom();
    }  
    @GetMapping("/{id}")
    public Optional<Clientes> finById(@PathVariable Long id){
        return clientesService.findById(id);
    }
    @PostMapping
    public Clientes add(@RequestBody Clientes cl){
        return clientesService.add(cl);
    }  
    @PutMapping("/{id}")
    public Clientes update(@PathVariable Long id,@RequestBody Clientes cl){
        cl.setCodigo(id);
        return clientesService.update(cl);
    }
    @DeleteMapping("/{id}")
    public Clientes delete(@PathVariable Long id){
        Clientes objclientes= new Clientes();
        objclientes.setCodigo(id);
        return clientesService.delete(objclientes);
    }  
}
