package step_definitions;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.ConfigManager;

public abstract class BaseStep {
    static protected Response response;
    static protected RequestSpecification request;
    protected String baseURI;
    protected String authTokenEndpoint;

    protected static String accessToken;

    public BaseStep(){
        baseURI= ConfigManager.getProperty("baseURI");
        authTokenEndpoint=ConfigManager.getProperty("auth.token.endpoint");

    }
}
