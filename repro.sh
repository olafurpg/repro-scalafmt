git checkout master -- src
sbt "; scalafmt; scalafmtCheck" # fails
sbt "; scalafmt; scalafmtCheck" # succeeds

git checkout master -- src
sbt "; scalafmt; scalafmt; scalafmtCheck" # fails


