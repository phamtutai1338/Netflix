package com.movie.t2108a.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.movie.t2108a.model.Netflix;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class NetflixRepository {
    public List<Netflix> netflixList;
    public void getData(){
        try{
            FileReader reader = new FileReader("netflix.json");

            Type objectType = new TypeToken<List<Netflix>>(){}.getType();
            netflixList = new Gson().fromJson(reader,objectType);
            for (Netflix netflix: netflixList){
                System.out.println(netflix);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
