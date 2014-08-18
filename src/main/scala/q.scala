case class CombinedInfo[A](
  combined: A,
  extraIPs: Set[Long],
  extraHosts: Set[String],
  notes: Set[String])
