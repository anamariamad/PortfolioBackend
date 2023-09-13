package com.Portfolio.domain.models;

import jakarta.persistence.*;

@Entity
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private String image;

    private String repositoryLink;

    private String repositoryDeploy;

    public Project() {

    }

    public Project(Long id, String name, String description, String image, String repositoryLink, String repositoryDeploy) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.repositoryLink = repositoryLink;
        this.repositoryDeploy = repositoryDeploy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRepositoryLink() {
        return repositoryLink;
    }

    public void setRepositoryLink(String repositoryLink) {
        this.repositoryLink = repositoryLink;
    }

    public String getRepositoryDeploy() {
        return repositoryDeploy;
    }

    public void setRepositoryDeploy(String repositoryDeploy) {
        this.repositoryDeploy = repositoryDeploy;
    }
}
