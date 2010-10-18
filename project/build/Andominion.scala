import sbt._

trait Defaults {
  def androidPlatformName = "android-8"
}
class Andominion(info: ProjectInfo) extends ParentProject(info) {
  override def shouldCheckOutputDirectories = false
  override def updateAction = task { None }

  lazy val main  = project(".", "Andominion", new MainProject(_))
  lazy val tests = project("tests",  "tests", new TestProject(_), main)

  class MainProject(info: ProjectInfo) extends AndroidProject(info) with Defaults with MarketPublish {
    val keyalias  = "change-me"
    val scalatest = "org.scalatest" % "scalatest" % "1.0" % "test"
    override def addonsPath   = androidSdkPath / "add-ons" / "addon_google_apis_google_inc_8" / "libs"
  }

  class TestProject(info: ProjectInfo) extends AndroidTestProject(info) with Defaults
}
