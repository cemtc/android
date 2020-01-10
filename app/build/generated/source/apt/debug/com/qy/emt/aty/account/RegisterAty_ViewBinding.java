// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.account;

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

public class RegisterAty_ViewBinding implements Unbinder {
  private RegisterAty target;

  private View view2131296523;

  private View view2131296524;

  private View view2131296877;

  @UiThread
  public RegisterAty_ViewBinding(RegisterAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisterAty_ViewBinding(final RegisterAty target, View source) {
    this.target = target;

    View view;
    target.nllRegister = Utils.findRequiredViewAsType(source, R.id.nll_register, "field 'nllRegister'", NavigationLucencyLayout.class);
    target.etRegisterPow1 = Utils.findRequiredViewAsType(source, R.id.et_register_pow1, "field 'etRegisterPow1'", EditText.class);
    target.etRegisterPow2 = Utils.findRequiredViewAsType(source, R.id.et_register_pow2, "field 'etRegisterPow2'", EditText.class);
    view = Utils.findRequiredView(source, R.id.iv_register_show1, "field 'ivRegisterShow1' and method 'onClick'");
    target.ivRegisterShow1 = Utils.castView(view, R.id.iv_register_show1, "field 'ivRegisterShow1'", ImageView.class);
    view2131296523 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_register_show2, "field 'ivRegisterShow2' and method 'onClick'");
    target.ivRegisterShow2 = Utils.castView(view, R.id.iv_register_show2, "field 'ivRegisterShow2'", ImageView.class);
    view2131296524 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_register, "method 'onClick'");
    view2131296877 = view;
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
    RegisterAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllRegister = null;
    target.etRegisterPow1 = null;
    target.etRegisterPow2 = null;
    target.ivRegisterShow1 = null;
    target.ivRegisterShow2 = null;

    view2131296523.setOnClickListener(null);
    view2131296523 = null;
    view2131296524.setOnClickListener(null);
    view2131296524 = null;
    view2131296877.setOnClickListener(null);
    view2131296877 = null;
  }
}
