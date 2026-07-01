package com.dictionary.controller;

import java.util.ArrayList;
import java.util.List;

public class Request {
    private final String action;
    private final String keyword;
    private final List<String> params;

    public Request(String action, String keyword, List<String> params){
        this.action = (action != null) ? action.trim().toLowerCase() : "";
        this.keyword = (keyword != null) ? keyword.trim().toLowerCase() : "";
        this.params = (params != null) ? params : new ArrayList<>();
    }

    public String getAction(){
        return action;
    }

    public String getKeyword(){
        return keyword;
    }

    public List<String> getParams(){
        return params;
    }
}
