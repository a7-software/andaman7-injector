package biz.manex.andaman7.injector.webservice.REST;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * An base class for any implementation of a REST service.
 *
 * @author Pierre-Yves Derbaix (pierreyves.derbaix@gmail.com)<br/>
 * Copyright A7 Software (http://www.manex.biz)<br/>
 * Date: 24/01/2015.<br/>
 */
public class CustomRestService {

    /**
     * The REST template.
     * @see biz.manex.andaman7.injector.webservice.REST.CustomRestTemplate
     */
    protected CustomRestTemplate restTemplate;

    /**
     * The mapper used to convert JSON into objects and vice versa.
     * @see org.codehaus.jackson.map.ObjectMapper
     */
    protected final ObjectMapper jsonMapper;


    /**
     * Builds a connection to a REST web service.
     *
     * @param urlServer the URL of the server
     * @param apiKey the API key
     * @param login the login used for the authentication
     * @param password the password used for the authentication
     */
    protected CustomRestService(String urlServer, String apiKey, String login, String password) {

        restTemplate = new CustomRestTemplate(urlServer, apiKey, login, password);
        jsonMapper = new ObjectMapper();
    }
}
