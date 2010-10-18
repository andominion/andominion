package org.howdyworld.andominion

import com.google.android.maps._
import _root_.android.app.Activity
import _root_.android.os.Bundle
import _root_.android.widget.TextView
import org.maidroid.scalamap.SMapView

class Andominion extends MapActivity with TypedActivity {

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.simple_map)
    val mapView = findView(TR.map)
    mapView.setClickable(true);
    mapView.setBuiltInZoomControls(true);

  }

  override protected def isRouteDisplayed() = false
}
