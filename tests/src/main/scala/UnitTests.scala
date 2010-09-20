package org.howdyworld.andominion.tests

import junit.framework.Assert._
import _root_.android.test.AndroidTestCase

class UnitTests extends AndroidTestCase {
  def testPackageIsCorrect {
    assertEquals("org.howdyworld.andominion", getContext.getPackageName)
  }
}