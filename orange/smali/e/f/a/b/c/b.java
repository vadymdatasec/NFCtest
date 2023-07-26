public class e.f.a.b.c.b extends android.app.DialogFragment {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.app.Dialog b;
	 public android.content.DialogInterface$OnCancelListener c;
	 /* # direct methods */
	 public e.f.a.b.c.b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.b = v0;
		 /* .line 3 */
		 this.c = v0;
		 return;
	 } // .end method
	 public static e.f.a.b.c.b a ( android.app.Dialog p0, android.content.DialogInterface$OnCancelListener p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/a/b/c/b; */
		 /* invoke-direct {v0}, Le/f/a/b/c/b;-><init>()V */
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
		 this.b = p0;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 6 */
			 this.c = p1;
		 } // :cond_0
	 } // .end method
	 /* # virtual methods */
	 public void onCancel ( android.content.DialogInterface p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
		 } // :cond_0
		 return;
	 } // .end method
	 public android.app.Dialog onCreateDialog ( android.os.Bundle p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.b;
		 /* if-nez p1, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 (( android.app.DialogFragment ) p0 ).setShowsDialog ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/DialogFragment;->setShowsDialog(Z)V
		 /* .line 3 */
	 } // :cond_0
	 p1 = this.b;
} // .end method
public void show ( android.app.FragmentManager p0, java.lang.String p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super {p0, p1, p2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V */
	 return;
} // .end method
