package edu.up.dbgui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;


    public class Draw extends SurfaceView {
        private Bitmap dImage;
        private Bitmap scaled = null;

        public Draw(Context context) {
            super(context);
            initialize();
        }

        public Draw(Context context, AttributeSet attrs) {
            super(context, attrs);
            initialize();
        }

        private void initialize() {
            dImage = BitmapFactory.decodeResource(getResources(), R.drawable.db_board);
            setWillNotDraw(false);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if(scaled == null){
            scaled = Bitmap.createScaledBitmap(dImage,this.getWidth(),this.getHeight(),false);
            }
            canvas.drawBitmap(scaled, 0, 0, new Paint());
        }


    }


