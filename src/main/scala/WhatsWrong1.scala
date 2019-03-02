object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  Supporter.city //What does this print ?
  /*
  * when we println we can see result =>"city"
  * */
  Supporter.support //What does this print and why ? How to fix it ?
  /*
  * /*
This write "Ici c'est null !" because it take the value of variable on the Interface.
We need to override support property in the Supporter object
*/
  * */
}