package info.iss.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import info.iss.model.ISSNow;

public class ISSNowData {

    private ISSApiReader issNowApiReader;
    private ISSNow issNow;

    public ISSNowData(String apiURL) {
        this.issNowApiReader = new ISSApiReader(apiURL);
        getISSNowData();
    }

    public ISSNow getIssNow() {
        return issNow;
    }

    private void getISSNowData() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            issNow = objectMapper.readValue(issNowApiReader.getApiDate().toString(),ISSNow.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
