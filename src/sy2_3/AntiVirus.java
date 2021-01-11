package sy2_3;

public class AntiVirus {
    public static void main(String[]args) {
        File file1,file2,file3;
        Folder folder = new Folder();
        file1 = new ImageFile();
        file2 = new TextFile();
        file3 = new VideoFile();
        folder.add(file1);
        folder.add(file2);
        folder.add(file3);
        folder.shadu();
    }
}
