package com.caioguedes.app

import java.util.UUID

import org.scalatra._
import models.Pet

class PetsServlet extends ScalatraServlet with FlashMapSupport {

  var pets = Seq(
    new Pet("1", "Menininho"),
    new Pet("2", "Ellie"),
    new Pet("3", "Piccolo"),
    new Pet("4", "Macabeia")
  )

  get("/") {
    views.html.pets.list(pets, flash)
  }

  get("/create") {
    views.html.pets.create()
  }

  post("/") {
    val name = params("name")
    if (!name.isEmpty)
      pets :+= new Pet(UUID.randomUUID().toString, name)
    flash("message") = "The Pet was registered!"
    redirect("/pets")
  }

}
