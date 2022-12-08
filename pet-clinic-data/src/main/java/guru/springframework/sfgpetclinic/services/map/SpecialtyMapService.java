package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.services.CrudService;
import guru.springframework.sfgpetclinic.services.SpecialtiesService;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtiesService {

    @Override
    public Set<Specialty> findAll(){
        return super.findAll();
    }

    @Override
    public Specialty findBy(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);        
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    
}
