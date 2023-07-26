public abstract class c.h.o.p {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.text.TextDirectionHeuristic p0 ) {
		 /* .locals 2 */
		 /* .line 38 */
		 v0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-ne p0, v0, :cond_0 */
		 /* .line 39 */
	 } // :cond_0
	 v0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
	 /* if-ne p0, v0, :cond_1 */
	 /* .line 40 */
} // :cond_1
v0 = android.text.TextDirectionHeuristics.ANYRTL_LTR;
/* if-ne p0, v0, :cond_2 */
int p0 = 2; // const/4 p0, 0x2
/* .line 41 */
} // :cond_2
v0 = android.text.TextDirectionHeuristics.LTR;
/* if-ne p0, v0, :cond_3 */
int p0 = 3; // const/4 p0, 0x3
/* .line 42 */
} // :cond_3
v0 = android.text.TextDirectionHeuristics.RTL;
/* if-ne p0, v0, :cond_4 */
int p0 = 4; // const/4 p0, 0x4
/* .line 43 */
} // :cond_4
v0 = android.text.TextDirectionHeuristics.LOCALE;
/* if-ne p0, v0, :cond_5 */
int p0 = 5; // const/4 p0, 0x5
/* .line 44 */
} // :cond_5
v0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
/* if-ne p0, v0, :cond_6 */
int p0 = 6; // const/4 p0, 0x6
/* .line 45 */
} // :cond_6
v0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
/* if-ne p0, v0, :cond_7 */
int p0 = 7; // const/4 p0, 0x7
} // :cond_7
} // .end method
public static Integer a ( android.widget.TextView p0 ) {
/* .locals 1 */
/* .line 20 */
v0 = (( android.widget.TextView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
(( android.text.TextPaint ) p0 ).getFontMetricsInt ( ); // invoke-virtual {p0}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
/* iget p0, p0, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* sub-int/2addr v0, p0 */
} // .end method
public static android.view.ActionMode$Callback a ( android.widget.TextView p0, android.view.ActionMode$Callback p1 ) {
/* .locals 2 */
/* .line 6 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_1 */
/* const/16 v1, 0x1b */
/* if-gt v0, v1, :cond_1 */
/* instance-of v0, p1, Lc/h/o/o; */
/* if-nez v0, :cond_1 */
/* if-nez p1, :cond_0 */
/* .line 7 */
} // :cond_0
/* new-instance v0, Lc/h/o/o; */
/* invoke-direct {v0, p1, p0}, Lc/h/o/o;-><init>(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)V */
} // :cond_1
} // :goto_0
} // .end method
public static void a ( android.widget.TextView p0, Integer p1 ) {
/* .locals 3 */
/* .line 8 */
c.h.m.g .a ( p1 );
/* .line 9 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
/* .line 10 */
(( android.widget.TextView ) p0 ).setFirstBaselineToTopHeight ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V
return;
/* .line 11 */
} // :cond_0
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
(( android.text.TextPaint ) v0 ).getFontMetricsInt ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
/* .line 12 */
/* const/16 v2, 0x10 */
/* if-lt v1, v2, :cond_2 */
/* .line 13 */
v1 = (( android.widget.TextView ) p0 ).getIncludeFontPadding ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 14 */
} // :cond_1
/* iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->ascent:I */
/* .line 15 */
} // :cond_2
} // :goto_0
/* iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* .line 16 */
} // :goto_1
v1 = java.lang.Math .abs ( v0 );
/* if-le p1, v1, :cond_3 */
/* add-int/2addr p1, v0 */
/* .line 17 */
v0 = (( android.widget.TextView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingLeft()I
/* .line 18 */
v1 = (( android.widget.TextView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I
v2 = (( android.widget.TextView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I
/* .line 19 */
(( android.widget.TextView ) p0 ).setPadding ( v0, p1, v1, v2 ); // invoke-virtual {p0, v0, p1, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V
} // :cond_3
return;
} // .end method
public static void a ( android.widget.TextView p0, android.content.res.ColorStateList p1 ) {
/* .locals 2 */
/* .line 46 */
c.h.m.g .a ( p0 );
/* .line 47 */
/* const/16 v1, 0x18 */
/* if-lt v0, v1, :cond_0 */
/* .line 48 */
(( android.widget.TextView ) p0 ).setCompoundDrawableTintList ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/TextView;->setCompoundDrawableTintList(Landroid/content/res/ColorStateList;)V
/* .line 49 */
} // :cond_0
/* instance-of v0, p0, Lc/h/o/r; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 50 */
/* check-cast p0, Lc/h/o/r; */
} // :cond_1
} // :goto_0
return;
} // .end method
public static void a ( android.widget.TextView p0, android.graphics.PorterDuff$Mode p1 ) {
/* .locals 2 */
/* .line 51 */
c.h.m.g .a ( p0 );
/* .line 52 */
/* const/16 v1, 0x18 */
/* if-lt v0, v1, :cond_0 */
/* .line 53 */
(( android.widget.TextView ) p0 ).setCompoundDrawableTintMode ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/TextView;->setCompoundDrawableTintMode(Landroid/graphics/PorterDuff$Mode;)V
/* .line 54 */
} // :cond_0
/* instance-of v0, p0, Lc/h/o/r; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 55 */
/* check-cast p0, Lc/h/o/r; */
} // :cond_1
} // :goto_0
return;
} // .end method
public static void a ( android.widget.TextView p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.widget.TextView ) p0 ).setCompoundDrawablesRelative ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
} // :cond_0
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_4 */
/* .line 3 */
v0 = (( android.widget.TextView ) p0 ).getLayoutDirection ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getLayoutDirection()I
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* move-object v0, p3 */
} // :cond_2
/* move-object v0, p1 */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_3
} // :cond_3
/* move-object p1, p3 */
/* .line 4 */
} // :goto_2
(( android.widget.TextView ) p0 ).setCompoundDrawables ( v0, p2, p1, p4 ); // invoke-virtual {p0, v0, p2, p1, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
/* .line 5 */
} // :cond_4
(( android.widget.TextView ) p0 ).setCompoundDrawables ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
} // :goto_3
return;
} // .end method
public static void a ( android.widget.TextView p0, Object p1 ) {
/* .locals 2 */
/* .line 21 */
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_0 */
/* .line 22 */
(( c.h.l.b ) p1 ).c ( ); // invoke-virtual {p1}, Lc/h/l/b;->c()Landroid/text/TextDirectionHeuristic;
v0 = c.h.o.p .a ( v0 );
(( android.widget.TextView ) p0 ).setTextDirection ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextDirection(I)V
/* .line 23 */
} // :cond_0
/* const/16 v1, 0x17 */
/* if-ge v0, v1, :cond_2 */
/* .line 24 */
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
v0 = (( android.text.TextPaint ) v0 ).getTextScaleX ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTextScaleX()F
/* .line 25 */
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
(( android.text.TextPaint ) v1 ).set ( p1 ); // invoke-virtual {v1, p1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V
/* .line 26 */
p1 = (( android.widget.TextView ) p0 ).getTextScaleX ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getTextScaleX()F
/* cmpl-float p1, v0, p1 */
/* if-nez p1, :cond_1 */
/* const/high16 p1, 0x40000000 # 2.0f */
/* div-float p1, v0, p1 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* add-float/2addr p1, v1 */
/* .line 27 */
(( android.widget.TextView ) p0 ).setTextScaleX ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextScaleX(F)V
/* .line 28 */
} // :cond_1
(( android.widget.TextView ) p0 ).setTextScaleX ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextScaleX(F)V
/* .line 29 */
} // :cond_2
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
(( android.text.TextPaint ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V
/* .line 30 */
v0 = (( c.h.l.b ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/l/b;->a()I
(( android.widget.TextView ) p0 ).setBreakStrategy ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/TextView;->setBreakStrategy(I)V
/* .line 31 */
p1 = (( c.h.l.b ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/l/b;->b()I
(( android.widget.TextView ) p0 ).setHyphenationFrequency ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHyphenationFrequency(I)V
} // :goto_0
return;
} // .end method
public static void a ( android.widget.TextView p0, Object p1 ) {
/* .locals 2 */
/* .line 32 */
/* const/16 v1, 0x1d */
/* if-lt v0, v1, :cond_0 */
/* .line 33 */
(( c.h.l.c ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/l/c;->b()Landroid/text/PrecomputedText;
(( android.widget.TextView ) p0 ).setText ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 34 */
} // :cond_0
c.h.o.p .d ( p0 );
/* .line 35 */
(( c.h.l.c ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/l/c;->a()Lc/h/l/b;
v0 = (( c.h.l.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/l/b;->a(Lc/h/l/b;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 36 */
(( android.widget.TextView ) p0 ).setText ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :goto_0
return;
/* .line 37 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "Given text can not be applied to TextView."; // const-string p1, "Given text can not be applied to TextView."
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Integer b ( android.widget.TextView p0 ) {
/* .locals 1 */
/* .line 11 */
v0 = (( android.widget.TextView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
(( android.text.TextPaint ) p0 ).getFontMetricsInt ( ); // invoke-virtual {p0}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
/* iget p0, p0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I */
/* add-int/2addr v0, p0 */
} // .end method
public static void b ( android.widget.TextView p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
c.h.m.g .a ( p1 );
/* .line 2 */
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
(( android.text.TextPaint ) v0 ).getFontMetricsInt ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
/* .line 3 */
/* const/16 v2, 0x10 */
/* if-lt v1, v2, :cond_1 */
/* .line 4 */
v1 = (( android.widget.TextView ) p0 ).getIncludeFontPadding ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
} // :cond_0
/* iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->descent:I */
/* .line 6 */
} // :cond_1
} // :goto_0
/* iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I */
/* .line 7 */
} // :goto_1
v1 = java.lang.Math .abs ( v0 );
/* if-le p1, v1, :cond_2 */
/* sub-int/2addr p1, v0 */
/* .line 8 */
v0 = (( android.widget.TextView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingLeft()I
v1 = (( android.widget.TextView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I
/* .line 9 */
v2 = (( android.widget.TextView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I
/* .line 10 */
(( android.widget.TextView ) p0 ).setPadding ( v0, v1, v2, p1 ); // invoke-virtual {p0, v0, v1, v2, p1}, Landroid/widget/TextView;->setPadding(IIII)V
} // :cond_2
return;
} // .end method
public static android.text.TextDirectionHeuristic c ( android.widget.TextView p0 ) {
/* .locals 4 */
/* .line 4 */
(( android.widget.TextView ) p0 ).getTransformationMethod ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;
/* instance-of v0, v0, Landroid/text/method/PasswordTransformationMethod; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
p0 = android.text.TextDirectionHeuristics.LTR;
/* .line 6 */
} // :cond_0
/* const/16 v1, 0x1c */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-lt v0, v1, :cond_3 */
/* .line 7 */
v0 = (( android.widget.TextView ) p0 ).getInputType ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I
/* and-int/lit8 v0, v0, 0xf */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_3 */
/* .line 8 */
(( android.widget.TextView ) p0 ).getTextLocale ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getTextLocale()Ljava/util/Locale;
android.icu.text.DecimalFormatSymbols .getInstance ( p0 );
/* .line 9 */
(( android.icu.text.DecimalFormatSymbols ) p0 ).getDigitStrings ( ); // invoke-virtual {p0}, Landroid/icu/text/DecimalFormatSymbols;->getDigitStrings()[Ljava/lang/String;
/* aget-object p0, p0, v2 */
/* .line 10 */
p0 = (( java.lang.String ) p0 ).codePointAt ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I
/* .line 11 */
p0 = java.lang.Character .getDirectionality ( p0 );
/* if-eq p0, v3, :cond_2 */
int v0 = 2; // const/4 v0, 0x2
/* if-ne p0, v0, :cond_1 */
/* .line 12 */
} // :cond_1
p0 = android.text.TextDirectionHeuristics.LTR;
/* .line 13 */
} // :cond_2
} // :goto_0
p0 = android.text.TextDirectionHeuristics.RTL;
/* .line 14 */
} // :cond_3
v0 = (( android.widget.TextView ) p0 ).getLayoutDirection ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getLayoutDirection()I
/* if-ne v0, v3, :cond_4 */
int v2 = 1; // const/4 v2, 0x1
/* .line 15 */
} // :cond_4
p0 = (( android.widget.TextView ) p0 ).getTextDirection ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getTextDirection()I
/* packed-switch p0, :pswitch_data_0 */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 16 */
p0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
/* .line 17 */
/* :pswitch_0 */
p0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
/* .line 18 */
/* :pswitch_1 */
p0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
/* .line 19 */
/* :pswitch_2 */
p0 = android.text.TextDirectionHeuristics.LOCALE;
/* .line 20 */
/* :pswitch_3 */
p0 = android.text.TextDirectionHeuristics.RTL;
/* .line 21 */
/* :pswitch_4 */
p0 = android.text.TextDirectionHeuristics.LTR;
/* .line 22 */
/* :pswitch_5 */
p0 = android.text.TextDirectionHeuristics.ANYRTL_LTR;
/* .line 23 */
} // :cond_5
p0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
} // :goto_1
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static void c ( android.widget.TextView p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
c.h.m.g .a ( p1 );
/* .line 2 */
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
int v1 = 0; // const/4 v1, 0x0
v0 = (( android.text.TextPaint ) v0 ).getFontMetricsInt ( v1 ); // invoke-virtual {v0, v1}, Landroid/text/TextPaint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I
/* if-eq p1, v0, :cond_0 */
/* sub-int/2addr p1, v0 */
/* int-to-float p1, p1 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* .line 3 */
(( android.widget.TextView ) p0 ).setLineSpacing ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V
} // :cond_0
return;
} // .end method
public static c.h.l.b d ( android.widget.TextView p0 ) {
/* .locals 3 */
/* .line 4 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
/* .line 5 */
/* new-instance v0, Lc/h/l/b; */
(( android.widget.TextView ) p0 ).getTextMetricsParams ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getTextMetricsParams()Landroid/text/PrecomputedText$Params;
/* invoke-direct {v0, p0}, Lc/h/l/b;-><init>(Landroid/text/PrecomputedText$Params;)V */
/* .line 6 */
} // :cond_0
/* new-instance v0, Lc/h/l/a; */
/* new-instance v1, Landroid/text/TextPaint; */
/* .line 7 */
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
/* invoke-direct {v1, v2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V */
/* invoke-direct {v0, v1}, Lc/h/l/a;-><init>(Landroid/text/TextPaint;)V */
/* .line 8 */
/* const/16 v2, 0x17 */
/* if-lt v1, v2, :cond_1 */
/* .line 9 */
v1 = (( android.widget.TextView ) p0 ).getBreakStrategy ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getBreakStrategy()I
(( c.h.l.a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/l/a;->a(I)Lc/h/l/a;
/* .line 10 */
v1 = (( android.widget.TextView ) p0 ).getHyphenationFrequency ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getHyphenationFrequency()I
(( c.h.l.a ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/h/l/a;->b(I)Lc/h/l/a;
/* .line 11 */
} // :cond_1
/* const/16 v2, 0x12 */
/* if-lt v1, v2, :cond_2 */
/* .line 12 */
c.h.o.p .c ( p0 );
(( c.h.l.a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/h/l/a;->a(Landroid/text/TextDirectionHeuristic;)Lc/h/l/a;
/* .line 13 */
} // :cond_2
(( c.h.l.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/l/a;->a()Lc/h/l/b;
} // .end method
public static void d ( android.widget.TextView p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.widget.TextView ) p0 ).setTextAppearance ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V
/* .line 3 */
} // :cond_0
(( android.widget.TextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
(( android.widget.TextView ) p0 ).setTextAppearance ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
} // :goto_0
return;
} // .end method
