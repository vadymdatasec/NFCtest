public class com.google.android.gms.common.api.GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface$OnCancelListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Lcom/google/android/gms/common/annotation/KeepName; */
} // .end annotation
/* # instance fields */
public Integer b;
/* # direct methods */
public com.google.android.gms.common.api.GoogleApiActivity ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* iput v0, p0, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I */
	 return;
} // .end method
public static android.app.PendingIntent a ( android.content.Context p0, android.app.PendingIntent p1, Integer p2 ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 1 */
	 com.google.android.gms.common.api.GoogleApiActivity .a ( p0,p1,p2,v0 );
	 int p2 = 0; // const/4 p2, 0x0
	 /* const/high16 v0, 0x8000000 */
	 /* .line 2 */
	 android.app.PendingIntent .getActivity ( p0,p2,p1,v0 );
} // .end method
public static android.content.Intent a ( android.content.Context p0, android.app.PendingIntent p1, Integer p2, Boolean p3 ) {
	 /* .locals 2 */
	 /* .line 3 */
	 /* new-instance v0, Landroid/content/Intent; */
	 /* const-class v1, Lcom/google/android/gms/common/api/GoogleApiActivity; */
	 /* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
	 final String p0 = "pending_intent"; // const-string p0, "pending_intent"
	 /* .line 4 */
	 (( android.content.Intent ) v0 ).putExtra ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
	 final String p0 = "failing_client_id"; // const-string p0, "failing_client_id"
	 /* .line 5 */
	 (( android.content.Intent ) v0 ).putExtra ( p0, p2 ); // invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
	 final String p0 = "notify_manager"; // const-string p0, "notify_manager"
	 /* .line 6 */
	 (( android.content.Intent ) v0 ).putExtra ( p0, p3 ); // invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
} // .end method
/* # virtual methods */
public void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V */
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 1; // const/4 v1, 0x1
	 /* if-ne p1, v1, :cond_2 */
	 /* .line 2 */
	 (( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
	 final String v2 = "notify_manager"; // const-string v2, "notify_manager"
	 p1 = 	 (( android.content.Intent ) p1 ).getBooleanExtra ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
	 /* .line 3 */
	 /* iput v0, p0, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I */
	 /* .line 4 */
	 (( android.app.Activity ) p0 ).setResult ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V
	 if ( p1 != null) { // if-eqz p1, :cond_3
		 /* .line 5 */
		 e.f.a.b.c.l.k.f .a ( p0 );
		 int p3 = -1; // const/4 p3, -0x1
		 /* if-eq p2, p3, :cond_1 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 6 */
		 } // :cond_0
		 /* new-instance p2, Le/f/a/b/c/a; */
		 /* const/16 v0, 0xd */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p2, v0, v1}, Le/f/a/b/c/a;-><init>(ILandroid/app/PendingIntent;)V */
		 /* .line 7 */
		 (( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
		 final String v1 = "failing_client_id"; // const-string v1, "failing_client_id"
		 p3 = 		 (( android.content.Intent ) v0 ).getIntExtra ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
		 /* .line 8 */
		 (( e.f.a.b.c.l.k.f ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/a;I)V
		 /* .line 9 */
	 } // :cond_1
	 (( e.f.a.b.c.l.k.f ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/b/c/l/k/f;->a()V
} // :cond_2
int v1 = 2; // const/4 v1, 0x2
/* if-ne p1, v1, :cond_3 */
/* .line 10 */
/* iput v0, p0, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I */
/* .line 11 */
(( android.app.Activity ) p0 ).setResult ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V
/* .line 12 */
} // :cond_3
} // :goto_0
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
return;
} // .end method
public void onCancel ( android.content.DialogInterface p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
/* iput p1, p0, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I */
/* .line 2 */
(( android.app.Activity ) p0 ).setResult ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V
/* .line 3 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 9 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
if ( p1 != null) { // if-eqz p1, :cond_0
final String v0 = "resolution"; // const-string v0, "resolution"
/* .line 2 */
p1 = (( android.os.Bundle ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* iput p1, p0, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I */
/* .line 3 */
} // :cond_0
/* iget p1, p0, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I */
int v0 = 1; // const/4 v0, 0x1
/* if-eq p1, v0, :cond_4 */
/* .line 4 */
(( android.app.Activity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v1 = "GoogleApiActivity"; // const-string v1, "GoogleApiActivity"
/* if-nez p1, :cond_1 */
final String p1 = "Activity started without extras"; // const-string p1, "Activity started without extras"
/* .line 5 */
android.util.Log .e ( v1,p1 );
/* .line 6 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
return;
} // :cond_1
final String v2 = "pending_intent"; // const-string v2, "pending_intent"
/* .line 7 */
(( android.os.Bundle ) p1 ).get ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v2, Landroid/app/PendingIntent; */
final String v3 = "error_code"; // const-string v3, "error_code"
/* .line 8 */
(( android.os.Bundle ) p1 ).get ( v3 ); // invoke-virtual {p1, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Integer; */
/* if-nez v2, :cond_2 */
/* if-nez p1, :cond_2 */
final String p1 = "Activity started without resolution"; // const-string p1, "Activity started without resolution"
/* .line 9 */
android.util.Log .e ( v1,p1 );
/* .line 10 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
return;
} // :cond_2
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 11 */
try { // :try_start_0
(( android.app.PendingIntent ) v2 ).getIntentSender ( ); // invoke-virtual {v2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
/* move-object v2, p0 */
/* .line 12 */
/* invoke-virtual/range {v2 ..v8}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V */
/* .line 13 */
/* iput v0, p0, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I */
/* :try_end_0 */
/* .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception p1 */
final String v0 = "Failed to launch pendingIntent"; // const-string v0, "Failed to launch pendingIntent"
/* .line 14 */
android.util.Log .e ( v1,v0,p1 );
/* .line 15 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
return;
/* .line 16 */
} // :cond_3
e.f.a.b.c.e .b ( );
/* .line 17 */
p1 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
int v2 = 2; // const/4 v2, 0x2
(( e.f.a.b.c.e ) v1 ).b ( p0, p1, v2, p0 ); // invoke-virtual {v1, p0, p1, v2, p0}, Le/f/a/b/c/e;->b(Landroid/app/Activity;IILandroid/content/DialogInterface$OnCancelListener;)Z
/* .line 18 */
/* iput v0, p0, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I */
} // :cond_4
return;
} // .end method
public void onSaveInstanceState ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I */
final String v1 = "resolution"; // const-string v1, "resolution"
(( android.os.Bundle ) p1 ).putInt ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V */
return;
} // .end method
