// Generated code from Butter Knife. Do not modify!
package com.qy.emt.view.group;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NavigationLucencyLayout_ViewBinding implements Unbinder {
  private NavigationLucencyLayout target;

  private View view2131296517;

  private View view2131296518;

  private View view2131296519;

  private View view2131296840;

  @UiThread
  public NavigationLucencyLayout_ViewBinding(NavigationLucencyLayout target) {
    this(target, target);
  }

  @UiThread
  public NavigationLucencyLayout_ViewBinding(final NavigationLucencyLayout target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.iv_arrows_lift, "field 'ivArrowsLift' and method 'onClick'");
    target.ivArrowsLift = Utils.castView(view, R.id.iv_arrows_lift, "field 'ivArrowsLift'", ImageView.class);
    view2131296517 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.tvBarTitle = Utils.findRequiredViewAsType(source, R.id.tv_bar_title, "field 'tvBarTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_bar_one, "field 'ivBarOne' and method 'onClick'");
    target.ivBarOne = Utils.castView(view, R.id.iv_bar_one, "field 'ivBarOne'", ImageView.class);
    view2131296518 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_bar_two, "field 'ivBarTwo' and method 'onClick'");
    target.ivBarTwo = Utils.castView(view, R.id.iv_bar_two, "field 'ivBarTwo'", ImageView.class);
    view2131296519 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.llBuyview = Utils.findRequiredViewAsType(source, R.id.ll_buyview, "field 'llBuyview'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_bar_three, "field 'tvBarThree' and method 'onClick'");
    target.tvBarThree = Utils.castView(view, R.id.tv_bar_three, "field 'tvBarThree'", TextView.class);
    view2131296840 = view;
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
    NavigationLucencyLayout target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivArrowsLift = null;
    target.tvBarTitle = null;
    target.ivBarOne = null;
    target.ivBarTwo = null;
    target.llBuyview = null;
    target.tvBarThree = null;

    view2131296517.setOnClickListener(null);
    view2131296517 = null;
    view2131296518.setOnClickListener(null);
    view2131296518 = null;
    view2131296519.setOnClickListener(null);
    view2131296519 = null;
    view2131296840.setOnClickListener(null);
    view2131296840 = null;
  }
}
