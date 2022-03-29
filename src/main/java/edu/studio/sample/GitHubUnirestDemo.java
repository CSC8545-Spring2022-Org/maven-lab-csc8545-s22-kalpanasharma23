package edu.studio.sample;

import kong.unirest.Unirest;

public class GitHubUnirestDemo {
    
    private static final String GITHUB_API_URL = 
            "https://api.github.com/repos/CSC8545-Spring2022-Org/maven-lab-csc8545-s22-kalpanasharma23/issues";
    
    public static void main(String[] args) {
        String getAllRespose = 
                Unirest.get(GITHUB_API_URL)
                .header("Authorization", "Bearer " + args[0])
                .asString()
                .getBody();
        System.out.println("GET ALL" + getAllRespose);
    }

}
