package base.day14_枚举;

/**
 * @author xiao儿
 * @date 2019/9/4 8:24
 * @Description Color
 * <p>
 * 定义一个枚举类
 */
// public enum Color {
//     RED(10), GREEN(20), BLUE();
//
//     private int color;
//
//     private Color() {
//         System.out.println("无参数的构造方法");
//     }
//
//     Color(int color) {
//         this.color = color;
//         System.out.println("有参数的构造方法");
//     }
// }

public enum Color implements Info {
    RED(10) {
        @Override
        public String getColor2() {
            return "红色";
        }
    }, GREEN(20) {
        @Override
        public String getColor2() {
            return "绿色";
        }
    }, BLUE {
        @Override
        public String getColor2() {
            return "蓝色";
        }
    };

    private int color;

    private Color() {
        System.out.println("无参数的构造方法");
    }

    Color(int color) {
        this.color = color;
        System.out.println("有参数的构造方法");
    }

    @Override
    public int getColor() {
        return color;
    }

    public abstract String getColor2();
}
