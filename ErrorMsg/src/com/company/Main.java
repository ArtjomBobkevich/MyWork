package com.company;

class ErrorMsg {
    String msgs[]={
            "Ошибки вывода",
            "Ошибки ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапозона"
    };
    String getErrorMsg(int i){
        if(i>=0 & i<msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }
}

class ErrMsg {
    public static void main(String[] args) {
	ErrorMsg err= new ErrorMsg();
	System.out.println(err.getErrorMsg(2));
	System.out.println(err.getErrorMsg(0));
        System.out.println(err.getErrorMsg(19));
    }
}
