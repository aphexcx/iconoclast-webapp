package services

import spatutorial.shared.{Api, Image}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class ApiService extends Api {

  override def welcomeMsg(name: String): Future[String] = {
    Api.getImageStats map (s =>
      s"Welcome to Iconoclast! There are ${s.totalCount} scraped photos in the system, of which ${s.analyzedCount} have been analyzed.")
  }

  override def getAllImages(): Future[Seq[Image]] = {
    Api.getUnderageImages
  }

  //update a spatutorial.shared.Image
  override def updateImage(item: Image): Seq[Image] = {
    //    // TODO, update database etc :)
    //    if (fakeImages.exists(_.id == item.id)) {
    //      fakeImages = fakeImages.collect {
    //        case i if i.id == item.id => item
    //        case i => i
    //      }
    //      println(s"spatutorial.shared.Image item was updated: $item")
    //    } else {
    //      // add a new item
    //      val newItem = item.copy(id = UUID.randomUUID().toString)
    //      fakeImages :+= newItem
    //      println(s"spatutorial.shared.Image item was added: $newItem")
    //    }
    //    Thread.sleep(300)
    //    fakeImages
    Seq()
  }

  // delete a spatutorial.shared.Image
  override def deleteImage(itemId: String): Seq[Image] = {
    println(s"Deleting item with id = $itemId")
    Thread.sleep(300)
    Seq()
  }
}
