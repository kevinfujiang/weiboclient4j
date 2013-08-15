package weiboclient4j.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Hover Ruan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VerifyNicknameResult {
    @JsonProperty("is_legal")
    private boolean legal;

    private List<String> suggestNickname;

    public boolean isLegal() {
        return legal;
    }

    public void setLegal(boolean legal) {
        this.legal = legal;
    }

    public List<String> getSuggestNickname() {
        return suggestNickname;
    }

    public void setSuggestNickname(List<String> suggestNickname) {
        this.suggestNickname = suggestNickname;
    }
}
