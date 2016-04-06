package ba.vanjapetrovic.portfolio.app.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

/**
 * Created by vanja on 05/04/16.
 */
public class showAlert {

    public showAlert(Context ct, String title, String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(ct).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
