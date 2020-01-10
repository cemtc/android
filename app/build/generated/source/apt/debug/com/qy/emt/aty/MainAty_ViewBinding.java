// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainAty_ViewBinding implements Unbinder {
  private MainAty target;

  @UiThread
  public MainAty_ViewBinding(MainAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainAty_ViewBinding(MainAty target, View source) {
    this.target = target;

    target.bnvMain = Utils.findRequiredViewAsType(source, R.id.bnv_main, "field 'bnvMain'", BottomNavigationView.class);
    target.drawer = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawer'", DrawerLayout.class);
    target.mainFrame = Utils.findRequiredViewAsType(source, R.id.main_frame, "field 'mainFrame'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.bnvMain = null;
    target.drawer = null;
    target.mainFrame = null;
  }
}
