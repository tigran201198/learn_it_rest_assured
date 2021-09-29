package arguments;

import java.util.Map;

public class AuthValidationArgumentsHolder {

    private final Map<String, String> authParams;

    public AuthValidationArgumentsHolder(Map<String, String> authParams) {
        this.authParams = authParams;
    }

    public Map<String, String> getAuthParams() {
        return authParams;
    }
}
