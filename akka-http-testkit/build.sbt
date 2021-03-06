import akka._
import com.typesafe.tools.mima.plugin.MimaKeys

AkkaBuild.defaultSettings
AkkaBuild.experimentalSettings
Formatting.formatSettings
OSGi.httpTestkit
Dependencies.httpTestkit
MimaKeys.previousArtifacts := akkaStreamAndHttpPreviousArtifacts("akka-http-testkit").value

scalacOptions in Compile  += "-language:postfixOps"
