package com.donorschoose;

import com.beust.jcommander.JCommander;
import com.donorschoose.logic.DonorschooseLogic;
import com.donorschoose.model.AverageProjects;
import com.donorschoose.model.Project;
import com.donorschoose.utils.Args;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Args commands = new Args();
        JCommander jCommander = JCommander.newBuilder()
                .addObject(commands)
                .build();
        jCommander.parse(args);
        if (commands.help) {
            jCommander.usage();
            return;
        }

        String dynamicParameter = "";
        String dynamicParameterValue = "";


        Map<String, String> dynamicParameters = commands.dynamicParameters;
        for (String key : dynamicParameters.keySet()) {
            dynamicParameter = key.replace("D", "");
            dynamicParameterValue = dynamicParameters.get(key);
            break;
        }

//                    Validate the criteria
        switch (dynamicParameter) {
            case "state":
                assert dynamicParameterValue.equals("CA");
                break;
            case "max":
                long maxResults = Long.parseLong(dynamicParameterValue);
                assert maxResults <= 5;
                break;
            case "costToCompleteRange":
                assert dynamicParameterValue.equals("0 TO 2000");
                break;
        }


        DonorschooseLogic donorschooseLogic = new DonorschooseLogic();
        if (dynamicParameter.isEmpty() && commands.keywords != null)
            donorschooseLogic.setParameter("keywords", commands.keywords);
        if (!dynamicParameter.isEmpty())
            donorschooseLogic.setParameter(dynamicParameter, dynamicParameterValue);
        List<Project> projectList = donorschooseLogic.getProjects();
        for (Project project : projectList) {
            System.out.println(project + "\n\n");
        }
        AverageProjects averageTotals = DonorschooseLogic.getAverageTotals(projectList);
        System.out.println("\n" + averageTotals);
    }
}
