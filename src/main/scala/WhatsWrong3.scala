import akka.actor.Actor

import scala.concurrent.Future
import scala.util.{ Failure, Success }
import scala.concurrent.ExecutionContext.Implicits.global

/*
Do you see anything that could lead to potential problems ?
What would you do to fix it ?
Do not mind about the not implemented code
*/

class WhatsWrong3 extends Actor {

  var internalState = "internal state"

  def receive: Receive = {
    case "a query" => {
      val requestF: Future[String] = queryAsyncServer()
      requestF.onComplete {
        case Success(r) => handleResponse(r)
        case Failure(e) => e.printStackTrace()
      }
      //ADD

      Thread.sleep(1000)
    }
  }
/*in the Future  you don’t know exactly
 when the result will be computed, the output from this code is nondeterministic so “Got the callback” message may appear anywhere in that output.
 Surely though the Thread.sleep() is blocking our main thread so that we can see the asynchronous result from the future*/

  def handleResponse(r: String) = ??? // mutate internal state

  def queryAsyncServer(): Future[String] = ???
}