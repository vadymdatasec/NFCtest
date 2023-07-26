public class e.h.b.a.n.g extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.app.Activity a;
	 /* # direct methods */
	 public e.h.b.a.n.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 2 */
		 final String v0 = "packid.ScreenUnlockErr"; // const-string v0, "packid.ScreenUnlockErr"
		 final String v1 = "Quit application because there is no lock screen on current device"; // const-string v1, "Quit application because there is no lock screen on current device"
		 /* .line 9 */
		 android.util.Log .w ( v0,v1 );
		 /* .line 10 */
		 v0 = this.a;
		 (( android.app.Activity ) v0 ).finishAffinity ( ); // invoke-virtual {v0}, Landroid/app/Activity;->finishAffinity()V
		 /* .line 11 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "android.intent.action.MAIN"; // const-string v1, "android.intent.action.MAIN"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 final String v1 = "android.intent.category.HOME"; // const-string v1, "android.intent.category.HOME"
		 /* .line 12 */
		 (( android.content.Intent ) v0 ).addCategory ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
		 /* const/high16 v1, 0x10000000 */
		 /* .line 13 */
		 (( android.content.Intent ) v0 ).setFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
		 /* .line 14 */
		 v1 = this.a;
		 (( android.app.Activity ) v1 ).getApplication ( ); // invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;
		 (( android.app.Application ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/Application;->startActivity(Landroid/content/Intent;)V
		 return;
	 } // .end method
	 public final void a ( android.content.Context p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/app/AlertDialog$Builder; */
		 /* invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
		 /* new-instance p1, Le/h/b/a/n/b; */
		 /* invoke-direct {p1, p0}, Le/h/b/a/n/b;-><init>(Le/h/b/a/n/g;)V */
		 /* .line 2 */
		 (( android.app.AlertDialog$Builder ) v0 ).setOnDismissListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;
		 /* .line 3 */
		 (( android.app.AlertDialog$Builder ) p1 ).setMessage ( p2 ); // invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;
		 /* new-instance p2, Le/h/b/a/n/a; */
		 /* invoke-direct {p2, p0}, Le/h/b/a/n/a;-><init>(Le/h/b/a/n/g;)V */
		 /* const v0, 0x7f0e0064 */
		 /* .line 4 */
		 (( android.app.AlertDialog$Builder ) p1 ).setNeutralButton ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 /* .line 5 */
		 (( android.app.AlertDialog$Builder ) p1 ).create ( ); // invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
		 /* .line 6 */
		 (( android.app.AlertDialog ) p1 ).show ( ); // invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V
		 return;
	 } // .end method
	 public void a ( android.content.DialogInterface p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 7 */
		 (( e.h.b.a.n.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/b/a/n/g;->a()V
		 return;
	 } // .end method
	 public void a ( android.content.DialogInterface p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 8 */
		 (( e.h.b.a.n.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/b/a/n/g;->a()V
		 return;
	 } // .end method
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 0 */
		 final String p1 = "packid.ScreenUnlockErr"; // const-string p1, "packid.ScreenUnlockErr"
		 final String p2 = "ScreenUnlockErrorReceiver received"; // const-string p2, "ScreenUnlockErrorReceiver received"
		 /* .line 1 */
		 android.util.Log .i ( p1,p2 );
		 /* .line 2 */
		 p1 = this.a;
		 /* const p2, 0x7f0e0133 */
		 (( e.h.b.a.n.g ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/n/g;->a(Landroid/content/Context;I)V
		 return;
	 } // .end method
