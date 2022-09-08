package yte.proje.obs.academician.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import yte.proje.obs.common.entity.BaseEntity;
import yte.proje.obs.common.entity.enums.HesapTuru;

@NoArgsConstructor
@AllArgsConstructor
public class Academician extends BaseEntity {

    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private HesapTuru hesapTuru;
}