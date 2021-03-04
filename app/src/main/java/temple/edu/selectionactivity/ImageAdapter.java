package temple.edu.selectionactivity;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

  public class ImageAdapter extends BaseAdapter {
       Context context;
       private  String[] cityName;
       private int[] cityCode;

    //Constructor for this class to initialize fields

    public ImageAdapter(Context context,String[] cityName,int[] cityCode ) {
        this.context = context;
        this.cityName = cityName;
        this.cityCode = cityCode;
    }
    @Override
    public int getCount() {
        return cityName.length;
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
}
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout linearLayout;
        TextView textView;

        if (convertView == null){
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);

            textView = new TextView(context);
            textView.setGravity(Gravity.CENTER);

            linearLayout.addView(textView);
        }else{
            linearLayout = (LinearLayout) convertView;
            textView = (TextView) linearLayout.getChildAt(0);
        }
        //textView.setText(cityName.get(position));
        textView.setTextSize(20);
        textView.setPadding(8, 8, 0, 8);

        return linearLayout;
    }

      @Override
      public View getDropDownView(int position, View convertView, ViewGroup parent){
          //LinearLayout layout = (LinearLayout) getView(position, convertView, parent);

          //return layout;
          LinearLayout linearLayout;
          TextView textView;
          ImageView imageView;

          if(convertView == null){
              linearLayout = new LinearLayout(context);
              textView = new TextView(context);
              imageView = new ImageView(context);

              linearLayout.setOrientation(LinearLayout.HORIZONTAL);
              textView.setTextSize(22);
              textView.setPadding(8,8,0,8);

              linearLayout.addView(imageView);
              linearLayout.addView(textView);

              imageView.getLayoutParams().height = 150;
              imageView.getLayoutParams().width = 150;

          }else{
              linearLayout = (LinearLayout) convertView;
              imageView = (ImageView) linearLayout.getChildAt(0);
              textView = (TextView) linearLayout.getChildAt(1);
          }
          //textView.setText(cityName.get(position));
          imageView.setImageResource(cityCode[position]);
          return linearLayout;
      }
  }

