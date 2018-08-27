package com.mocek.petclinic.services.map;

import com.mocek.petclinic.model.Speciality;
import com.mocek.petclinic.model.Vet;
import com.mocek.petclinic.services.SpecialitiesService;
import com.mocek.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialitiesService specialtyService;

    public VetServiceMap(SpecialitiesService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }
}
