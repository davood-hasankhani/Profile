package com.example.demo;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(appliesTo = "Profile")
public class Profile implements Comparable<Profile>{

    @Id
    private Long id;

    private String profileAddress;
    private String profileAssignment;
    private String profileHealth;
    private String ProfileTemplate;
    private String profileName;
    private String profileDirectory;
    private String profileConcept;
    private String profileRule;

    public Profile(String profileTemplate, String profileName, String profileDirectory, String profileRule) {
        ProfileTemplate = profileTemplate;
        this.profileName = profileName;
        this.profileDirectory = profileDirectory;
        this.profileRule = profileRule;
    }

    public Profile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfileAddress() {
        return profileAddress;
    }

    public void setProfileAddress(String profileAddress) {
        this.profileAddress = profileAddress;
    }

    public String getProfileAssignment() {
        return profileAssignment;
    }

    public void setProfileAssignment(String profileAssignment) {
        this.profileAssignment = profileAssignment;
    }

    public String getProfileHealth() {
        return profileHealth;
    }

    public void setProfileHealth(String profileHealth) {
        this.profileHealth = profileHealth;
    }

    public String getProfileTemplate() {
        return ProfileTemplate;
    }

    public void setProfileTemplate(String profileTemplate) {
        ProfileTemplate = profileTemplate;
    }

    public String getProfileDirectory() {
        return profileDirectory;
    }

    public void setProfileDirectory(String profileDirectory) {
        this.profileDirectory = profileDirectory;
    }

    public String getProfileConcept() {
        return profileConcept;
    }

    public void setProfileConcept(String profileConcept) {
        this.profileConcept = profileConcept;
    }

    public String getProfileRule() {
        return profileRule;
    }

    public void setProfileRule(String profileRule) {
        this.profileRule = profileRule;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @Override
    public int compareTo(Profile o) {
        return 0;
    }
}
