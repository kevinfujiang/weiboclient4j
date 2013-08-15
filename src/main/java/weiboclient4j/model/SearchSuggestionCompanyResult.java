package weiboclient4j.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

/**
 * @author Hover Ruan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchSuggestionCompanyResult {
    public static final TypeReference<List<SearchSuggestionCompanyResult>> TYPE_SEARCH_SUGGESTION_COMPANY_RESULT_LIST =
            new TypeReference<List<SearchSuggestionCompanyResult>>() {
            };

    private String suggestion;

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
