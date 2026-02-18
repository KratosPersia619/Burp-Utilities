# HTTPMethodMutation.java

The `HTTPMethodMutation.java` class is designed for performing HTTP method mutation testing. It operates by cycling through a variety of HTTP verbs: **GET**, **POST**, **PUT**, **DELETE**, **PATCH**, **OPTIONS**, **HEAD**, **TRACE**, and **CONNECT**.

## Key Features:
- **Authorization and Cookie Header Handling**: The class removes any `Authorization` and `Cookie` headers from the requests to test how the server responds to requests that lack these credentials.
- **Mutated Request Handling**: For each HTTP verb, it sends a mutated request to the designated endpoint.
- **Response Logging**: It logs the response status codes returned from the server for each mutated request, allowing for detailed analysis of how the server handles different HTTP methods.

This functionality is crucial for identifying potential security weaknesses in web applications, especially in how they handle various types of HTTP requests.