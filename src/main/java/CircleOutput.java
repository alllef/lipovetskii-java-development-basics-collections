public class CircleOutput {

   public String getDispositionResult(CircleDisposition.CircleDispositionTypes type){

        switch (type){
            case TANGENT: return "Are tangent";
            case INTERSECTION: return "Are intersect";
            case UNINTERSECTION: return  "Do not intersect";
            default:break;
        }

        return "";
    }

    void printDispositionType(Circle firstCircle, Circle secondCircle,String result){
        System.out.println(firstCircle.toString()+" "+secondCircle.toString()+" "+result);
    }

}
