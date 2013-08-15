package weiboclient4j.model;

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import org.codehaus.jackson.node.ArrayNode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Hover Ruan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalTrendList {
    private String time;
    private List<GlobalTrend> trends;
    private long asOf;

    public GlobalTrendList() {
    }

    public GlobalTrendList(JsonNode json) {
        asOf = json.get("as_of").longValue();
        JsonNode trendsNode = json.get("trends");
        Iterator<String> fieldNames = trendsNode.fieldNames();
        if (fieldNames.hasNext()) {
            time = fieldNames.next();
            ArrayNode trendArray = (ArrayNode) trendsNode.get(time);
            trends = new ArrayList<GlobalTrend>();
            for (JsonNode trendNode : trendArray) {
                trends.add(new GlobalTrend(trendNode));
            }
        }
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<GlobalTrend> getTrends() {
        return trends;
    }

    public void setTrends(List<GlobalTrend> trends) {
        this.trends = trends;
    }

    public long getAsOf() {
        return asOf;
    }

    public void setAsOf(long asOf) {
        this.asOf = asOf;
    }
}
