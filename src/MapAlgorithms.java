import java.util.ArrayList;
import java.util.Stack;

/**
 * This class contains algorithms for digraphs
 * Adapted from: http://cs.fit.edu/~ryan/java/programs/graph/Dijkstra-java.html
 * @author Mauricio Toro
 * @version 1
 */
public class MapAlgorithms
{

    public static void aStar(Map map, Vertex start, Vertex goal){

    }

    public double distancia(Vertex vertex1, Vertex vertex2){
        final double R_TIERRA = 6371000;
        double x1, y1, z1, x2, y2, z2;
        x1 = R_TIERRA * Math.cos(Math.toRadians(vertex1.getCoordinateX())) * Math.cos(Math.toRadians(vertex1.getCoordinateY()));
        y1 = R_TIERRA * Math.sin(Math.toRadians(vertex1.getCoordinateY()));
        z1 = R_TIERRA * Math.sin(Math.toRadians(vertex1.getCoordinateX())) * Math.cos(Math.toRadians(vertex1.getCoordinateY()));
        x2 = R_TIERRA * Math.cos(Math.toRadians(vertex2.getCoordinateX())) * Math.cos(Math.toRadians(vertex2.getCoordinateY()));
        y2 = R_TIERRA * Math.sin(Math.toRadians(vertex2.getCoordinateY()));
        z2 = R_TIERRA * Math.sin(Math.toRadians(vertex2.getCoordinateX())) * Math.cos(Math.toRadians(vertex2.getCoordinateY()));
        return R_TIERRA * Math.acos((2 * Math.pow(R_TIERRA, 2) - Math.pow(x2 - x1, 2) - Math.pow(y2 - y1, 2) - Math.pow(z2 - z1, 2)) / (2 * Math.pow(R_TIERRA, 2)));
    }
}