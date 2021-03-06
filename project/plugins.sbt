addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")




resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.eed3si9n"       %   "sbt-unidoc"              % "0.4.1")
addSbtPlugin("com.github.gseitz"  %   "sbt-release"             % "1.0.6")
addSbtPlugin("com.jsuereth"       %   "sbt-pgp"                 % "1.1.0")
addSbtPlugin("org.scoverage"      %   "sbt-scoverage"           % "1.5.1")
addSbtPlugin("com.timushev.sbt"   %   "sbt-updates"             % "0.3.2")
addSbtPlugin("com.typesafe.sbt"   %   "sbt-ghpages"             % "0.6.2")
addSbtPlugin("org.xerial.sbt"     %   "sbt-sonatype"            % "2.0")
//addSbtPlugin("com.updateimpact"   %   "updateimpact-sbt-plugin" % "2.1.2")
//addSbtPlugin("com.codacy"         %   "sbt-codacy-coverage"     % "1.3.10")
