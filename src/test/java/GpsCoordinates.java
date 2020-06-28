import org.junit.jupiter.api.Test;

import javax.xml.stream.Location;

public class GpsCoordinates {

    @Test

    public void gpsCoordinates() {
        double lon = 37.258148;
        double lat = -6.939653;

        double lon2 = 57.164767;
        double lat2 = 65.564627;

        double consumption =  111.2 * Math.sqrt( (lon-lon2)*(lon-lon2)+(lat-lat2)*Math.cos(Math.PI*lon/180)*(lat-lat2)*
                Math.cos(Math.PI*lon/180));

        System.out.println("Distance is " + consumption + " km.");

    }
}


