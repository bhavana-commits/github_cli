package com.githubdatatracker;

import java.util.List;

public class DisplayManager {


    public static void display(List<GitHubEvent> data) {
        if (data.isEmpty()) {
            System.out.println("No activity found for this user.");
            return;
        }

        System.out.println("GitHub User Activity:");
        System.out.println("----------------------");

        for (GitHubEvent event : data) {
            String eventType=event.getType();

            switch (eventType)
            {
                case "PushEvent":
                    System.out.println("Pushed "+event.getCommitCount()+" commits to "+event.getRepoName());
                    break;
                case "CreateEvent":
                    System.out.println("Created a new Repository "+event.getRepoName());
                    break;
                case "WatchEvent":
                    System.out.println("Starred "+event.getRepoName());
                    break;
                default:
                    System.out.println(eventType+" in repo "+event.getRepoName()+" on "+event.getCreated_at());
            }

        }
    }
}
