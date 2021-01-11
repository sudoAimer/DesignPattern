package sy2_5;

public class Mainframe {
    //包含子系统的引用
    private CPU cpu;
    private HardDisk hardDisk;
    private OS os;
    private Memory memory;

    public Mainframe() {
        cpu = new CPU();
        hardDisk = new HardDisk();
        os = new OS();
        memory = new Memory();
    }
    //为客户端屏蔽子系统的具体方法
    public void on() {
        memory.check();
        cpu.run();
        hardDisk.read();
        os.load();
    }

}

