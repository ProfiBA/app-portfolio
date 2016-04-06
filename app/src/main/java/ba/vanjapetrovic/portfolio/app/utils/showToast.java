package ba.vanjapetrovic.portfolio.app.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by vanja on 05/04/16.
 */
public class showToast {

    public showToast(Context ct, String message) {
        Toast.makeText(ct, message, Toast.LENGTH_SHORT).show();
    }
}
