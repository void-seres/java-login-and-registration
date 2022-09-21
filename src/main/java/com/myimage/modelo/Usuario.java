package com.myimage.modelo;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;
import
@Entity
@Table(name="usuario_temp")//nome do banco de dados onde estarão persistidos os objetos de usuario
@SequenceGenerator(name = "seq", sequenceName = "seq_userTemp", allocationSize = 1, initialValue = 1)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @NaturalId//define que a chave id do usuario é não nula no banco de dados
    private String login;
    private String senha;

}
