// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WelcomeAty_ViewBinding implements Unbinder {
  private WelcomeAty target;

  private View view2131296912;

  private View view2131296911;

  @UiThread
  public WelcomeAty_ViewBinding(WelcomeAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WelcomeAty_ViewBinding(final WelcomeAty target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tv_welcome_login, "method 'onClick'");
    view2131296912 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_welcome_create, "method 'onClick'");
    view2131296911 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131296912.setOnClickListener(null);
    view2131296912 = null;
    view2131296911.setOnClickListener(null);
    view2131296911 = null;
  }
}
