// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.my;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangePasswordAty_ViewBinding implements Unbinder {
  private ChangePasswordAty target;

  private View view2131296517;

  private View view2131296579;

  private View view2131296591;

  private View view2131296825;

  private View view2131296828;

  private View view2131296580;

  private View view2131296824;

  @UiThread
  public ChangePasswordAty_ViewBinding(ChangePasswordAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangePasswordAty_ViewBinding(final ChangePasswordAty target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.iv_arrows_lift, "field 'iv_arrows_lift' and method 'onClick'");
    target.iv_arrows_lift = Utils.castView(view, R.id.iv_arrows_lift, "field 'iv_arrows_lift'", ImageView.class);
    view2131296517 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.switch_id = Utils.findRequiredViewAsType(source, R.id.switch_id, "field 'switch_id'", Switch.class);
    target.login_pass_change = Utils.findRequiredViewAsType(source, R.id.login_pass_change, "field 'login_pass_change'", LinearLayout.class);
    target.trade_pass_id = Utils.findRequiredViewAsType(source, R.id.trade_pass_id, "field 'trade_pass_id'", LinearLayout.class);
    target.old_login_pass = Utils.findRequiredViewAsType(source, R.id.old_login_pass, "field 'old_login_pass'", EditText.class);
    target.newe_login_pass = Utils.findRequiredViewAsType(source, R.id.newe_login_pass, "field 'newe_login_pass'", EditText.class);
    target.conf_login_pass = Utils.findRequiredViewAsType(source, R.id.conf_login_pass, "field 'conf_login_pass'", EditText.class);
    target.old_trade_pass = Utils.findRequiredViewAsType(source, R.id.old_trade_pass, "field 'old_trade_pass'", EditText.class);
    target.new_trade_pass = Utils.findRequiredViewAsType(source, R.id.new_trade_pass, "field 'new_trade_pass'", EditText.class);
    target.conf_trade_pass = Utils.findRequiredViewAsType(source, R.id.conf_trade_pass, "field 'conf_trade_pass'", EditText.class);
    view = Utils.findRequiredView(source, R.id.login_cshow_1, "field 'login_cshow_1' and method 'onClick'");
    target.login_cshow_1 = Utils.castView(view, R.id.login_cshow_1, "field 'login_cshow_1'", ImageView.class);
    view2131296579 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.login_show_2, "field 'login_show_2' and method 'onClick'");
    target.login_show_2 = Utils.castView(view, R.id.login_show_2, "field 'login_show_2'", ImageView.class);
    view2131296591 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.trade_i1, "field 'trade_i1' and method 'onClick'");
    target.trade_i1 = Utils.castView(view, R.id.trade_i1, "field 'trade_i1'", ImageView.class);
    view2131296825 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.trade_q2, "field 'trade_q2' and method 'onClick'");
    target.trade_q2 = Utils.castView(view, R.id.trade_q2, "field 'trade_q2'", ImageView.class);
    view2131296828 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.login_edit, "method 'onClick'");
    view2131296580 = view;
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
    ChangePasswordAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.iv_arrows_lift = null;
    target.switch_id = null;
    target.login_pass_change = null;
    target.trade_pass_id = null;
    target.old_login_pass = null;
    target.newe_login_pass = null;
    target.conf_login_pass = null;
    target.old_trade_pass = null;
    target.new_trade_pass = null;
    target.conf_trade_pass = null;
    target.login_cshow_1 = null;
    target.login_show_2 = null;
    target.trade_i1 = null;
    target.trade_q2 = null;

    view2131296517.setOnClickListener(null);
    view2131296517 = null;
    view2131296579.setOnClickListener(null);
    view2131296579 = null;
    view2131296591.setOnClickListener(null);
    view2131296591 = null;
    view2131296825.setOnClickListener(null);
    view2131296825 = null;
    view2131296828.setOnClickListener(null);
    view2131296828 = null;
    view2131296580.setOnClickListener(null);
    view2131296580 = null;
    view2131296824.setOnClickListener(null);
    view2131296824 = null;
  }
}
