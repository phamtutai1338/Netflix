package com.movie.t2108a.controller;

import com.movie.t2108a.model.Netflix;
import com.movie.t2108a.repository.NetflixRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

public class NetflixController {
    NetflixRepository netflixRepository = new NetflixRepository();

    public void searchByName(List<Netflix> list, String name){

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getTitle().contains(name)){
                System.out.println(list.get(i));
            }


        }



    }
    public void searchByCategory(List<Netflix> list,String category){
        for (int i = 0; i< list.size(); i++){
            if ( list.get(i).getCategory().contains(category)){
                System.out.println(list.get(i));
            }
        }
    }
    public void searchByLanguage(List<Netflix> list,String language) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCategory().contains(language)) {
                System.out.println(list.get(i));
            }
        }
    }
    public void getAllMovieCategory(List<Netflix> list){
        Map<String, Integer> countMovieByCategory = new HashMap<>();

    }

}
