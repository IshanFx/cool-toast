package com.ishanfernando.cooltoast;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CoolToast {


    private static String mMessage;
    private static Context mContext;
    private enum ICON_TYPE{
        warning,
        error,
        success,
        info
    }
    private static ICON_TYPE selectedType;

    private CoolToast(Builder builder){
        setMessage(builder.message);
        createToast();
    }

    public static Builder builder(Context context){
        mContext = context;
        return new Builder();
    }

    public void setMessage(String message){
        this.mMessage = message;
    }

    private static void createToast(){
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.layout_toast,
                null);
        ((TextView)layout.findViewById(R.id.textMessage)).setText(mMessage);

        Integer iconDrawable = null;

        if(selectedType == ICON_TYPE.success){
            iconDrawable = R.drawable.ic_checked;

        }else if(selectedType == ICON_TYPE.error){
            iconDrawable = R.drawable.ic_error;

        }else if(selectedType == ICON_TYPE.warning){
            iconDrawable = R.drawable.ic_warning;

        }else if(selectedType == ICON_TYPE.info){
            iconDrawable = R.drawable.ic_info;
        }

        ((ImageView)layout.findViewById(R.id.imgIcon)).setImageResource(iconDrawable);

        Toast toast = new Toast(mContext);
        toast.setGravity(Gravity.BOTTOM,0,50);
        toast.setView(layout);
        toast.show();
    }

    public static void success(Context context,String message){
        mContext = context;
        mMessage = message;
        selectedType = ICON_TYPE.success;
        createToast();
    }

    public static void warning(Context context,String message){
        mContext = context;
        mMessage = message;
        selectedType = ICON_TYPE.warning;
        createToast();
    }

    public static void error(Context context,String message){
        mContext = context;
        mMessage = message;
        selectedType = ICON_TYPE.error;
        createToast();
    }

    public static void info(Context context,String message){
        mContext = context;
        mMessage = message;
        selectedType = ICON_TYPE.info;
        createToast();
    }

    //Builder class
    public static class Builder {

        private String message;


        public Builder message(String message){
            this.message = message;
            return this;
        }



        public CoolToast show(){
            return new CoolToast(this);
        }
    }
}


