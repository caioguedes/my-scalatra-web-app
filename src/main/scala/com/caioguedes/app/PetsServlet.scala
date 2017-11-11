package com.caioguedes.app

import org.scalatra._

class PetsServlet extends ScalatraServlet {
  get("/") {
    val pets = List[String]("Menininho", "Ellie", "Picculo", "Macabeia")
    views.html.pets.list(pets)
  }
}
