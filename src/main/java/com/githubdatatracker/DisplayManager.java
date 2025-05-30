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
            System.out.println( event.getType() +" in repo " + event.getRepo().getName() + " on " + event.getCreated_at());
        }
    }
}
