package hackerrank;

import java.util.List;

public class flippingOfMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int size = matrix.size();
        int totalSum = 0;

        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size / 2; j++) {
                int topLeft = matrix.get(i).get(j);
                int topRight = matrix.get(i).get(size - 1 - j);
                int bottomLeft = matrix.get(size - 1 - i).get(j);
                int bottomRight = matrix.get(size - 1 - i).get(size - 1 - j);

                totalSum += Math.max(Math.max(topLeft, topRight), Math.max(bottomLeft, bottomRight));
            }
        }

        return totalSum;
    }
}


//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//                List<List<Integer>> matrix = new ArrayList<>();
//
//                IntStream.range(0, 2 * n).forEach(i -> {
//                    try {
//                        matrix.add(
//                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                        .map(Integer::parseInt)
//                                        .collect(toList())
//                        );
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                });
//
//                int result = Result.flippingMatrix(matrix);
//
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }