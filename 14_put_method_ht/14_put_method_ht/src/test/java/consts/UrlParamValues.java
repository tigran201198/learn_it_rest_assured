package consts;

import java.util.Map;

public class UrlParamValues {

    public static final String VALID_KEY = "fb04999a731923c2e3137153b1ad5de0";
    public static final String VALID_TOKEN = "b73120fb537fceb444050a2a4c08e2f96f47389931bd80253d2440708f2a57e1";

    public static final Map<String, String> AUTH_QUERY_PARAMS = Map.of(
            "key", VALID_KEY,
            "token", VALID_TOKEN
    );

    public static final Map<String, String> ANOTHER_USER_AUTH_QUERY_PARAMS = Map.of(
            "key", "8b32218e6887516d17c84253faf967b6",
            "token", "492343b8106e7df3ebb7f01e219cbf32827c852a5f9e2b8f9ca296b1cc604955"
    );

    public static final String EXISTING_CARD_ID = "60e03f8328428d54e3f62252";
    public static final String CARD_ID_TO_UPDATE = "60e03f7ff7c9234efd7ed41f";
    public static final String EXISTING_LIST_ID = "60d84769c4ce7a09f9140221";
}
