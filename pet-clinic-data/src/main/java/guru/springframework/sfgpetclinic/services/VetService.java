package guru.springframework.sfgpetclinic.services;
import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService {
    Vet findById(long id);

    Vet Save(Vet vet);

    Set<Vet> findAll();
}
