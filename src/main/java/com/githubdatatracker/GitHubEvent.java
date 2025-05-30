package com.githubdatatracker;

import com.google.gson.annotations.SerializedName;

public class GitHubEvent {
    private String type;
    private Repo repo;
    private String created_at;

    public GitHubEvent()
    {

    }

    public GitHubEvent(String type,Repo repo,String created_at)
    {
        this.type=type;
        this.repo=repo;
        this.created_at=created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Repo getRepo() {
        return repo;
    }

    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return type + " | Repo: " + repo + " | Date: " + created_at;
    }

}
