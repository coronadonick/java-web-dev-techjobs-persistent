package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank (message = "Cannot leave blank")
    @Size(max = 500, message = "Please shorten input character length")
    private String location;

    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



}