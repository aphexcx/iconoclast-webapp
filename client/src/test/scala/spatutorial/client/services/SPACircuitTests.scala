package spatutorial.client.services

import utest._
import utest.framework.{Test, Tree}

object SPACircuitTests extends TestSuite {
  //  def tests = TestSuite {
  //    'TodoHandler - {
  //      val model = Ready(Todos(Seq(
  //        ImageItem("1", 0, "Test1", TodoLow, completed = false),
  //        ImageItem("2", 0, "Test2", TodoLow, completed = false),
  //        ImageItem("3", 0, "Test3", TodoHigh, completed = true)
  //      )))
  //
  //      val newTodos = Seq(
  //        ImageItem("3", 0, "Test3", TodoHigh, completed = true)
  //      )
  //
  //      def build = new TodoHandler(new RootModelRW(model))
  //
  //      'RefreshTodos - {
  //        val h = build
  //        val result = h.handle(RefreshTodos)
  //        result match {
  //          case EffectOnly(effects) =>
  //            assert(effects.size == 1)
  //          case _ =>
  //            assert(false)
  //        }
  //      }
  //
  //      'UpdateAllTodos - {
  //        val h = build
  //        val result = h.handle(UpdateAllTodos(newTodos))
  //        assert(result == ModelUpdate(Ready(Todos(newTodos))))
  //      }
  //
  //      'UpdateTodoAdd - {
  //        val h = build
  //        val result = h.handle(UpdateTodo(ImageItem("4", 0, "Test4", TodoNormal, completed = false)))
  //        result match {
  //          case ModelUpdateEffect(newValue, effects) =>
  //            assert(newValue.get.items.size == 4)
  //            assert(newValue.get.items(3).id == "4")
  //            assert(effects.size == 1)
  //          case _ =>
  //            assert(false)
  //        }
  //      }
  //
  //      'UpdateTodo - {
  //        val h = build
  //        val result = h.handle(UpdateTodo(ImageItem("1", 0, "Test111", TodoNormal, completed = false)))
  //        result match {
  //          case ModelUpdateEffect(newValue, effects) =>
  //            assert(newValue.get.items.size == 3)
  //            assert(newValue.get.items.head.estimatedAge == "Test111")
  //            assert(effects.size == 1)
  //          case _ =>
  //            assert(false)
  //        }
  //      }
  //
  //      'DeleteTodo - {
  //        val h = build
  //        val result = h.handle(DeleteTodo(model.get.items.head))
  //        result match {
  //          case ModelUpdateEffect(newValue, effects) =>
  //            assert(newValue.get.items.size == 2)
  //            assert(newValue.get.items.head.estimatedAge == "Test2")
  //            assert(effects.size == 1)
  //          case _ =>
  //            assert(false)
  //        }
  //      }
  //    }
  //
  //    'MotdHandler - {
  //      val model: Pot[String] = Ready("Message of the Day!")
  //      def build = new MotdHandler(new RootModelRW(model))
  //
  //      'UpdateMotd - {
  //        val h = build
  //        var result = h.handle(UpdateMotd())
  //        result match {
  //          case ModelUpdateEffect(newValue, effects) =>
  //            assert(newValue.isPending)
  //            assert(effects.size == 1)
  //          case _ =>
  //            assert(false)
  //        }
  //        result = h.handle(UpdateMotd(Ready("New message")))
  //        result match {
  //          case ModelUpdate(newValue) =>
  //            assert(newValue.isReady)
  //            assert(newValue.get == "New message")
  //          case _ =>
  //            assert(false)
  //        }
  //      }
  //    }
  //  }
  override def tests: Tree[Test] = ???
}
