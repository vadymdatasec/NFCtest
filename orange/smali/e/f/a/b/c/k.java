public class e.f.a.b.c.k extends c.l.d.s {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.app.Dialog p0;
	 public android.content.DialogInterface$OnCancelListener q0;
	 /* # direct methods */
	 public e.f.a.b.c.k ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/l/d/s;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.p0 = v0;
		 /* .line 3 */
		 this.q0 = v0;
		 return;
	 } // .end method
	 public static e.f.a.b.c.k a ( android.app.Dialog p0, android.content.DialogInterface$OnCancelListener p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/a/b/c/k; */
		 /* invoke-direct {v0}, Le/f/a/b/c/k;-><init>()V */
		 final String v1 = "Cannot display null dialog"; // const-string v1, "Cannot display null dialog"
		 /* .line 2 */
		 e.f.a.b.c.m.h .a ( p0,v1 );
		 /* check-cast p0, Landroid/app/Dialog; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 3 */
		 (( android.app.Dialog ) p0 ).setOnCancelListener ( v1 ); // invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
		 /* .line 4 */
		 (( android.app.Dialog ) p0 ).setOnDismissListener ( v1 ); // invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
		 /* .line 5 */
		 this.p0 = p0;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 6 */
			 this.q0 = p1;
		 } // :cond_0
	 } // .end method
	 /* # virtual methods */
	 public void a ( c.l.d.o1 p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 /* .line 7 */
		 /* invoke-super {p0, p1, p2}, Lc/l/d/s;->a(Lc/l/d/o1;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public android.app.Dialog n ( android.os.Bundle p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.p0;
		 /* if-nez p1, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 (( c.l.d.s ) p0 ).l ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/s;->l(Z)V
		 /* .line 3 */
	 } // :cond_0
	 p1 = this.p0;
} // .end method
public void onCancel ( android.content.DialogInterface p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.q0;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
	 } // :cond_0
	 return;
} // .end method
