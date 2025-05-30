package com.githubdatatracker;

import java.util.List;

public class GitHubEvent {
    private String type;
    private Repo repo;
    private Payload payload;
    private String created_at;


    private static class Repo
    {
        private String name;

        public String getName() { return name; }

    }

    private static class Payload
    {
        private List<Commit> commits;

        public List<Commit> getCommits() {
            return commits;
        }
    }

    private static class Commit
    {
        private String sha;
        private String message;

        public String getSha() {
            return sha;
        }

        public String getMessage() {
            return message;
        }
    }

    public int getCommitCount()
    { if(payload!=null && payload.commits!=null)
        return payload.commits.size();
      return 0;
    }


    public String getType() {
        return type;
    }


    public String getRepoName() {
        if(repo!=null && repo.name!=null)
            return repo.name;
        return "Unknown repo";
    }

    public String getCreated_at() {
        return created_at;
    }

}
