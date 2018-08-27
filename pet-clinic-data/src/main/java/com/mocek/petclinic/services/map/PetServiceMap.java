package com.mocek.petclinic.services.map;

import com.mocek.petclinic.model.Pet;
import com.mocek.petclinic.services.CrudService;
import com.mocek.petclinic.services.PetService;
import com.mocek.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

}
