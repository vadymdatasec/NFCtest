public abstract class e.f.a.b.b.b extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.concurrent.ExecutorService a;
	 /* # direct methods */
	 public e.f.a.b.b.b ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 /* .line 2 */
		 e.f.a.b.e.b.a .a ( );
		 /* new-instance v1, Le/f/a/b/c/p/l/a; */
		 final String v2 = "firebase-iid-executor"; // const-string v2, "firebase-iid-executor"
		 /* invoke-direct {v1, v2}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;)V */
		 /* .line 3 */
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 4 */
		 final String v0 = "pending_intent"; // const-string v0, "pending_intent"
		 /* .line 2 */
		 (( android.content.Intent ) p2 ).getParcelableExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
		 /* check-cast v1, Landroid/app/PendingIntent; */
		 final String v2 = "CloudMessagingReceiver"; // const-string v2, "CloudMessagingReceiver"
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 3 */
			 try { // :try_start_0
				 (( android.app.PendingIntent ) v1 ).send ( ); // invoke-virtual {v1}, Landroid/app/PendingIntent;->send()V
				 /* :try_end_0 */
				 /* .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
				 final String v1 = "Notification pending intent canceled"; // const-string v1, "Notification pending intent canceled"
				 /* .line 4 */
				 android.util.Log .e ( v2,v1 );
				 /* .line 5 */
			 } // :cond_0
		 } // :goto_0
		 (( android.content.Intent ) p2 ).getExtras ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 6 */
			 (( android.os.Bundle ) v1 ).remove ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
			 /* .line 7 */
		 } // :cond_1
		 /* new-instance v1, Landroid/os/Bundle; */
		 /* invoke-direct {v1}, Landroid/os/Bundle;-><init>()V */
		 /* .line 8 */
	 } // :goto_1
	 (( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
	 final String v3 = "com.google.firebase.messaging.NOTIFICATION_OPEN"; // const-string v3, "com.google.firebase.messaging.NOTIFICATION_OPEN"
	 v0 = 	 (( java.lang.String ) v3 ).equals ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 9 */
		 (( e.f.a.b.b.b ) p0 ).b ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/f/a/b/b/b;->b(Landroid/content/Context;Landroid/os/Bundle;)V
		 /* .line 10 */
	 } // :cond_2
	 (( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
	 final String v0 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"; // const-string v0, "com.google.firebase.messaging.NOTIFICATION_DISMISS"
	 p2 = 	 (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( p2 != null) { // if-eqz p2, :cond_3
		 /* .line 11 */
		 (( e.f.a.b.b.b ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/f/a/b/b/b;->a(Landroid/content/Context;Landroid/os/Bundle;)V
	 } // :goto_2
	 int p1 = -1; // const/4 p1, -0x1
} // :cond_3
final String p1 = "Unknown notification action"; // const-string p1, "Unknown notification action"
/* .line 12 */
android.util.Log .e ( v2,p1 );
/* const/16 p1, 0x1f4 */
} // .end method
public abstract Integer a ( android.content.Context p0, Object p1 ) {
} // .end method
public java.util.concurrent.Executor a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public abstract void a ( android.content.Context p0, android.os.Bundle p1 ) {
} // .end method
public final void a ( android.content.Intent p0, android.content.Context p1, Boolean p2, android.content.BroadcastReceiver$PendingResult p3 ) { //synthethic
/* .locals 2 */
try { // :try_start_0
	 final String v0 = "wrapped_intent"; // const-string v0, "wrapped_intent"
	 /* .line 13 */
	 (( android.content.Intent ) p1 ).getParcelableExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
	 /* .line 14 */
	 /* instance-of v1, v0, Landroid/content/Intent; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* check-cast v0, Landroid/content/Intent; */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 15 */
	 p1 = 	 (( e.f.a.b.b.b ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Le/f/a/b/b/b;->a(Landroid/content/Context;Landroid/content/Intent;)I
	 /* .line 16 */
} // :cond_1
p1 = (( e.f.a.b.b.b ) p0 ).b ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/f/a/b/b/b;->b(Landroid/content/Context;Landroid/content/Intent;)I
} // :goto_1
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 17 */
(( android.content.BroadcastReceiver$PendingResult ) p4 ).setResultCode ( p1 ); // invoke-virtual {p4, p1}, Landroid/content/BroadcastReceiver$PendingResult;->setResultCode(I)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 18 */
} // :cond_2
(( android.content.BroadcastReceiver$PendingResult ) p4 ).finish ( ); // invoke-virtual {p4}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V
return;
/* :catchall_0 */
/* move-exception p1 */
/* .line 19 */
(( android.content.BroadcastReceiver$PendingResult ) p4 ).finish ( ); // invoke-virtual {p4}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V
/* .line 20 */
/* throw p1 */
} // .end method
public final Integer b ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 3 */
/* .line 1 */
(( android.content.Intent ) p2 ).getExtras ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* if-nez v0, :cond_0 */
/* const/16 p1, 0x1f4 */
} // :cond_0
final String v0 = "google.message_id"; // const-string v0, "google.message_id"
/* .line 2 */
(( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 3 */
v2 = android.text.TextUtils .isEmpty ( v1 );
if ( v2 != null) { // if-eqz v2, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
e.f.a.b.h.n .a ( v0 );
/* .line 5 */
} // :cond_1
/* new-instance v2, Landroid/os/Bundle; */
/* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
/* .line 6 */
(( android.os.Bundle ) v2 ).putString ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 7 */
e.f.a.b.b.k .a ( p1 );
int v1 = 2; // const/4 v1, 0x2
/* .line 8 */
(( e.f.a.b.b.k ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/b/b/k;->a(ILandroid/os/Bundle;)Le/f/a/b/h/g;
/* .line 9 */
} // :goto_0
/* new-instance v1, Le/f/a/b/b/a; */
/* invoke-direct {v1, p2}, Le/f/a/b/b/a;-><init>(Landroid/content/Intent;)V */
p1 = (( e.f.a.b.b.b ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/f/a/b/b/b;->a(Landroid/content/Context;Le/f/a/b/b/a;)I
/* .line 10 */
try { // :try_start_0
p2 = java.util.concurrent.TimeUnit.SECONDS;
/* const-wide/16 v1, 0x1 */
(( java.util.concurrent.TimeUnit ) p2 ).toMillis ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
/* move-result-wide v1 */
/* .line 11 */
p2 = java.util.concurrent.TimeUnit.MILLISECONDS;
e.f.a.b.h.n .a ( v0,v1,v2,p2 );
/* :try_end_0 */
/* .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p2 */
/* :catch_1 */
/* move-exception p2 */
/* :catch_2 */
/* move-exception p2 */
/* .line 12 */
} // :goto_1
java.lang.String .valueOf ( p2 );
java.lang.String .valueOf ( p2 );
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/lit8 v0, v0, 0x14 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v0 = "Message ack failed: "; // const-string v0, "Message ack failed: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "CloudMessagingReceiver"; // const-string v0, "CloudMessagingReceiver"
android.util.Log .w ( v0,p2 );
} // :goto_2
} // .end method
public abstract void b ( android.content.Context p0, android.os.Bundle p1 ) {
} // .end method
public final void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 8 */
/* if-nez p2, :cond_0 */
return;
/* .line 1 */
} // :cond_0
v4 = (( android.content.BroadcastReceiver ) p0 ).isOrderedBroadcast ( ); // invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isOrderedBroadcast()Z
/* .line 2 */
(( android.content.BroadcastReceiver ) p0 ).goAsync ( ); // invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;
/* .line 3 */
(( e.f.a.b.b.b ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/b/b;->a()Ljava/util/concurrent/Executor;
/* new-instance v7, Le/f/a/b/b/j; */
/* move-object v0, v7 */
/* move-object v1, p0 */
/* move-object v2, p2 */
/* move-object v3, p1 */
/* invoke-direct/range {v0 ..v5}, Le/f/a/b/b/j;-><init>(Le/f/a/b/b/b;Landroid/content/Intent;Landroid/content/Context;ZLandroid/content/BroadcastReceiver$PendingResult;)V */
/* .line 4 */
return;
} // .end method
