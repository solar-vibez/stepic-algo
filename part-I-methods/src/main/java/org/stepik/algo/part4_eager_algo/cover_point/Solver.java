package org.stepik.algo.part4_eager_algo.cover_point;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solver {

    private static void findPoints(List<Segment> segments){
        Integer pointer = -1;
        Stream<Segment> segmentStream = segments.stream().sorted(Comparator.comparing(Segment::getEnd));
        List<Integer> result = new ArrayList<>();
        Iterator<Segment> iterator = segmentStream.iterator();
        while(iterator.hasNext()){
            Segment segment = iterator.next();
            if (segment.getBegin() > pointer){
                pointer = segment.getEnd();
                result.add(pointer);
            }
        }
        System.out.println(result.size());
        System.out.println(result.stream() .map(Object::toString) .collect(Collectors.joining(" ")));

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        List<Segment> segments = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int begin = scanner.nextInt();
            int end = scanner.nextInt();
            segments.add(new Segment(begin, end));
        }
        findPoints(segments);
    }
}
