package com.donorschoose.logic;

import com.donorschoose.model.AverageProjects;
import com.donorschoose.model.DonorschooseService;
import com.donorschoose.model.Project;
import com.donorschoose.model.ResponseDonorschoose;
import com.donorschoose.utils.RetrofitCustom;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DonorschooseLogic {
    private Map<String, String> parameters = new HashMap<>();

    public DonorschooseLogic() {
//        Basic parameters init
        parameters.put("APIKey", "DONORSCHOOSE");
        parameters.put("max", "5");
        parameters.put("costToCompleteRange", "0+TO+2000");
        parameters.put("state", "CA");
        parameters.put("sortBy", "0");
    }

    public static AverageProjects getAverageTotals(List<Project> projectList) {
        AverageProjects averageProjects = new AverageProjects();
        for (Project project : projectList) {
            averageProjects.addPercentFundedTotal(project.getPercentFunded());
            averageProjects.addNumberDonorsTotal(project.getNumDonors());
            averageProjects.addCostToCompleteTotal(project.getCostToComplete());
            averageProjects.addNumberStudentsTotal(project.getNumStudents());
            averageProjects.addTotalPriceTotal(project.getTotalPrice());
        }

        averageProjects.setNumberProjects(projectList.size());
        return averageProjects;
    }

    public void setParameter(String key, String value) {
        parameters.put(key, value);
    }

    public List<Project> getProjects() {

        Retrofit retrofit = RetrofitCustom.build();
        DonorschooseService donorschooseService = retrofit.create(DonorschooseService.class);

        Call<ResponseDonorschoose> call = donorschooseService.getProjects(parameters);
        try {
            ResponseDonorschoose responseDonorschoose = call.execute().body();
            if (responseDonorschoose != null) {
                for (List<String> querys : responseDonorschoose.breadcrumb) {
                    String queryCondition = "";
                    String queryValue = "";
                    for (int i = 0; i < querys.size(); i++) {
                        String queryString = querys.get(i);
                        switch (i) {
                            case 0:
                                queryCondition = queryString;
                                break;
                            case 1:
                                queryValue = queryString;
                                break;
                        }
                    }

//                    Validate the criteria in with the API information
                    switch (queryCondition) {
                        case "state":
                            assert queryValue.equals("CA");
                            break;
                        case "max":
                            long maxResults = Long.parseLong(queryValue);
                            assert maxResults <= 5;
                            break;
                        case "costToCompleteRange":
                            assert queryValue.equals("0 TO 2000");
                            break;
                    }
                }
                return responseDonorschoose.proposals;
            } else {
                System.out.println("There was not results.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
