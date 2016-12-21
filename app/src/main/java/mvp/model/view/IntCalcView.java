package mvp.model.view;

/**
 * Created by manasa-pt1119 on 20/12/16.
 */

public interface IntCalcView {


    void updatedisplay(double val);
    double getOp1();
    double getOp2();
    void subs(IntComputeListener listener);

    public interface IntComputeListener
    {
        void doAdd();
        void doSub();
        void doMul();
        void doDiv();

    }
}
