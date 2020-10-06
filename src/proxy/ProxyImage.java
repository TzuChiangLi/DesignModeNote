package proxy;

/**
 * 代理对象：不对服务器或者其他远程数据进行操作，直接访问如果麻烦，在访问对象时加上本模式这种访问层
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
