package src.controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class LocationController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def get() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.location());
  }

}
