package com.caioguedes.app

import org.scalatra._
import models.Pet

class PetsServlet extends ScalatraServlet {

  var pets = List(new Pet("Menininho"), new Pet("Ellie"), new Pet("Piccolo"), new Pet("Macabeia"))

  get("/") {
    views.html.pets.list(pets)
  }

  get("/create") {
    views.html.pets.create()
  }

  post("/") {
    val name = params("name")
    if (!name.isEmpty) pets = new Pet(name) :: pets
    views.html.pets.success(name)
  }

}
