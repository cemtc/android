// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.my;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CreBtcAty_ViewBinding implements Unbinder {
  private CreBtcAty target;

  @UiThread
  public CreBtcAty_ViewBinding(CreBtcAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CreBtcAty_ViewBinding(CreBtcAty target, View source) {
    this.target = target;

    target.tv_crebtc_name = Utils.findRequiredViewAsType(source, R.id.tv_crebtc_name, "field 'tv_crebtc_name'", TextView.class);
    target.btn_crebtc_start = Utils.findRequiredViewAsType(source, R.id.btn_crebtc_start, "field 'btn_crebtc_start'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreBtcAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_crebtc_name = null;
    target.btn_crebtc_start = null;
  }
}
