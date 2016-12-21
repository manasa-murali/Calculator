package mvp.model.model;


/**
 * Created by manasa-pt1119 on 20/12/16.
 */
    public class CalcModel implements IntCalcModel{


        public double add(double op1,double op2)
        {
            return op1+op2;
        }

        public double sub(double op1,double op2)
        {
            return op1-op2;
        }

        public double mul(double op1,double op2)
        {
            return op1*op2;

        }
         public double div(double op1,double op2)
        {
            return op1/op2;
        }

    }

