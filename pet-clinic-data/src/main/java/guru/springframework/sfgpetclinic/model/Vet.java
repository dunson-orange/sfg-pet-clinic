package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by m.d. on 08/08/2021
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
