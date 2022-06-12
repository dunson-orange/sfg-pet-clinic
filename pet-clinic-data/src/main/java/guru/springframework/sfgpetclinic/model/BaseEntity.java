package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by m.d. on 08/09/2021
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
