package java.cn.mimudanyi;

public class Dog implements IPet {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Dog)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Dog dog = (Dog) obj;
        return this.name.equals(dog.name) && this.color.equals(dog.color);
    }

    public String toString() {
        return "【宠物狗】" + "名字是：" + this.name + "颜色是：" + this.color;
    }
}
