// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.my;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyAboutAty_ViewBinding implements Unbinder {
  private MyAboutAty target;

  @UiThread
  public MyAboutAty_ViewBinding(MyAboutAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyAboutAty_ViewBinding(MyAboutAty target, View source) {
    this.target = target;

    target.nlMyAbout = Utils.findRequiredViewAsType(source, R.id.nl_my_about, "field 'nlMyAbout'", NavigationLucencyLayout.class);
    target.content_idl = Utils.findRequiredViewAsType(source, R.id.content_id, "field 'content_idl'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyAboutAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nlMyAbout = null;
    target.content_idl = null;
  }
}
