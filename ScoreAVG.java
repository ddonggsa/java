public class ScoreAVG {
    public static void main(String[] args){
        double score[][] = {{3.3,3.4},{3.5,3.4},{2.4,4.4},{3.4,3.2}};

        double sum = 0;
        int year,term;
        for(year = 0;year<score.length;year++){
            for(term= 0;term<score[year].length;term++){
                sum += score[year][term];
            }
        }
        int n = score.length;
        int m = score[0].length;
        System.out.print("4년전체 평점은 "+ sum/(n*m));

    }
}
