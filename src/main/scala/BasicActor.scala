
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
class BasicActor  extends Actor{
  def receive = {
    case "hello" => println("Hello there")
    case _       => println("What?")
  }
}

object FireActor  extends App {
  def fireActor(): Unit = {
    val system = ActorSystem("ActorSystem")
    // default Actor constructor
    val basic_actor = system.actorOf(Props[BasicActor], name = "basicactor")
    basic_actor ! "hello"
    basic_actor ! "other"
  }
  fireActor()
}
