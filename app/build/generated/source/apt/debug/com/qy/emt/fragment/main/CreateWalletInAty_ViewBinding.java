// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment.main;

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

public class CreateWalletInAty_ViewBinding implements Unbinder {
  private CreateWalletInAty target;

  private View view2131296374;

  private View view2131296453;

  private View view2131296362;

  @UiThread
  public CreateWalletInAty_ViewBinding(CreateWalletInAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CreateWalletInAty_ViewBinding(final CreateWalletInAty target, View source) {
    this.target = target;

    View view;
    target.nll_wallet_market = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nll_wallet_market'", NavigationLucencyLayout.class);
    view = Utils.findRequiredView(source, R.id.ccm_create, "method 'onClick'");
    view2131296374 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.eth_create, "method 'onClick'");
    view2131296453 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btc_create, "method 'onClick'");
    view2131296362 = view;
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
    CreateWalletInAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nll_wallet_market = null;

    view2131296374.setOnClickListener(null);
    view2131296374 = null;
    view2131296453.setOnClickListener(null);
    view2131296453 = null;
    view2131296362.setOnClickListener(null);
    view2131296362 = null;
  }
}
