package com.githubdatatracker;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String username;
        while(true)
        {

            System.out.println("Enter username:");
            username= scanner.nextLine();

            if(username.equalsIgnoreCase("exit"))
                break;
            if(username.isEmpty())
            {
                System.out.println("Empty username is invalid");
                continue;
            }
            List<GitHubEvent> data=GitHubApiHandler.fetchData(username);
            DisplayManager.display(data);



        }

        scanner.close();
    }
}