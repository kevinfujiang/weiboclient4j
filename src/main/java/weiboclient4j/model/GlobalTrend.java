package weiboclient4j.model;

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author Hover Ruan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalTrend {
    private String name;
    private String query;

    public GlobalTrend() {

    }

    GlobalTrend(JsonNode json) {
        name = json.get("name").asText();
        query = json.get("query").asText();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
