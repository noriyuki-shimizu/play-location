package src.domain.repository

class IpInfoRepositor {


  def get(url: String): Unit = {
    val holder: WSRequestHolder = WS.url(url)

    val complexHolder: WSRequestHolder =
      holder.withHeaders("Accept" -> "application/json")
        .withRequestTimeout(10000)
        .withQueryString("search" -> "play")
  }

}
