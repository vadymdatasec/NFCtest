public class e.h.b.a.l.v0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.view.ViewGroup a;
	 /* # direct methods */
	 public e.h.b.a.l.v0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 /* new-instance v0, Le/h/b/a/l/c; */
		 /* invoke-direct {v0, p1}, Le/h/b/a/l/c;-><init>(Landroid/view/ViewGroup;)V */
		 (( android.view.ViewGroup ) p1 ).setOnClickListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 return;
	 } // .end method
	 public static void a ( android.view.ViewGroup p0, android.view.View p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.view.ViewGroup ) p0 ).removeAllViews ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V
		 return;
	 } // .end method
	 public static void a ( e.h.b.a.l.v0 p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( e.h.b.a.l.v0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/l/v0;->a(I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final android.view.View a ( java.lang.String p0, Integer p1 ) {
		 /* .locals 5 */
		 /* .line 6 */
		 /* new-instance v0, Landroidx/cardview/widget/CardView; */
		 v1 = this.a;
		 (( android.view.ViewGroup ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
		 /* invoke-direct {v0, v1}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;)V */
		 /* .line 7 */
		 /* new-instance v1, Landroid/view/ViewGroup$LayoutParams; */
		 int v2 = -2; // const/4 v2, -0x2
		 int v3 = -1; // const/4 v3, -0x1
		 /* invoke-direct {v1, v3, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
		 (( android.widget.FrameLayout ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* const/high16 v1, 0x41c80000 # 25.0f */
		 /* .line 8 */
		 (( androidx.cardview.widget.CardView ) v0 ).setRadius ( v1 ); // invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setRadius(F)V
		 /* .line 9 */
		 /* new-instance v1, Landroid/widget/TextView; */
		 v4 = this.a;
		 (( android.view.ViewGroup ) v4 ).getContext ( ); // invoke-virtual {v4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
		 /* invoke-direct {v1, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
		 /* const/16 v4, 0x11 */
		 /* .line 10 */
		 (( android.widget.TextView ) v1 ).setGravity ( v4 ); // invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V
		 /* .line 11 */
		 (( android.widget.TextView ) v1 ).setText ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 /* .line 12 */
		 /* new-instance p1, Landroid/view/ViewGroup$LayoutParams; */
		 /* invoke-direct {p1, v3, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
		 (( android.widget.TextView ) v1 ).setLayoutParams ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* const/16 p1, 0xf */
		 /* .line 13 */
		 v2 = 		 (( e.h.b.a.l.v0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/l/v0;->b(I)I
		 /* const/16 v3, 0xa */
		 v4 = 		 (( e.h.b.a.l.v0 ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Le/h/b/a/l/v0;->b(I)I
		 p1 = 		 (( e.h.b.a.l.v0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/l/v0;->b(I)I
		 v3 = 		 (( e.h.b.a.l.v0 ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Le/h/b/a/l/v0;->b(I)I
		 (( android.widget.TextView ) v1 ).setPadding ( v2, v4, p1, v3 ); // invoke-virtual {v1, v2, v4, p1, v3}, Landroid/widget/TextView;->setPadding(IIII)V
		 final String p1 = "#FFFFFF"; // const-string p1, "#FFFFFF"
		 /* .line 14 */
		 p1 = 		 android.graphics.Color .parseColor ( p1 );
		 (( android.widget.TextView ) v1 ).setTextColor ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V
		 int p1 = 0; // const/4 p1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 /* .line 15 */
		 (( android.widget.TextView ) v1 ).setTypeface ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V
		 /* .line 16 */
		 (( android.widget.TextView ) v1 ).setBackgroundColor ( p2 ); // invoke-virtual {v1, p2}, Landroid/widget/TextView;->setBackgroundColor(I)V
		 /* .line 17 */
		 (( android.widget.FrameLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
	 } // .end method
	 public final void a ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 20 */
		 v0 = this.a;
		 (( android.view.ViewGroup ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
		 /* .line 21 */
		 v0 = this.a;
		 (( android.view.ViewGroup ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V
		 return;
	 } // .end method
	 public final void a ( Object p0 ) {
		 /* .locals 3 */
		 /* .line 18 */
		 /* new-instance p1, Le/h/b/a/l/u0; */
		 /* invoke-direct {p1, p0}, Le/h/b/a/l/u0;-><init>(Le/h/b/a/l/v0;)V */
		 /* .line 19 */
		 v0 = this.a;
		 /* const-wide/16 v1, 0xbb8 */
		 (( android.view.ViewGroup ) v0 ).postDelayed ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z
		 return;
	 } // .end method
	 public void a ( java.lang.String p0, Integer p1, Object p2 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 (( e.h.b.a.l.v0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/b/a/l/v0;->a(I)V
		 /* .line 4 */
		 v0 = this.a;
		 (( e.h.b.a.l.v0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/l/v0;->a(Ljava/lang/String;I)Landroid/view/View;
		 (( android.view.ViewGroup ) v0 ).addView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
		 /* .line 5 */
		 (( e.h.b.a.l.v0 ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Le/h/b/a/l/v0;->a(Le/h/b/a/m/d;)V
		 return;
	 } // .end method
	 public final Integer b ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.view.ViewGroup ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
		 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
		 /* int-to-float p1, p1 */
		 /* mul-float p1, p1, v0 */
		 /* const/high16 v0, 0x3f000000 # 0.5f */
		 /* add-float/2addr p1, v0 */
		 /* float-to-int p1, p1 */
	 } // .end method
