name := "leetcode"

scalaVersion := "2.13.5"

scalacOptions ++= Seq("-language:higherKinds",
                      "-deprecation",
                      "-feature")

libraryDependencies += "com.lihaoyi" %% "utest" % "0.7.9" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")
