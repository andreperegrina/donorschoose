package com.donorschoose;

import com.beust.jcommander.JCommander;
import com.donorschoose.logic.DonorschooseLogic;
import com.donorschoose.model.AverageProjects;
import com.donorschoose.model.Project;
import com.donorschoose.utils.Args;

import java.util.List;

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

        DonorschooseLogic donorschooseLogic = new DonorschooseLogic();
        if (commands.keywords != null)
            donorschooseLogic.setParameter("keywords", commands.keywords);
        List<Project> projectList = donorschooseLogic.getProjects();
        for (Project project : projectList) {
            System.out.println(project + "\n\n");
        }
        AverageProjects averageTotals = DonorschooseLogic.getAverageTotals(projectList);
        System.out.println("\n" + averageTotals);
    }
}
