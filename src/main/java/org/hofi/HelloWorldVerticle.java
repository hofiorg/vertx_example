package org.hofi;

import io.vertx.core.AbstractVerticle;

public class HelloWorldVerticle  extends AbstractVerticle {

  @Override
  public void start() {
    String name = config().getString("name", "World");
    vertx.createHttpServer().requestHandler(req -> req.response().end("Hello " + name + "!")).listen(8080);
  }
}