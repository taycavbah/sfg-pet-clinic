package guru.springframework.sfgpetclinic.services;
import guru.springframework.sfgpetclinic.model.Pet;

public interface PetService {

    Pet findById(long id);

    Pet Save(Pet pet);

    Set<Pet> findAll();
}
