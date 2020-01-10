// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CreateWalletAty_ViewBinding implements Unbinder {
  private CreateWalletAty target;

  private View view2131296510;

  private View view2131296407;

  @UiThread
  public CreateWalletAty_ViewBinding(CreateWalletAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CreateWalletAty_ViewBinding(final CreateWalletAty target, View source) {
    this.target = target;

    View view;
    target.nll_wallet_market = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nll_wallet_market'", NavigationLucencyLayout.class);
    target.wallet_name_id = Utils.findRequiredViewAsType(source, R.id.wallet_name_id, "field 'wallet_name_id'", EditText.class);
    target.wallet_password_id = Utils.findRequiredViewAsType(source, R.id.wallet_password_id, "field 'wallet_password_id'", EditText.class);
    target.wallet_conf_password_id = Utils.findRequiredViewAsType(source, R.id.wallet_conf_password_id, "field 'wallet_conf_password_id'", EditText.class);
    view = Utils.findRequiredView(source, R.id.is_show_pass_id, "field 'is_show_pass_id' and method 'onClick'");
    target.is_show_pass_id = Utils.castView(view, R.id.is_show_pass_id, "field 'is_show_pass_id'", ImageView.class);
    view2131296510 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.create_wallet_buttom_id, "field 'create_wallet_buttom_id' and method 'onClick'");
    target.create_wallet_buttom_id = Utils.castView(view, R.id.create_wallet_buttom_id, "field 'create_wallet_buttom_id'", Button.class);
    view2131296407 = view;
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
    CreateWalletAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nll_wallet_market = null;
    target.wallet_name_id = null;
    target.wallet_password_id = null;
    target.wallet_conf_password_id = null;
    target.is_show_pass_id = null;
    target.create_wallet_buttom_id = null;

    view2131296510.setOnClickListener(null);
    view2131296510 = null;
    view2131296407.setOnClickListener(null);
    view2131296407 = null;
  }
}
