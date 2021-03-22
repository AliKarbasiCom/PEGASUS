package ir.pegasus.app.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_peghome{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[PegHome/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="pegasusLogo.HorizontalCenter = 50%x"[PegHome/General script]
views.get("pegasuslogo").vw.setLeft((int)((50d / 100 * width) - (views.get("pegasuslogo").vw.getWidth() / 2)));
//BA.debugLineNum = 5;BA.debugLine="pegasusLogo.Top = 0%y"[PegHome/General script]
views.get("pegasuslogo").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 7;BA.debugLine="pegasusSaveKey.Left = 0%x"[PegHome/General script]
views.get("pegasussavekey").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 8;BA.debugLine="pegasusSaveKey.top = 0%y"[PegHome/General script]
views.get("pegasussavekey").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 10;BA.debugLine="pegasusLable.SetLeftAndRight(0%x,100%x)"[PegHome/General script]
views.get("pegasuslable").vw.setLeft((int)((0d / 100 * width)));
views.get("pegasuslable").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 11;BA.debugLine="pegasusLable.Top = pegasusLogo.Bottom"[PegHome/General script]
views.get("pegasuslable").vw.setTop((int)((views.get("pegasuslogo").vw.getTop() + views.get("pegasuslogo").vw.getHeight())));
//BA.debugLineNum = 13;BA.debugLine="pegasusEncrypt.SetLeftAndRight(5%x,48%x)"[PegHome/General script]
views.get("pegasusencrypt").vw.setLeft((int)((5d / 100 * width)));
views.get("pegasusencrypt").vw.setWidth((int)((48d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 14;BA.debugLine="pegasusEncrypt.Bottom = 97%y"[PegHome/General script]
views.get("pegasusencrypt").vw.setTop((int)((97d / 100 * height) - (views.get("pegasusencrypt").vw.getHeight())));
//BA.debugLineNum = 16;BA.debugLine="pegasusDecrypt.SetLeftAndRight(52%x,95%x)"[PegHome/General script]
views.get("pegasusdecrypt").vw.setLeft((int)((52d / 100 * width)));
views.get("pegasusdecrypt").vw.setWidth((int)((95d / 100 * width) - ((52d / 100 * width))));
//BA.debugLineNum = 17;BA.debugLine="pegasusDecrypt.Bottom = 97%y"[PegHome/General script]
views.get("pegasusdecrypt").vw.setTop((int)((97d / 100 * height) - (views.get("pegasusdecrypt").vw.getHeight())));
//BA.debugLineNum = 19;BA.debugLine="pegasusTextEditor.SetLeftAndRight(5%x,95%x)"[PegHome/General script]
views.get("pegasustexteditor").vw.setLeft((int)((5d / 100 * width)));
views.get("pegasustexteditor").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 20;BA.debugLine="pegasusTextEditor.SetTopAndBottom(pegasusLable.Bottom+5dip,100%y-pegasusEncrypt.Height-4%y)"[PegHome/General script]
views.get("pegasustexteditor").vw.setTop((int)((views.get("pegasuslable").vw.getTop() + views.get("pegasuslable").vw.getHeight())+(5d * scale)));
views.get("pegasustexteditor").vw.setHeight((int)((100d / 100 * height)-(views.get("pegasusencrypt").vw.getHeight())-(4d / 100 * height) - ((views.get("pegasuslable").vw.getTop() + views.get("pegasuslable").vw.getHeight())+(5d * scale))));

}
}