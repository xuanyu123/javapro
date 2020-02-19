package com.neuedu.Set;

/**
 * @author xuanyu
 * @date 2020-02-19 9:56 下午
 */
public class GenericInterfaceTest1 {
    public static void main(String[] args) {
        GenericInterfaceImpl genericInterface = new GenericInterfaceImpl();
        genericInterface.methd01("nihao");

        GenericInterfaceImpl2<Integer> igf = new GenericInterfaceImpl2<>();
        igf.methd01(1);

        GenericInterfaceImpl2<Double> dgf = new GenericInterfaceImpl2<>();
        dgf.methd01(9.0);
    }
}
