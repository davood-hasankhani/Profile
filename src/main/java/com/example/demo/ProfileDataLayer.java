package com.example.demo;

import com.example.Db.Connectin.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public  class ProfileDataLayer implements RepositoryLayer<Profile,String> {

    private ProfileDataLayer profileDataLayer;


    public ProfileDataLayer getProfileDataLayer(){
        if(profileDataLayer != null)
            return profileDataLayer;
        else
            return new ProfileDataLayer() ;
    }

    @Override
    public Profile Create(Profile profile)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(profile);
            session.beginTransaction().commit();
        }catch(Exception e){

        } finally {
            session.close();
        }
        return null;
    }

    @Override
    public Boolean Upadate(Profile profile) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.saveOrUpdate(profile);
            session.getTransaction().commit();
        }catch (Exception e){
            return false;
        }finally {
            session.close();
        }
        return true;
    }

    @Override
    public Boolean Delete(Profile profile) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(profile);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            return false;
        }
        return true;
    }

    @Override
    public List<Profile> Find(String val) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
         return session.createQuery("FROM  Profile").getResultList();

/*        List<Profile> profileSample = new ArrayList<Profile>();
        profileSample.add(new Profile("Davood" , "Davood" , "Davood" , "Davood"));
        profileSample.add(new Profile("Hasankhani","Hasankhani","Hasankhani","Hasankhani"));
        profileSample.add(new Profile("","","",""));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "NewYourk"));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "London"));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "jentelMan"));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "Iran"));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "Dubay"));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "Turkish"));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "AmesterDam"));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "HamedaN"));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "NewZyland"));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "NewZyland"));
        profileSample.add(new Profile("Davood" ,"Hasankhani" , "Tehran" , "AzarBayjan"));


        return profileSample;*/
    }


}
