package guru.springframework.sfgpetclinic.model;

/**
 * Created by m.d. on 08/08/2021
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
