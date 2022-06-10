package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Calculator {

    @FXML
    private TextArea LCD;

    @FXML
    private Button bt_0;

    @FXML
    private Button bt_1;

    @FXML
    private Button bt_11;

    @FXML
    private Button bt_2;

    @FXML
    private Button bt_3;

    @FXML
    private Button bt_4;

    @FXML
    private Button bt_41;

    @FXML
    private Button bt_5;

    @FXML
    private Button bt_6;

    @FXML
    private Button bt_7;

    @FXML
    private Button bt_8;

    @FXML
    private Button bt_9;

    @FXML
    private Button bt_Left_scobe;

    @FXML
    private Button bt_Right_scobe;

    @FXML
    private Button bt_del;

    @FXML
    private Button bt_div;

    @FXML
    private Button bt_dot;

    @FXML
    private Button bt_dot1;

    @FXML
    private Button bt_equals;

    @FXML
    private Button bt_factorial;

    @FXML
    private Button bt_minus;

    @FXML
    private Button bt_mul;

    @FXML
    private Button bt_plus;

    @FXML
    private Button bt_pow;

    @FXML
    private Button bt_reset;


    int zero=1;
    int dot =1;
    int scobe=0;
    //0-низя
    //1-1 можно
    //2-можно много

    @FXML
    void initialize(){




        bt_reset.setOnAction(event ->{

            zero=1;

            dot=1;


                LCD.setText("");

        });


        bt_0.setOnAction(event ->{
            String text=LCD.getText() ;



            if(zero==0){}
            else if(zero==1){
                if (text!=""&&(text.charAt(text.length() - 1) ==')')){ String tmp="";

                    LCD.setText(text+"*0");}else
                LCD.setText(LCD.getText()+"0");


                zero=0;
                if(dot>0)dot++;
            }else {
                if (text != "" && (text.charAt(text.length() - 1) == ')')) {
                    String tmp = "";

                    LCD.setText(text + "*0");
                }else
                LCD.setText(LCD.getText() + "0");
            }








        });

        bt_1.setOnAction(event ->{
            String text=LCD.getText() ;
            if(zero==0){
                String tmp="";
                for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                text=tmp;
            }

            zero=2;
            if(dot>0)dot++;

            if (text!=""&&(text.charAt(text.length() - 1) ==')')){ String tmp="";

                LCD.setText(text+"*1");}else{

                LCD.setText(text + "1");}

        });


        bt_2.setOnAction(event ->{
            String text=LCD.getText() ;
            if(zero==0){
                String tmp="";
                for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                text=tmp;
            }

            zero=2;
            if(dot>0)dot++;

            if (text!=""&&(text.charAt(text.length() - 1) ==')')){ String tmp="";

                LCD.setText(text+"*2");}else
            LCD.setText(text + "2");

        });


        bt_3.setOnAction(event ->{
            String text=LCD.getText() ;
            if(zero==0){
                String tmp="";
                for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                text=tmp;
            }

            zero=2;
            if(dot>0)dot++;

            if (text!=""&&(text.charAt(text.length() - 1) ==')')){ String tmp="";

                LCD.setText(text+"*3");}else
            LCD.setText(text + "3");

        });


        bt_4.setOnAction(event ->{
            String text=LCD.getText() ;
            if(zero==0){
                String tmp="";
                for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                text=tmp;
            }

            zero=2;
            if(dot>0)dot++;

            if (text!=""&&(text.charAt(text.length() - 1) ==')')){ String tmp="";

                LCD.setText(text+"*4");}else
            LCD.setText(text + "4");

        });


        bt_5.setOnAction(event ->{
            String text=LCD.getText() ;
            if(zero==0){
                String tmp="";
                for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                text=tmp;
            }

            zero=2;
            if(dot>0)dot++;

            if (text!=""&&(text.charAt(text.length() - 1) ==')')){ String tmp="";

                LCD.setText(text+"*5");}else
            LCD.setText(text + "5");

        });


        bt_6.setOnAction(event ->{
            String text=LCD.getText() ;
            if(zero==0){
                String tmp="";
                for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                text=tmp;
            }

            zero=2;
            if(dot>0)dot++;

            if (text!=""&&(text.charAt(text.length() - 1) ==')')){ String tmp="";

                LCD.setText(text+"*6");}else
            LCD.setText(text + "6");

        });


        bt_7.setOnAction(event ->{
            String text=LCD.getText() ;
            if(zero==0){
                String tmp="";
                for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                text=tmp;
            }

            zero=2;
            if(dot>0)dot++;

            if (text!=""&&(text.charAt(text.length() - 1) ==')')){ String tmp="";

                LCD.setText(text+"*7");}else
            LCD.setText(text + "7");

        });


        bt_8.setOnAction(event ->{
            String text=LCD.getText() ;
            if(zero==0){
                String tmp="";
                for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                text=tmp;
            }

            zero=2;
            if(dot>0)dot++;

            if (text!=""&&(text.charAt(text.length() - 1) ==')')){ String tmp="";

                LCD.setText(text+"*8");}else
            LCD.setText(text + "8");

        });


        bt_9.setOnAction(event ->{
            String text=LCD.getText() ;
            if(zero==0){
                String tmp="";
                for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                text=tmp;
            }

            zero=2;
            if(dot>0)dot++;

            if (text!=""&&(text.charAt(text.length() - 1) ==')')){ String tmp="";

                LCD.setText(text+"*9");}else
            LCD.setText(text + "9");

        });

//--------------------------
        bt_dot.setOnAction(event ->{


            String text=LCD.getText() ;

            if (text==""||(text.charAt(text.length() - 1) >'9'||text.charAt(text.length() - 1) <'0')){}
            else{
                if(zero==0&&dot>1){ LCD.setText(LCD.getText()+"."); zero=2;dot=0;}
                else  if(dot>1){ LCD.setText(LCD.getText()+"."); dot=0;}



            }



        });


        bt_div.setOnAction(event ->{

            zero=1;

            dot=1;


            String text=LCD.getText() ;

            if (text.equals("") ||(text.charAt(text.length() - 1) >'9'||text.charAt(text.length() - 1) <'0')){}
                else
            LCD.setText(LCD.getText()+"/");

        });


        bt_pow.setOnAction(event ->{
            zero=1;
            dot=1;
            String text=LCD.getText() ;

            if (text==""||(text.charAt(text.length() - 1) >'9'||text.charAt(text.length() - 1) <'0')){}
            else
            LCD.setText(LCD.getText()+"^");

        });


        bt_plus.setOnAction(event ->{
            zero=1;
            dot=1;

            String text=LCD.getText() ;

            if (text==""||(text.charAt(text.length() - 1) >'9'||text.charAt(text.length() - 1) <'0')){}
            else {
                text=text+"+";

                LCD.setText(text);

            }
        });


        bt_Left_scobe.setOnAction(event ->{
            zero=1;
            dot=1;
            scobe++;
            String text=LCD.getText() ;
            if (text!=""&&(text.charAt(text.length() - 1) =='.' )){

                    String tmp="";
                    for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                    text=tmp;
                LCD.setText(text+"*(");


            }if (text!=""&&((text.charAt(text.length() - 1) >='0'&&text.charAt(text.length() - 1) <='9') )){


                LCD.setText(text+"*(");


            }
            else
            LCD.setText(text+"(");

        });


        bt_Right_scobe.setOnAction(event ->{
            zero=1;dot=1;

            String text=LCD.getText() ;
            if (text!=""&&(text.charAt(text.length() - 1) =='(')){ String tmp="";
                for(int i=0;i<text.length()-1d;i++){tmp+=text.charAt(i);}
                text=tmp;
                LCD.setText(text);scobe--;}
            else
                if(scobe>0){
            LCD.setText(LCD.getText()+")");
            scobe--;}
        });



        bt_mul.setOnAction(event ->{
            zero=1;dot=1;
            String text=LCD.getText() ;

            if (text==""||(text.charAt(text.length() - 1) >'9'||text.charAt(text.length() - 1) <'0')){}
            else

            LCD.setText(LCD.getText()+"*");

        });


        bt_minus.setOnAction(event ->{
            zero=1;dot=1;

            String text=LCD.getText() ;

            if (text==""||(text.charAt(text.length() - 1) >'9'||text.charAt(text.length() - 1) <'0')){}
            else

            LCD.setText(LCD.getText()+"-");

        });




        bt_equals.setOnAction(event ->{

            String text=LCD.getText() ;

            for(int p=0;p<2;p++)
            if (text!=""&&((text.charAt(text.length() - 1) >'9'||text.charAt(text.length() - 1) <'0'))&&(text.charAt(text.length() - 1) !=')')){
                String tmp="";
                for(int i=0;i<text.length()-1;i++){tmp+=text.charAt(i);}
                text=tmp;
                LCD.setText(text);

            }

            int r=text.length();
            for(int i=text.length()-1;i>=0;i--){
                if(text.charAt(i)!='.'&&(text.charAt(i)>='0'&&text.charAt(i)<='9')){
                    dot=2;}
                if(text.charAt(i)!='.'&&(text.charAt(i)<'0'||text.charAt(i)>'9')){dot++;break;}
                if(text.charAt(i)=='.'){dot=0;break;}
            }






            String ans ="";
            ans = calc(text);

            LCD.setText(ans);



        });


}

    private String calc(String text) {
        String answer="";
        String[] opertation ={"*","/","^","^","+","-"};

        double num1=0,num2=0;

        int sc_col=0;

        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='(')sc_col++;}

        String text_X=text;
while(sc_col!=0) {
    int sc1 = 0, sc2 = text.length() - 1;

    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == '(') sc1 = i;
        if (text.charAt(i) == ')') {
            sc2 = i+1;
            break;
    }   }

String tmptxt="";
for(int i=sc1+1;i<sc2-1;i++){
    tmptxt+=text.charAt(i);
}


    String temp="";
    for(int a=0;a<sc1;a++){
        temp+=text.charAt(a);}
    temp=temp+calc(tmptxt);
    for(int a=sc2;a<text.length();a++){
        temp+=text.charAt(a);}
    text=temp;
    sc_col--;


}
        int op_col=0;

        for(int i=0;i<text.length();i++){
            for(int j=0;j<opertation.length;j++){
                if(text.charAt(i)==opertation[j].charAt(0)){op_col++;}
            }
        }

        String t1="",t2="";
        while (op_col!=0){

            for(int j=0;j<opertation.length;j=j+2){
if(op_col<=0)break;
                for(int i=0;i<text.length();i++){
                    if(op_col<=0)break;
                    if((text.charAt(i)==opertation[j].charAt(0))||(text.charAt(i)==opertation[j+1].charAt(0))){
                        int q2=i+1;
                        t1="";t2="";
                        while((text.charAt(q2)>='0' &&'9'>=text.charAt(q2))||text.charAt(q2)=='.'||text.charAt(q2)=='-') {
                            t2 = t2 + text.charAt(q2);
                            q2++;
                            if(q2>text.length()-1){

                                break;}
                        }
                        int q1=i-1;

                        int a1=0;
                        while(((text.charAt(q1)>='0' &&'9'>=text.charAt(q1))||text.charAt(q1)=='.'|| text.charAt(q1)=='-')){
                            t1=text.charAt(q1)+t1;
                            q1--;
                            if(q1<0){
                                q1++;a1++;
                                break;}
                        }
                        if(a1==0)q1++;

                        double result=0;
                    //  if()

                        num1 = Double.parseDouble(t1);
                        num2 = Double.parseDouble(t2);
                        if(num1<0){op_col=op_col-1;j=opertation.length;}
                        if(num2<0){op_col=op_col-1;j=opertation.length;}

                        switch (text.charAt(i)) //И производим над ними действие, согласно оператору
                        {
                            case '+':
                                result = num1 + num2;
                                break;
                            case '-':
                                result = num1 - num2;
                                break;
                            case '*':
                                result = num1 * num2;
                                break;
                            case '/':
                                result = num1 / num2;
                                break;
                            case '^':
                                result = Math.pow(num1 , num2);
                                break;
                        }

                        String temp="";
                        for(int a=0;a<q1;a++){
                            temp+=text.charAt(a);}
                        temp=temp+String.valueOf(result);
                        for(int a=q2;a<text.length();a++){
                            temp+=text.charAt(a);}

                        text=temp;
                        break;

                    }


                }
            }


            op_col--;
        }
answer=text;


        return answer;
    }


}
