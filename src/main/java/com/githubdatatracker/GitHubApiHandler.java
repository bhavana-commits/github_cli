package com.githubdatatracker;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpRequest;
import java.util.List;

public class GitHubApiHandler {

    public static List<GitHubEvent> fetchData(String username)
    {
        String api="https://api.github.com/users/"+username+"/events";
        

        try{
            URL url = new URL(api);
            HttpsURLConnection connection=(HttpsURLConnection) url.openConnection();
            int responseCode=connection.getResponseCode();

            if(responseCode==200) {

                try(BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    List<GitHubEvent> data = new Gson().fromJson(in, new TypeToken<List<GitHubEvent>>() {
                    }.getType());
                    return data;
                /*StringBuilder content=new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                    return content.toString();
                }*/
                }



            } else if (responseCode==404) {
                System.out.println("Error:GitHub User not found");
            } else if (responseCode==403) {
                System.out.println("Error:API rate limit exceeded.Please try again later.");
            }else {
                System.out.println("Error:failed to fetch GitHub Activity");
            }


        }catch (IOException e)
        {
            System.out.println("Error in fetching the data"+e.getMessage());

        }

        return List.of();

    }
}
