package spatutorial.shared

import scala.concurrent.Future
trait Api {
  // message of the day
  def welcomeMsg(name: String): Future[String]

  // get Todo items
  def getAllImages(): Future[Seq[Image]]

  // update a Todo
  def updateImage(item: Image): Seq[Image]

  // delete a Todo
  def deleteImage(itemId: String): Seq[Image]
}
