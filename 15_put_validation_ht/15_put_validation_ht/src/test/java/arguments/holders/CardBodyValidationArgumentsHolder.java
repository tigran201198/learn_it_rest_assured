package arguments.holders;

import java.util.Map;

public class CardBodyValidationArgumentsHolder {

    private final Map<String, Object> bodyParams;

    private final String errorMessage;

    public CardBodyValidationArgumentsHolder(Map<String, Object> bodyParams, String errorMessage) {
        this.bodyParams = bodyParams;
        this.errorMessage = errorMessage;
    }

    public Map<String, Object> getBodyParams() {
        return bodyParams;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
