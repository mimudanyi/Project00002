package java.cn.mimudanyi;

public class Cat implements IPet {
    private String name;
    private String color;

    public Cat(String name, String color) {
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
        if (!(obj instanceof Cat)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Cat cat = (Cat)obj;
        return this.name.equals(cat.name) && this.color.equals(cat.color);
    }

    public String toString() {
        return "【宠物猫】" + "名字是：" + this.name + "颜色是：" + this.color;
    }
}
