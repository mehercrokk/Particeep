object MapYourMap {

  //Tell developer names by the department code

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")


  val namesInDepartments =  devDepartments.map(kv => {
    if(devNames(kv._1) != None){
      var l:List[String]=List()
      kv._2 -> List(devNames(kv._1))
    }
    else{
      kv
    }
  })
  /*
Map(analytics -> List(Pierre),frontend -> List(Alexandre), api -> List(Noe))
 */
}

