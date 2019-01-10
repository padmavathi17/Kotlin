
package com.example;

import java.util.HashMap;
import java.util.Map;

public class ElectionsPojo
{

    private Integer id;
    private String name;
    private String place;
    private Integer votes;
    private Boolean isWon;
    private Boolean isMinister;
    private String ministryname;
    private String image;
    private String description;
    private String party;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Boolean getIsWon() {
        return isWon;
    }

    public void setIsWon(Boolean isWon) {
        this.isWon = isWon;
    }

    public Boolean getIsMinister() {
        return isMinister;
    }

    public void setIsMinister(Boolean isMinister) {
        this.isMinister = isMinister;
    }

    public String getMinistryname() {
        return ministryname;
    }

    public void setMinistryname(String ministryname) {
        this.ministryname = ministryname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
