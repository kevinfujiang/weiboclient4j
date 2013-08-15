package weiboclient4j.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Hover Ruan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SenderApp {
    private String appkey62;

    public String getAppkey62() {
        return appkey62;
    }

    public void setAppkey62(String appkey62) {
        this.appkey62 = appkey62;
    }
}
