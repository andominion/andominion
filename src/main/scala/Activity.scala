package org.howdyworld.andominion

import com.google.android.maps._
import _root_.android.app.Activity
import _root_.android.os.Bundle
import _root_.android.widget.TextView

class Andominion extends MapActivity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.simple_map);
  }

  override protected def isRouteDisplayed() = false
}
