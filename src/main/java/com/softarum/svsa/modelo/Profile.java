package com.softarum.svsa.modelo;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Profile {
    @Id
    private Long id;
    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    private UsuarioTemp usuarioTemp;
}
