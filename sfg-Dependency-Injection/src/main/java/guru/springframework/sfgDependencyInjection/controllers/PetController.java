package guru.springframework.sfgDependencyInjection.controllers;

import com.springframework.pets.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService;
// Parameter 0 of constructor in guru.springframework.sfgDependencyInjection.controllers.PetController required a
// bean of type 'com.springframework.pets.PetService' that could not be found.
    public PetController(PetService petService) {
        this.petService = petService;
    }
    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
