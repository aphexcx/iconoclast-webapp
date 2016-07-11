package spatutorial.client.components


import java.text.SimpleDateFormat
import java.util.Date

import diode.react.ReactPot._
import diode.react._
import diode.data.Pot
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import spatutorial.client.components.Bootstrap._
import spatutorial.client.services.UpdateMotd

/**
  * This is a simple component demonstrating how to display async data coming from the server
  */
object Motd {
//  val date = new SimpleDateFormat("hh:mm:ss //// EEE MMM dd yyyy").format(new Date).replace("////", "on")

  // create the React component for holding the Message of the Day
  val Motd = ReactComponentB[ModelProxy[Pot[String]]]("Motd")
    .render_P { proxy =>

      Panel(Panel.Props(s"Current Stats"),//(updated $date))"),
        // render messages depending on the state of the Pot
        proxy().renderPending(_ > 500, _ => <.p("Loading...")),
        proxy().renderFailed(ex => <.p("Failed to load")),
        proxy().render(m => <.p(m)),
        Button(Button.Props(proxy.dispatch(UpdateMotd()), CommonStyle.warning), Icon.refresh, " Update")
      )
    }
    .componentDidMount(scope =>
      // update only if Motd is empty
      Callback.when(scope.props.value.isEmpty)(scope.props.dispatch(UpdateMotd()))
    )
    .build

  def apply(proxy: ModelProxy[Pot[String]]) = Motd(proxy)
}
