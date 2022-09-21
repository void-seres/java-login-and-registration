package com.myimage.modelo;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.NaturalId;
@Entity
public class Profile {
    @Id
    private Long id;
    private String name;
    @NaturalId
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    private Usuario user;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Usuario getUser(){
        return user;
    }
    public void setUser(Usuario user){
        this.user=user;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
