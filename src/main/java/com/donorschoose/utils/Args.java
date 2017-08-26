package com.donorschoose.utils;

import com.beust.jcommander.DynamicParameter;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Parameters(separators = "=")
public class Args {
    @Parameter(description = "Search Projects functionality")
    public String parameters;


    @Parameter(names = "-keywords", description = "Search Projects functionality. The keyword search matches any of the following field: id, title, synopsis, short description, fulfillment trailer, school name, teacher’s first name, teacher’s last name, city, county , district, ward/neighborhood, state , zip, subject name")
    public String keywords;

    @DynamicParameter(names = "-D", description = "With this argument you can add dynamic parameters. You can add just 1")
    public Map<String, String> dynamicParameters = new HashMap<>();

    @Parameter(names = "--help", help = true)
    public boolean help = false;

}
