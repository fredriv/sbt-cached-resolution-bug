lazy val proj = (project in file(".")).
  aggregate(foo, bar)

lazy val foo = project.in(file("foo"))

lazy val bar = project.in(file("bar")).dependsOn(foo % Test)

scalaVersion in Global := "2.11.4"