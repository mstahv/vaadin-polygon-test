package com.testPolygon;

import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.LPolygon;
import org.vaadin.addon.leaflet.shared.Point;

/**
 * Created by Przemysław on 02.04.2017.
 */
@SpringUI
@Widgetset("AppWidgetset")
public class Greeter2 extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        LMap map = new LMap();
        map.addBaseLayer(new LOpenStreetMapLayer(), "CloudMade");
        map.setCenter(60.455, 22.300);
        map.setZoomLevel(18);

        LPolygon leafletPolygon = new LPolygon(new Point(60.455, 22.300),
                new Point(60.456, 22.302), new Point(60.50, 22.308));
        leafletPolygon.setColor("#FF00FF");
        leafletPolygon.setFill(true);
        leafletPolygon.setFillColor("#00FF00");
        map.addComponent(leafletPolygon);
        map.addLayer(leafletPolygon);
        setContent(map);
    }
}