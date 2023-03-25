package info.iss.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import info.iss.model.Astros;
import info.iss.model.People;

import java.util.List;

public class ISSAstrosData {

    ISSApiReader issAstrosReader;
    Astros peopleInSpace;

    public ISSAstrosData(String apiURL) {
        this.issAstrosReader = new ISSApiReader(apiURL);
        getAstrosData();
    }

    private void getAstrosData(){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            peopleInSpace = objectMapper.readValue(issAstrosReader.getApiDate().toString(),Astros.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    public List<People> getPeopleInSpace(){
        return peopleInSpace.getPeople();
    }
}
