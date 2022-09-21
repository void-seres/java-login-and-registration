package com.myimage.controller;


import java.util.Map;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.myimage.business.ProfileBusiness;
import com.myimage.model.Profile;
import com.myimage.model.Usuario;
import com.myimage.modelo.Profile;
import com.myimage.modelo.Usuario;
import com.myimage.utils.GenerateValidation;
import com.myimage.utils.Role;
import com.myimage.utils.ManipulateDate;
import com.myimage.utils.security.GenerateMD5;

@ManagedBean(name = "user")
@RequestScoped
public class UsuarioBean {
    private Usuario user = null;
    private Profile profile = null;
    @PostConstruct
    public void init() {
        user = new Usuario();
        profile = new Profile();
    }

    public String save() {

        ProfileBusiness profileBusiness = new ProfileBusiness();

        user.setPassword(GenerateMD5.generate(user.getPassword()));
        user.setValidation(GenerateValidation.keyValidation());
        user.getPermissions().add(Role.ROLE_COMMON.getValue());
        user.setActive(false);

        profile.setUser(user);
        profile.setBirth(ManipulateDate.getDate(year, month, day));

        profileBusiness.save(profile);
        return "/public/feedback_login";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
