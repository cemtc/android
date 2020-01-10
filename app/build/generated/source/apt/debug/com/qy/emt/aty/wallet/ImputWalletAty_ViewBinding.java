// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ImputWalletAty_ViewBinding implements Unbinder {
  private ImputWalletAty target;

  private View view2131296848;

  private View view2131296846;

  private View view2131296847;

  @UiThread
  public ImputWalletAty_ViewBinding(ImputWalletAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ImputWalletAty_ViewBinding(final ImputWalletAty target, View source) {
    this.target = target;

    View view;
    target.addWalletNew = Utils.findRequiredViewAsType(source, R.id.add_wallet_new, "field 'addWalletNew'", NavigationLucencyLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_input_wallet_new, "method 'onClick'");
    view2131296848 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_input_wallet_input, "method 'onClick'");
    view2131296846 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_input_wallet_input2, "method 'onClick'");
    view2131296847 = view;
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
    ImputWalletAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.addWalletNew = null;

    view2131296848.setOnClickListener(null);
    view2131296848 = null;
    view2131296846.setOnClickListener(null);
    view2131296846 = null;
    view2131296847.setOnClickListener(null);
    view2131296847 = null;
  }
}
