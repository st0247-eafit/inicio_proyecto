import java.util.*;

/**
 * This class contains algorithms for map
 * @author Stiven Agudelo
 * @version 1
 */
public class MapAlgorithms
{

    public void aStar(Map map, long idStar, long idGoal){
        LinkedList<PairStar> openList = new LinkedList<>();
        LinkedList<PairStar> closeList = new LinkedList<>();
        searchRoad(map, idStar, idGoal, openList, closeList);
    }

    public LinkedList searchRoad(Map map, long idNow, long idGoal, LinkedList openList, LinkedList closeList){
        if(idNow == idGoal){
            return closeList;
        }
        for (long id: map.getSuccessors(idNow)) {
            PairStar pairSuccessor = new PairStar(id, map.getDistance(idNow, id)+distance(map, id, idGoal));
            if (openList.contains(pairSuccessor)){
            }
        }

    }

    public double distance(Map map, long idVertex1, long idVertex2){
        final double R_TIERRA = 6371000;
        double x1, y1, z1, x2, y2, z2;
        Vertex vertex1 = map.getVertex(idVertex1);
        Vertex vertex2 = map.getVertex(idVertex2);
        x1 = R_TIERRA * Math.cos(Math.toRadians(vertex1.getCoordinateX())) * Math.cos(Math.toRadians(vertex1.getCoordinateY()));
        y1 = R_TIERRA * Math.sin(Math.toRadians(vertex1.getCoordinateY()));
        z1 = R_TIERRA * Math.sin(Math.toRadians(vertex1.getCoordinateX())) * Math.cos(Math.toRadians(vertex1.getCoordinateY()));
        x2 = R_TIERRA * Math.cos(Math.toRadians(vertex2.getCoordinateX())) * Math.cos(Math.toRadians(vertex2.getCoordinateY()));
        y2 = R_TIERRA * Math.sin(Math.toRadians(vertex2.getCoordinateY()));
        z2 = R_TIERRA * Math.sin(Math.toRadians(vertex2.getCoordinateX())) * Math.cos(Math.toRadians(vertex2.getCoordinateY()));
        return R_TIERRA * Math.acos((2 * Math.pow(R_TIERRA, 2) - Math.pow(x2 - x1, 2) - Math.pow(y2 - y1, 2) - Math.pow(z2 - z1, 2)) / (2 * Math.pow(R_TIERRA, 2)));
    }
}