package guru.springframework.sfgpetclinic.services;
import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService{
    
    Owner findByLastName(String lastName);

    Owner findById(long id);

    Owner Save(Owner owner);

    Set<Owner> findAll();
}