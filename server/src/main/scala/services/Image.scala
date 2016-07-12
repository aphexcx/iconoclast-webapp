package services

import spray.json.DefaultJsonProtocol

case class Image(_id: MongoObjectId, url: String, estimatedAge: Double, adId: MongoObjectId)

case class MongoObjectId($oid: String)

object ImageJsonProtocol extends DefaultJsonProtocol {
  implicit val mongoOidFormat = jsonFormat1(MongoObjectId)
  implicit val imageFormat = jsonFormat4(Image)
}
