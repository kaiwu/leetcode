name := "leetcode"

scalaVersion := "2.12.8"

scalacOptions ++= Seq("-language:higherKinds",
                      "-Ypartial-unification",
                      "-deprecation",
                      "-feature")

libraryDependencies += "com.lihaoyi" %% "utest" % "0.6.7" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")
