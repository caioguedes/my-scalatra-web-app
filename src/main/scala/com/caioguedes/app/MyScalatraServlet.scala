package com.caioguedes.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  get("/") {
    views.html.index()
  }

}
