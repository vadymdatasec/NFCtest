public class c.b.k.p {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.k.m a;
	 public final Integer b;
	 /* # direct methods */
	 public c.b.k.p ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 v0 = 		 c.b.k.q .b ( p1,v0 );
		 /* invoke-direct {p0, p1, v0}, Lc/b/k/p;-><init>(Landroid/content/Context;I)V */
		 return;
	 } // .end method
	 public c.b.k.p ( ) {
		 /* .locals 3 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 3 */
		 /* new-instance v0, Lc/b/k/m; */
		 /* new-instance v1, Landroid/view/ContextThemeWrapper; */
		 /* .line 4 */
		 v2 = 		 c.b.k.q .b ( p1,p2 );
		 /* invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
		 /* invoke-direct {v0, v1}, Lc/b/k/m;-><init>(Landroid/content/Context;)V */
		 this.a = v0;
		 /* .line 5 */
		 /* iput p2, p0, Lc/b/k/p;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public c.b.k.p a ( Integer p0 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 v0 = this.a;
		 v1 = this.a;
		 (( android.content.Context ) v1 ).getText ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
		 this.h = p1;
	 } // .end method
	 public c.b.k.p a ( Integer p0, android.content.DialogInterface$OnClickListener p1 ) {
		 /* .locals 2 */
		 /* .line 5 */
		 v0 = this.a;
		 v1 = this.a;
		 (( android.content.Context ) v1 ).getText ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
		 this.l = p1;
		 /* .line 6 */
		 p1 = this.a;
		 this.n = p2;
	 } // .end method
	 public c.b.k.p a ( android.content.DialogInterface$OnKeyListener p0 ) {
		 /* .locals 1 */
		 /* .line 7 */
		 v0 = this.a;
		 this.u = p1;
	 } // .end method
	 public c.b.k.p a ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 1 */
		 /* .line 4 */
		 v0 = this.a;
		 this.d = p1;
	 } // .end method
	 public c.b.k.p a ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = this.a;
		 this.g = p1;
	 } // .end method
	 public c.b.k.p a ( android.widget.ListAdapter p0, Integer p1, android.content.DialogInterface$OnClickListener p2 ) {
		 /* .locals 1 */
		 /* .line 10 */
		 v0 = this.a;
		 this.w = p1;
		 /* .line 11 */
		 this.x = p3;
		 /* .line 12 */
		 /* iput p2, v0, Lc/b/k/m;->I:I */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 13 */
		 /* iput-boolean p1, v0, Lc/b/k/m;->H:Z */
	 } // .end method
	 public c.b.k.p a ( android.widget.ListAdapter p0, android.content.DialogInterface$OnClickListener p1 ) {
		 /* .locals 1 */
		 /* .line 8 */
		 v0 = this.a;
		 this.w = p1;
		 /* .line 9 */
		 this.x = p2;
	 } // .end method
	 public c.b.k.p a ( java.lang.CharSequence p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 this.f = p1;
	 } // .end method
	 public c.b.k.q a ( ) {
		 /* .locals 3 */
		 /* .line 14 */
		 /* new-instance v0, Lc/b/k/q; */
		 v1 = this.a;
		 v1 = this.a;
		 /* iget v2, p0, Lc/b/k/p;->b:I */
		 /* invoke-direct {v0, v1, v2}, Lc/b/k/q;-><init>(Landroid/content/Context;I)V */
		 /* .line 15 */
		 v1 = this.a;
		 v2 = this.d;
		 (( c.b.k.m ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/b/k/m;->a(Landroidx/appcompat/app/AlertController;)V
		 /* .line 16 */
		 v1 = this.a;
		 /* iget-boolean v1, v1, Lc/b/k/m;->r:Z */
		 (( android.app.Dialog ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V
		 /* .line 17 */
		 v1 = this.a;
		 /* iget-boolean v1, v1, Lc/b/k/m;->r:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 int v1 = 1; // const/4 v1, 0x1
			 /* .line 18 */
			 (( android.app.Dialog ) v0 ).setCanceledOnTouchOutside ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V
			 /* .line 19 */
		 } // :cond_0
		 v1 = this.a;
		 v1 = this.s;
		 (( android.app.Dialog ) v0 ).setOnCancelListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
		 /* .line 20 */
		 v1 = this.a;
		 v1 = this.t;
		 (( android.app.Dialog ) v0 ).setOnDismissListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
		 /* .line 21 */
		 v1 = this.a;
		 v1 = this.u;
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 22 */
			 (( android.app.Dialog ) v0 ).setOnKeyListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V
		 } // :cond_1
	 } // .end method
	 public android.content.Context b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 v0 = this.a;
	 } // .end method
	 public c.b.k.p b ( Integer p0 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 v0 = this.a;
		 v1 = this.a;
		 (( android.content.Context ) v1 ).getText ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
		 this.f = p1;
	 } // .end method
	 public c.b.k.p b ( Integer p0, android.content.DialogInterface$OnClickListener p1 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 v0 = this.a;
		 v1 = this.a;
		 (( android.content.Context ) v1 ).getText ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
		 this.i = p1;
		 /* .line 4 */
		 p1 = this.a;
		 this.k = p2;
	 } // .end method
