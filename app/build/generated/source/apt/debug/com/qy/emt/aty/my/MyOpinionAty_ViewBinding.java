// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.my;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyOpinionAty_ViewBinding implements Unbinder {
  private MyOpinionAty target;

  @UiThread
  public MyOpinionAty_ViewBinding(MyOpinionAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyOpinionAty_ViewBinding(MyOpinionAty target, View source) {
    this.target = target;

    target.nvMyOpinion = Utils.findRequiredViewAsType(source, R.id.nv_my_opinion, "field 'nvMyOpinion'", NavigationLucencyLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyOpinionAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nvMyOpinion = null;
  }
}
