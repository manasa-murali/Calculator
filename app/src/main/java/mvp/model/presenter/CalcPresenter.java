package mvp.model.presenter;

import mvp.model.model.IntCalcModel;
import mvp.model.view.IntCalcView;
import mvp.model.model.CalcModel;

/**
 * Created by manasa-pt1119 on 20/12/16.
 */

public class CalcPresenter implements IntCalcView.IntComputeListener {

    IntCalcView ui;
    IntCalcModel model;

    double result;
    public CalcPresenter(IntCalcView ui,IntCalcModel model)
    {
        this.ui=ui;
        this.model=model;

        initListener();
    }
    public void initListener()
    {
        ui.subs(this);
    }


    public void doAdd()
    {
        result=model.add(ui.getOp1(),ui.getOp2());
        ui.updatedisplay(result);


    }
   public void doSub()
    {
        result=model.sub(ui.getOp1(),ui.getOp2());
        ui.updatedisplay(result);


    }
    public void doMul()
    {
        result=model.mul(ui.getOp1(),ui.getOp2());
        ui.updatedisplay(result);


    }
    public void doDiv()
    {
        result=model.div(ui.getOp1(),ui.getOp2());
        ui.updatedisplay(result);


    }



}
