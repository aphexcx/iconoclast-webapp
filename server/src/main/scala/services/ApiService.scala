package services

import java.util.UUID

import spatutorial.shared._

class ApiService extends Api {
  var fakeImages = Seq(
    ImageItem("578347a0d4affc770152fccc", "http://images1.backpage.com/imager/u/large/250303885/2c5d177eaa8a5683861ea9538805f574.jpg", 16.7),
    ImageItem("578347a0d4affc770152fccc", "http://images2.backpage.com/imager/u/large/289210595/2afec41b431659a2d601727bd916968e.jpg", 14.3),
    ImageItem("578347a0d4affc770152fccc", "http://images2.backpage.com/imager/u/large/288098987/9d243a650df5adb3022aa0a76ca860bf.jpg", 17.4),
    ImageItem("578347a0d4affc780152fcda", "http://images3.backpage.com/imager/u/large/286655227/a2cb1298e480e2c243586439a523c15f.jpg", 10.9)
  )


  override def welcomeMsg(name: String): String = {
    val images = 100
    val analyzed = 28
    s"Welcome to Iconoclast! There are $images scraped photos in the system, of which $analyzed have been analyzed."
  }

  override def getAllImages(): Seq[ImageItem] = {
    // provide some fake Images
    Thread.sleep(300)
    println(s"Sending ${fakeImages.size} Image items")
    fakeImages
  }

  // update a Image
  override def updateTodo(item: ImageItem): Seq[ImageItem] = {
    // TODO, update database etc :)
    if (fakeImages.exists(_.id == item.id)) {
      fakeImages = fakeImages.collect {
        case i if i.id == item.id => item
        case i => i
      }
      println(s"Image item was updated: $item")
    } else {
      // add a new item
      val newItem = item.copy(id = UUID.randomUUID().toString)
      fakeImages :+= newItem
      println(s"Image item was added: $newItem")
    }
    Thread.sleep(300)
    fakeImages
  }

  // delete a Image
  override def deleteTodo(itemId: String): Seq[ImageItem] = {
    println(s"Deleting item with id = $itemId")
    Thread.sleep(300)
    fakeImages = fakeImages.filterNot(_.id == itemId)
    fakeImages
  }
}
