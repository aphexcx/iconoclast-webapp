package spatutorial.shared

import scala.concurrent.Future

trait Api {
  // message of the day
  def welcomeMsg(name: String): String

  // get Todo items
  def getAllImages(): Future[Seq[ImageItem]]

  // update a Todo
  def updateTodo(item: ImageItem): Seq[ImageItem]

  // delete a Todo
  def deleteTodo(itemId: String): Seq[ImageItem]
}
