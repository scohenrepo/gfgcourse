import java.util.List;

public class Test {


    static int[] a = {1, 2, 3, 4, 5};//reverse by 2 positions
    public static void main(String[] args) {
       new Test();
    }

    public Test() {
        List<String> lines = Utils.readFile("src/road.txt");

        long t0 = findTrees(lines, 1, 1);
        long t1 = findTrees(lines, 3, 1);
        long t2 = findTrees(lines, 5, 1);
        long t3 = findTrees(lines, 7, 1);
        long t4 = findTrees(lines, 1, 2);

        System.out.println("PART ONE: " + t1);
        System.out.println("PART TWO: " + (t0*t1*t2*t3*t4));
    }

    public long findTrees(List<String> lines, int xPerMove, int yPerMove) {
        System.out.println("lines size:  " + lines.size());
        int trees = 0;
        int x = 0;
        for(int y = 0; y < lines.size(); y+=yPerMove) {
            if(isTree(lines.get(y), x))
                trees++;
            x += xPerMove;
        }
        return trees;
    }

    private boolean isTree(String line, int index) {
        return line.charAt(index%line.length()) == '#';
    }


}
