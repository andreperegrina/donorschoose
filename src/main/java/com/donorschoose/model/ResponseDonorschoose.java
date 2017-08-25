package com.donorschoose.model;

import java.util.List;

public class ResponseDonorschoose {
    public List<List<String>> breadcrumb;
    public List<Project> proposals;
    public int max;

    @Override
    public String toString() {
        return "Response{" +
                "proposals=" + proposals +
                '}';
    }
}
