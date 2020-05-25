package com.masterofspring.DependencyInjectionExamples.Controllers;

import com.masterofspring.DependencyInjectionExamples.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public  String whichPetisBest(){
        return this.petService.getPetType();
    }
}
