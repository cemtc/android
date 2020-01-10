// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyCodeAty_ViewBinding implements Unbinder {
  private MyCodeAty target;

  @UiThread
  public MyCodeAty_ViewBinding(MyCodeAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyCodeAty_ViewBinding(MyCodeAty target, View source) {
    this.target = target;

    target.nllSecondButton = Utils.findRequiredViewAsType(source, R.id.nll_second_button, "field 'nllSecondButton'", NavigationLucencyLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyCodeAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllSecondButton = null;
  }
}
