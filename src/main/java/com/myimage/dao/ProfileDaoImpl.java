package com.myimage;

import com.myimage.model.Profile;
import org.hibernate.Session;

public class ProfileDaoImpl implements ProfileDao{
    private Session session;
    public void setSession(Session session){
        this.session=session;
    }
    @Override
    public void save(Profile profile){
        this.session.saveOrUpdate(profile);//salva o objeto no banco de dados caso não possua um valor no id
    }
}
