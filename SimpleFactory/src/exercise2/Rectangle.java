package exercise2;

public class Rectangle implements Shape {
    public Rectangle() {
        System.out.println("长方形创建成功！");
    }

    @Override
    public void draw() {
        System.out.println("绘制长方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除长方形");
    }
}
