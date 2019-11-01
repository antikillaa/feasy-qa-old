package io.severex.qa.service.impl;

import io.severex.qa.service.api.APIClient;
import io.severex.qa.service.api.APIException;
import io.severex.qa.service.config.TestrailConfig;
import io.severex.qa.service.service.TestrailService;
import org.json.simple.JSONObject;

import java.io.IOException;

public class TestrailServiceImpl implements TestrailService {
    private final static String endPoint = TestrailConfig.ENDPOINT;
    private final static String username = TestrailConfig.USERNAME;
    private final static String password = TestrailConfig.PASSWORD;
    private final static int PROJECT_ID = TestrailConfig.PROJECT_ID;


    APIClient apiClient = new APIClient(endPoint);

    public APIClient createTestRailInstance() {
        APIClient apiClient = new APIClient(endPoint);
        apiClient.setUser(username);
        apiClient.setPassword(password);
        return apiClient;
    }

    public void createSuite() {
        APIClient apiClient = createTestRailInstance();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "auto");
        jsonObject.put("description", "auto");

        try {
            JSONObject c = (JSONObject) apiClient.sendPost("add_suite/2/", jsonObject);
            System.out.println(c);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
    }
}
