// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangePassAty_ViewBinding implements Unbinder {
  private ChangePassAty target;

  private View view2131296825;

  private View view2131296824;

  @UiThread
  public ChangePassAty_ViewBinding(ChangePassAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangePassAty_ViewBinding(final ChangePassAty target, View source) {
    this.target = target;

    View view;
    target.nll_wallet_market = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nll_wallet_market'", NavigationLucencyLayout.class);
    target.old_trade_pass = Utils.findRequiredViewAsType(source, R.id.old_trade_pass, "field 'old_trade_pass'", EditText.class);
    target.new_trade_pass = Utils.findRequiredViewAsType(source, R.id.new_trade_pass, "field 'new_trade_pass'", EditText.class);
    target.conf_trade_pass = Utils.findRequiredViewAsType(source, R.id.conf_trade_pass, "field 'conf_trade_pass'", EditText.class);
    view = Utils.findRequiredView(source, R.id.trade_i1, "field 'trade_i1' and method 'onClick'");
    target.trade_i1 = Utils.castView(view, R.id.trade_i1, "field 'trade_i1'", ImageView.class);
    view2131296825 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.trade_edit, "method 'onClick'");
    view2131296824 = view;
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
    ChangePassAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nll_wallet_market = null;
    target.old_trade_pass = null;
    target.new_trade_pass = null;
    target.conf_trade_pass = null;
    target.trade_i1 = null;

    view2131296825.setOnClickListener(null);
    view2131296825 = null;
    view2131296824.setOnClickListener(null);
    view2131296824 = null;
  }
}
