name := "sbt-release-test"

scalaVersion := "2.12.12"

publish / skip := true

addCommandAlias("release", "release with-defaults")