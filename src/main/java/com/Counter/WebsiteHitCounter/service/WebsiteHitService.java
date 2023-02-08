package com.Counter.WebsiteHitCounter.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class WebsiteHitService {
    private static int count=0;

    private static final int usercount=1;
    private static HashMap<String, Integer> UserCounter = new HashMap<>();
    public String count(){
        return "Visitor :"+ ++count;
    }

    public String perUserCounter(String user){

        if(UserCounter.containsKey(user)){
            UserCounter.put(user,UserCounter.get(user)+1);
        }
        else{
            UserCounter.put(user,usercount);
        }

        return ""+user+":"+UserCounter.get(user);

    }

}
