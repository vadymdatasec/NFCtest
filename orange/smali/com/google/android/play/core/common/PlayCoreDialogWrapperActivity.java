public class com.google.android.play.core.common.PlayCoreDialogWrapperActivity extends android.app.Activity {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.os.ResultReceiver b;
	 /* # direct methods */
	 public com.google.android.play.core.common.PlayCoreDialogWrapperActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( android.content.Context p0 ) {
		 /* .locals 3 */
		 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 /* new-instance v1, Landroid/content/ComponentName; */
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 final String v2 = "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"; // const-string v2, "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"
		 /* invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 int p0 = 1; // const/4 p0, 0x1
		 e.f.a.d.a.e.m .a ( v0,v1,p0 );
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
		 /* .locals 0 */
		 /* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V */
		 /* if-nez p1, :cond_1 */
		 p1 = this.b;
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 int p3 = -1; // const/4 p3, -0x1
			 /* if-ne p2, p3, :cond_0 */
			 /* new-instance p2, Landroid/os/Bundle; */
			 /* invoke-direct {p2}, Landroid/os/Bundle;-><init>()V */
			 int p3 = 1; // const/4 p3, 0x1
		 } // :goto_0
		 (( android.os.ResultReceiver ) p1 ).send ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V
	 } // :cond_0
	 /* if-nez p2, :cond_1 */
	 /* new-instance p2, Landroid/os/Bundle; */
	 /* invoke-direct {p2}, Landroid/os/Bundle;-><init>()V */
	 int p3 = 2; // const/4 p3, 0x2
} // :cond_1
} // :goto_1
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
return;
} // .end method
public final void onCreate ( android.os.Bundle p0 ) {
/* .locals 10 */
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
final String v1 = "window_flags"; // const-string v1, "window_flags"
int v2 = 0; // const/4 v2, 0x0
v0 = (( android.content.Intent ) v0 ).getIntExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v2 ).getDecorView ( ); // invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;
(( android.view.View ) v2 ).setSystemUiVisibility ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->setSystemUiVisibility(I)V
/* new-instance v2, Landroid/content/Intent; */
/* invoke-direct {v2}, Landroid/content/Intent;-><init>()V */
(( android.content.Intent ) v2 ).putExtra ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* move-object v6, v2 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
final String v0 = "result_receiver"; // const-string v0, "result_receiver"
/* if-nez p1, :cond_2 */
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) p1 ).getParcelableExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast p1, Landroid/os/ResultReceiver; */
this.b = p1;
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v0 = "confirmation_intent"; // const-string v0, "confirmation_intent"
(( android.os.Bundle ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Landroid/app/PendingIntent; */
try { // :try_start_0
(( android.app.PendingIntent ) p1 ).getIntentSender ( ); // invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
/* move-object v3, p0 */
/* invoke-virtual/range {v3 ..v9}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V */
/* :try_end_0 */
/* .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* nop */
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_1
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
int v1 = 3; // const/4 v1, 0x3
(( android.os.ResultReceiver ) p1 ).send ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V
} // :cond_1
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
return;
} // :cond_2
(( android.os.Bundle ) p1 ).getParcelable ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast p1, Landroid/os/ResultReceiver; */
this.b = p1;
return;
} // .end method
public final void onSaveInstanceState ( android.os.Bundle p0 ) {
/* .locals 2 */
v0 = this.b;
final String v1 = "result_receiver"; // const-string v1, "result_receiver"
(( android.os.Bundle ) p1 ).putParcelable ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
return;
} // .end method
