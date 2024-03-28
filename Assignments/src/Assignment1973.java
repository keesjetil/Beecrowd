import java.util.*;

public class Assignment1973 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var N = scn.nextInt();
        List<Long> intList = new ArrayList<>();
        for(int i=0; i< N; i++){
            if(scn.hasNext()){
                intList.add(Long.parseLong(scn.next()));
            }else{
                intList.add(0L);
            }
        }

        ListIterator<Long> intIterator = intList.listIterator();
        Set<Integer> attackedList = new HashSet<>();
        var currentElement= intIterator.next();
        var currentIndex = 0;
        boolean finished = false;
        boolean movingForward = true;
        while(!finished){
            if(currentElement%2 ==1){
                if(currentElement - 1 <= 0){
                    currentElement = 1L;
                }
                intList.set(currentIndex, currentElement -1);
                attackedList.add(currentIndex);

                if(!movingForward && intIterator.hasNext()){
                    movingForward = true;
                    currentIndex = intIterator.nextIndex();
                    currentElement = intIterator.next();
                }

                if(intIterator.hasNext()){
                    currentIndex = intIterator.nextIndex();
                    currentElement = intIterator.next();

                }else{
                    finished = true;
                }
            }else{
                if(currentElement - 1 <= 0){
                    currentElement = 1L;
                }
                intList.set(currentIndex, currentElement -1);
                attackedList.add(currentIndex);
                if(movingForward && intIterator.hasPrevious()){
                    movingForward = false;
                    currentIndex = intIterator.previousIndex();
                    currentElement = intIterator.previous();
                }
                if(intIterator.hasPrevious()){
                    currentIndex = intIterator.previousIndex();
                    currentElement = intIterator.previous();
                }else{
                    finished = true;
                }
            }

        }
        System.out.printf("%d %d%n", (long) attackedList.size(), intList.stream().reduce(0L, Long::sum));
    }
}
