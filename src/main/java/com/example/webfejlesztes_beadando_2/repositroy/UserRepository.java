package com.example.webfejlesztes_beadando_2.repositroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getAllUserNames() {
        List<String> usernameList = new ArrayList<>();
        usernameList.addAll(jdbcTemplate.queryForList("SELECT Username FROM `tabla`;", String.class));

        return usernameList;
    }

    public List<String> getAllcolor(){
        List<String> colorList = new ArrayList<>();
        colorList.addAll(jdbcTemplate.queryForList("SELECT Titkos FROM `tabla`;", String.class));

        return colorList;
    }
}
