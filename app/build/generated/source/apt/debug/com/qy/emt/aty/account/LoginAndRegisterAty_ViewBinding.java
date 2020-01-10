// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.account;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginAndRegisterAty_ViewBinding implements Unbinder {
  private LoginAndRegisterAty target;

  private View view2131296607;

  private View view2131296511;

  private View view2131296592;

  private View view2131296713;

  private View view2131296662;

  private View view2131296400;

  private View view2131296692;

  private View view2131296758;

  private View view2131296663;

  private View view2131296693;

  private View view2131296694;

  private View view2131296467;

  @UiThread
  public LoginAndRegisterAty_ViewBinding(LoginAndRegisterAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginAndRegisterAty_ViewBinding(final LoginAndRegisterAty target, View source) {
    this.target = target;

    View view;
    target.loginModule = Utils.findRequiredViewAsType(source, R.id.login_module, "field 'loginModule'", TextView.class);
    view = Utils.findRequiredView(source, R.id.module_register_module, "field 'moduleRegisterModule' and method 'onClick'");
    target.moduleRegisterModule = Utils.castView(view, R.id.module_register_module, "field 'moduleRegisterModule'", TextView.class);
    view2131296607 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.loginImgS = Utils.findRequiredViewAsType(source, R.id.login_img_s, "field 'loginImgS'", ImageView.class);
    target.registerImgS = Utils.findRequiredViewAsType(source, R.id.register_imgs, "field 'registerImgS'", ImageView.class);
    target.loginMobileNumber = Utils.findRequiredViewAsType(source, R.id.login_mobile_number, "field 'loginMobileNumber'", EditText.class);
    target.loginPassId = Utils.findRequiredViewAsType(source, R.id.login_pass_id, "field 'loginPassId'", EditText.class);
    view = Utils.findRequiredView(source, R.id.is_show_password, "field 'isShowPassword' and method 'onClick'");
    target.isShowPassword = Utils.castView(view, R.id.is_show_password, "field 'isShowPassword'", ImageView.class);
    view2131296511 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.login_sub_btn, "field 'loginSubBtn' and method 'onClick'");
    target.loginSubBtn = Utils.castView(view, R.id.login_sub_btn, "field 'loginSubBtn'", Button.class);
    view2131296592 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.form_sub_id = Utils.findRequiredViewAsType(source, R.id.form_sub_id, "field 'form_sub_id'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.rl_top_lr_id, "field 'rl_top_lr_id' and method 'onClick'");
    target.rl_top_lr_id = Utils.castView(view, R.id.rl_top_lr_id, "field 'rl_top_lr_id'", RelativeLayout.class);
    view2131296713 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.root_rl_id = Utils.findRequiredViewAsType(source, R.id.root_rl_id, "field 'root_rl_id'", RelativeLayout.class);
    target.loginLrId = Utils.findRequiredViewAsType(source, R.id.login_rl_id, "field 'loginLrId'", RelativeLayout.class);
    target.registerLrId = Utils.findRequiredViewAsType(source, R.id.register_lr_id, "field 'registerLrId'", RelativeLayout.class);
    target.registerMobileId = Utils.findRequiredViewAsType(source, R.id.register_mobile_id, "field 'registerMobileId'", EditText.class);
    target.register_pass_text_id = Utils.findRequiredViewAsType(source, R.id.register_pass_text_id, "field 'register_pass_text_id'", EditText.class);
    view = Utils.findRequiredView(source, R.id.pass_show_id_icon, "field 'pass_show_id_icon' and method 'onClick'");
    target.pass_show_id_icon = Utils.castView(view, R.id.pass_show_id_icon, "field 'pass_show_id_icon'", ImageView.class);
    view2131296662 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.reg_conf_psss_id = Utils.findRequiredViewAsType(source, R.id.reg_conf_psss_id, "field 'reg_conf_psss_id'", EditText.class);
    view = Utils.findRequiredView(source, R.id.confirm_pass_show_id, "field 'confirm_pass_show_id' and method 'onClick'");
    target.confirm_pass_show_id = Utils.castView(view, R.id.confirm_pass_show_id, "field 'confirm_pass_show_id'", ImageView.class);
    view2131296400 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.register_btn_id, "field 'registerBtnId' and method 'onClick'");
    target.registerBtnId = Utils.castView(view, R.id.register_btn_id, "field 'registerBtnId'", Button.class);
    view2131296692 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.register_lr_step2_id = Utils.findRequiredViewAsType(source, R.id.register_lr_step2_id, "field 'register_lr_step2_id'", RelativeLayout.class);
    target.register_lr_step3_id = Utils.findRequiredViewAsType(source, R.id.register_lr_step3_id, "field 'register_lr_step3_id'", RelativeLayout.class);
    target.trade_pass_id = Utils.findRequiredViewAsType(source, R.id.trade_pass_id, "field 'trade_pass_id'", EditText.class);
    view = Utils.findRequiredView(source, R.id.show_trade_pass_icon, "field 'show_trade_pass_icon' and method 'onClick'");
    target.show_trade_pass_icon = Utils.castView(view, R.id.show_trade_pass_icon, "field 'show_trade_pass_icon'", ImageView.class);
    view2131296758 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.register_trade_pass_text_id = Utils.findRequiredViewAsType(source, R.id.register_trade_pass_text_id, "field 'register_trade_pass_text_id'", EditText.class);
    view = Utils.findRequiredView(source, R.id.pass_trade_show_id_icon, "field 'pass_trade_show_id_icon' and method 'onClick'");
    target.pass_trade_show_id_icon = Utils.castView(view, R.id.pass_trade_show_id_icon, "field 'pass_trade_show_id_icon'", ImageView.class);
    view2131296663 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.invite_code = Utils.findRequiredViewAsType(source, R.id.invite_code, "field 'invite_code'", EditText.class);
    target.answer_text = Utils.findRequiredViewAsType(source, R.id.answer_text, "field 'answer_text'", EditText.class);
    target.tv_q8 = Utils.findRequiredViewAsType(source, R.id.tv_q8, "field 'tv_q8'", AppCompatSpinner.class);
    view = Utils.findRequiredView(source, R.id.register_btn_step2_id, "field 'register_btn_step2_id' and method 'onClick'");
    target.register_btn_step2_id = Utils.castView(view, R.id.register_btn_step2_id, "field 'register_btn_step2_id'", Button.class);
    view2131296693 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.register_btn_step2_next_id, "field 'register_btn_step2_next_id' and method 'onClick'");
    target.register_btn_step2_next_id = Utils.castView(view, R.id.register_btn_step2_next_id, "field 'register_btn_step2_next_id'", Button.class);
    view2131296694 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.forget_pass, "method 'onClick'");
    view2131296467 = view;
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
    LoginAndRegisterAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.loginModule = null;
    target.moduleRegisterModule = null;
    target.loginImgS = null;
    target.registerImgS = null;
    target.loginMobileNumber = null;
    target.loginPassId = null;
    target.isShowPassword = null;
    target.loginSubBtn = null;
    target.form_sub_id = null;
    target.rl_top_lr_id = null;
    target.root_rl_id = null;
    target.loginLrId = null;
    target.registerLrId = null;
    target.registerMobileId = null;
    target.register_pass_text_id = null;
    target.pass_show_id_icon = null;
    target.reg_conf_psss_id = null;
    target.confirm_pass_show_id = null;
    target.registerBtnId = null;
    target.register_lr_step2_id = null;
    target.register_lr_step3_id = null;
    target.trade_pass_id = null;
    target.show_trade_pass_icon = null;
    target.register_trade_pass_text_id = null;
    target.pass_trade_show_id_icon = null;
    target.invite_code = null;
    target.answer_text = null;
    target.tv_q8 = null;
    target.register_btn_step2_id = null;
    target.register_btn_step2_next_id = null;

    view2131296607.setOnClickListener(null);
    view2131296607 = null;
    view2131296511.setOnClickListener(null);
    view2131296511 = null;
    view2131296592.setOnClickListener(null);
    view2131296592 = null;
    view2131296713.setOnClickListener(null);
    view2131296713 = null;
    view2131296662.setOnClickListener(null);
    view2131296662 = null;
    view2131296400.setOnClickListener(null);
    view2131296400 = null;
    view2131296692.setOnClickListener(null);
    view2131296692 = null;
    view2131296758.setOnClickListener(null);
    view2131296758 = null;
    view2131296663.setOnClickListener(null);
    view2131296663 = null;
    view2131296693.setOnClickListener(null);
    view2131296693 = null;
    view2131296694.setOnClickListener(null);
    view2131296694 = null;
    view2131296467.setOnClickListener(null);
    view2131296467 = null;
  }
}
