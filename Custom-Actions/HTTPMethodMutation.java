String[] verbs = { "GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS", "HEAD", "TRACE", "CONNECT" }; 
for (String verb : verbs) { 
    var mutatedReq = requestResponse.request() 
        .withMethod(verb) 
        .withRemovedHeader("Authorization") 
        .withRemovedHeader("Cookie"); 
    try { 
        var response = api.http() 
            .sendRequest(mutatedReq) 
            .response(); 
        logging.logToOutput( verb + " → " + response.statusCode() ); 
    } catch (Exception e) { 
        logging.logToOutput(verb + " → FAILED"); 
    } 
}