name := "dv01-coding-challenge-onsite"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "com.github.tototoshi" %% "scala-csv" % "1.3.5"
libraryDependencies +=  "org.scalatra" %% "scalatra" % "2.5.+"
libraryDependencies +=  "javax.servlet" %  "javax.servlet-api" % "3.1.0"
libraryDependencies += "org.eclipse.jetty" % "jetty-webapp" % "9.4.9.v20180320" % "container"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.7.2"

enablePlugins(ScalatraPlugin)
enablePlugins(SbtTwirl)
