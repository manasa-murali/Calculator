package mvp.model;

import mvp.model.model.IntCalcModel;
import mvp.model.presenter.CalcPresenter;
import mvp.model.view.IntCalcView;
import mvp.model.model.CalcModel;
/**
 * Created by manasa-pt1119 on 20/12/16.
 */

public class PresenterWorker {

   private static CalcModel calc;
    private static PresenterWorker inst;
    private static CalcPresenter presenter;

    private PresenterWorker(){}

    public static PresenterWorker getInstance()
    {
        if(inst==null)
        {
            inst=new PresenterWorker();
        }

            return inst;

    }

    public void initCalcPresenter(IntCalcView view)
    {
        calc=new CalcModel();
        presenter=new CalcPresenter(view,calc);

    }



}
