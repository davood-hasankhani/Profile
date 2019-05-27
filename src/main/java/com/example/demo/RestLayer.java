package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class RestLayer {

    @Autowired
    private  ProfileDataLayer profileDataLayer ;

    @RequestMapping("/")
    public List<Profile> getProfile()
    {
        return profileDataLayer.getProfileDataLayer().Find("Davood");
    }

    @RequestMapping("/profile")
    public List<Profile> getCustomeProfile(){
        try{
        Stream stream = profileDataLayer.getProfileDataLayer().Find("Davood").stream().sorted();
        List<Profile> profiles = (List<Profile>) stream.skip(5).collect(Collectors.toList());
        return profiles;
        }catch (Exception e){
            e.printStackTrace();
            List<Profile > pr = new ArrayList<Profile>();
            pr.add(new Profile( e.getMessage(),"","",""));
            return pr ;
        }
    }

}
