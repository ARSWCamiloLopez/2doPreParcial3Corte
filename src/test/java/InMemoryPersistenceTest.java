
import edu.eci.arsw.dopreparcial3corte.model.Cadena;
import edu.eci.arsw.dopreparcial3corte.model.CadenaRepository;
import edu.eci.arsw.dopreparcial3corte.persistence.Persistence;
import edu.eci.arsw.dopreparcial3corte.persistence.impl.InMemoryPersistence;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author camilo
 */
public class InMemoryPersistenceTest {

    @Autowired
    Persistence persistence;
    
    @Autowired
    CadenaRepository repository;
    
    /**
     *
     */
    @Test
    public void añadir5CadenasYVerificarCantidad() {
        
//        Integer tamañoInicial = repository.findAll().size();
//        
//        Cadena cadena1 = new Cadena("Cadena nueva", new Date());
//        Cadena cadena2 = new Cadena("Cadena nueva", new Date());
//        Cadena cadena3 = new Cadena("Cadena nueva", new Date());
//        Cadena cadena4 = new Cadena("Cadena nueva", new Date());
//        Cadena cadena5 = new Cadena("Cadena nueva", new Date());
//        
//        repository.save(cadena1);
//        repository.save(cadena2);
//        repository.save(cadena3);
//        repository.save(cadena4);
//        repository.save(cadena5);
//        
//        assertEquals(tamañoInicial + 5, repository.findAll().size());
    }
}
