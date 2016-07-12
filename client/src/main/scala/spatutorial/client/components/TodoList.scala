package spatutorial.client.components

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import spatutorial.client.components.Bootstrap.{Button, CommonStyle}
import spatutorial.shared._

import scalacss.ScalaCssReact._

object TodoList {
  // shorthand for styles
  @inline private def bss = GlobalStyles.bootstrapStyles

  case class ImageListProps(
                            items: Seq[ImageItem],
                            stateChange: ImageItem => Callback,
                            editItem: ImageItem => Callback,
                            deleteItem: ImageItem => Callback
  )

  private val ImageList = ReactComponentB[ImageListProps]("ImageList")
    .render_P(p => {
      val style = bss.listGroup
      def renderItem(item: ImageItem) = {
        // convert priority into Bootstrap style
        val itemStyle = item.estimatedAge match {
          case a if a >= 16 => style.itemOpt(CommonStyle.info)
          //          case TodoNormal => style.item
          case a if a < 16 => style.itemOpt(CommonStyle.danger)
        }
        <.li(itemStyle,
          //          <.input.checkbox(^.checked := item.completed, ^.onChange --> p.stateChange(item.copy(completed = !item.completed))),
          <.h1(item.estimatedAge),
          <.img(^.src := item.url, ^.width := 500),
          <.span(" "),
          Button(Button.Props(p.editItem(item), addStyles = Seq(bss.pullRight, bss.buttonXS)), "Edit"),
          Button(Button.Props(p.deleteItem(item), addStyles = Seq(bss.pullRight, bss.buttonXS)), "Delete")
        )
      }
      <.ul(style.listGroup)(p.items map renderItem)
    })
    .build

  def apply(items: Seq[ImageItem], stateChange: ImageItem => Callback, editItem: ImageItem => Callback, deleteItem: ImageItem => Callback) =
    ImageList(ImageListProps(items, stateChange, editItem, deleteItem))
}
