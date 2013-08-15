package weiboclient4j.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

/**
 * @author Hover Ruan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchSuggestionAtUserResult {
    public static final TypeReference<List<SearchSuggestionAtUserResult>> TYPE_SEARCH_SUGGESTION_AT_USER_RESULT_LIST =
            new TypeReference<List<SearchSuggestionAtUserResult>>() {
            };

    private long uid;
    private String nickname;
    private String remark;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
