package io.vertx.sample;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;


public class MyFirstVerticle extends AbstractVerticle {
static int count = 0;

  @Override
  public void start() {


    // Create a router object.
    Router router = Router.router(vertx);

    router.route("/SimpleHttp/speedtest").handler(routingContext -> {
        HttpServerResponse response = routingContext.response();
        response
            .putHeader("content-type", "text/html")
            .end("VertX: Time on the server is " + java.time.LocalDateTime.now());
    });

    router.route("/").handler(routingContext -> {
        HttpServerResponse response = routingContext.response();
        response
            .putHeader("content-type", "text/html")
            .end("Go to <a href='/SimpleHttp/speedtest'>/SimpleHttp/speedtest</a>");
    });


    // Create the HTTP server and pass the "accept" method to the request handler.
    vertx.createHttpServer().requestHandler(router::accept).listen(8080);
  }

}
