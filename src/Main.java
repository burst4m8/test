public class Main {
    public static void main(String[] args)
    {
        int blockSize[] = {100, 500, 200, 300, 600};
        int processSize[] = {212, 417, 112, 426};
        int m = blockSize.length;
        int n = processSize.length;

        FirstFit ff1 = new FirstFit();
        ff1.firstFit(blockSize, m, processSize, n);
    }
}
