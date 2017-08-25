package com.donorschoose.utils;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import java.util.ArrayList;
import java.util.List;

@Parameters(separators = "=")
public class Args {
    @Parameter(description = "Search Projects functionality")
    public String parameters;


    @Parameter(names = "-keywords", description = "Search Projects functionality. The keyword search matches any of the following field: id, title, synopsis, short description, fulfillment trailer, school name, teacher’s first name, teacher’s last name, city, county , district, ward/neighborhood, state , zip, subject name")
    public String keywords;

    @Parameter(names = "--help", help = true)
    public boolean help = false;

}
