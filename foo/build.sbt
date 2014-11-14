name := "foo"

libraryDependencies ++= Seq(
  "org.mockito" % "mockito-core" % "1.9.5",
  "org.scalatest" %% "scalatest" % "2.2.1"
)

updateOptions := updateOptions.value.withCachedResolution(true)