public class com.google.android.play.core.assetpacks.AssetPackExtractionService extends android.app.Service {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.a.d.a.e.a b;
	 public android.content.Context c;
	 public e.f.a.d.a.b.v2 d;
	 public e.f.a.d.a.b.b0 e;
	 public e.f.a.d.a.b.z f;
	 public android.app.NotificationManager g;
	 /* # direct methods */
	 public com.google.android.play.core.assetpacks.AssetPackExtractionService ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Landroid/app/Service;-><init>()V */
		 /* new-instance v0, Le/f/a/d/a/e/a; */
		 final String v1 = "AssetPackExtractionService"; // const-string v1, "AssetPackExtractionService"
		 /* invoke-direct {v0, v1}, Le/f/a/d/a/e/a;-><init>(Ljava/lang/String;)V */
		 this.b = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized final android.os.Bundle a ( android.os.Bundle p0 ) {
		 /* .locals 7 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 final String v0 = "action_type"; // const-string v0, "action_type"
			 v0 = 			 (( android.os.Bundle ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
			 v1 = this.b;
			 int v2 = 1; // const/4 v2, 0x1
			 /* new-array v3, v2, [Ljava/lang/Object; */
			 java.lang.Integer .valueOf ( v0 );
			 int v5 = 0; // const/4 v5, 0x0
			 /* aput-object v4, v3, v5 */
			 final String v6 = "updateServiceState: %d"; // const-string v6, "updateServiceState: %d"
			 (( e.f.a.d.a.e.a ) v1 ).a ( v6, v3 ); // invoke-virtual {v1, v6, v3}, Le/f/a/d/a/e/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V
			 /* if-ne v0, v2, :cond_0 */
			 (( com.google.android.play.core.assetpacks.AssetPackExtractionService ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/play/core/assetpacks/AssetPackExtractionService;->b(Landroid/os/Bundle;)V
		 } // :cond_0
		 int p1 = 2; // const/4 p1, 0x2
		 /* if-ne v0, p1, :cond_1 */
		 (( com.google.android.play.core.assetpacks.AssetPackExtractionService ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/android/play/core/assetpacks/AssetPackExtractionService;->a()V
	 } // :cond_1
	 p1 = this.b;
	 /* new-array v0, v2, [Ljava/lang/Object; */
	 /* aput-object v4, v0, v5 */
	 final String v1 = "Unknown action type received: %d"; // const-string v1, "Unknown action type received: %d"
	 (( e.f.a.d.a.e.a ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
} // :goto_0
/* new-instance p1, Landroid/os/Bundle; */
/* invoke-direct {p1}, Landroid/os/Bundle;-><init>()V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized final void a ( ) {
/* .locals 4 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.b;
	 final String v1 = "Stopping service."; // const-string v1, "Stopping service."
	 int v2 = 0; // const/4 v2, 0x0
	 /* new-array v3, v2, [Ljava/lang/Object; */
	 (( e.f.a.d.a.e.a ) v0 ).c ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
	 v0 = this.d;
	 (( e.f.a.d.a.b.v2 ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Le/f/a/d/a/b/v2;->a(Z)V
	 int v0 = 1; // const/4 v0, 0x1
	 (( android.app.Service ) p0 ).stopForeground ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V
	 (( android.app.Service ) p0 ).stopSelf ( ); // invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized final void b ( android.os.Bundle p0 ) {
	 /* .locals 9 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 final String v0 = "notification_title"; // const-string v0, "notification_title"
		 (( android.os.Bundle ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 final String v1 = "notification_subtext"; // const-string v1, "notification_subtext"
		 (( android.os.Bundle ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 final String v2 = "notification_timeout"; // const-string v2, "notification_timeout"
		 (( android.os.Bundle ) p1 ).getLong ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
		 /* move-result-wide v2 */
		 final String v4 = "notification_on_click_intent"; // const-string v4, "notification_on_click_intent"
		 (( android.os.Bundle ) p1 ).getParcelable ( v4 ); // invoke-virtual {p1, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
		 /* check-cast v4, Landroid/app/PendingIntent; */
		 /* const/16 v6, 0x1a */
		 /* if-lt v5, v6, :cond_0 */
		 /* new-instance v5, Landroid/app/Notification$Builder; */
		 v7 = this.c;
		 final String v8 = "playcore-assetpacks-service-notification-channel"; // const-string v8, "playcore-assetpacks-service-notification-channel"
		 /* invoke-direct {v5, v7, v8}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
		 (( android.app.Notification$Builder ) v5 ).setTimeoutAfter ( v2, v3 ); // invoke-virtual {v5, v2, v3}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;
	 } // :cond_0
	 /* new-instance v2, Landroid/app/Notification$Builder; */
	 v3 = this.c;
	 /* invoke-direct {v2, v3}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V */
	 int v3 = -2; // const/4 v3, -0x2
	 (( android.app.Notification$Builder ) v2 ).setPriority ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;
} // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_1
	 (( android.app.Notification$Builder ) v2 ).setContentIntent ( v4 ); // invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
} // :cond_1
/* const v3, 0x1080081 */
(( android.app.Notification$Builder ) v2 ).setSmallIcon ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;
int v4 = 0; // const/4 v4, 0x0
(( android.app.Notification$Builder ) v3 ).setOngoing ( v4 ); // invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;
(( android.app.Notification$Builder ) v3 ).setContentTitle ( v0 ); // invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
(( android.app.Notification$Builder ) v0 ).setSubText ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_2 */
final String v0 = "notification_color"; // const-string v0, "notification_color"
v0 = (( android.os.Bundle ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
(( android.app.Notification$Builder ) v2 ).setColor ( v0 ); // invoke-virtual {v2, v0}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;
int v1 = -1; // const/4 v1, -0x1
(( android.app.Notification$Builder ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;
} // :cond_2
(( android.app.Notification$Builder ) v2 ).build ( ); // invoke-virtual {v2}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
v1 = this.b;
final String v2 = "Starting foreground service."; // const-string v2, "Starting foreground service."
/* new-array v3, v4, [Ljava/lang/Object; */
(( e.f.a.d.a.e.a ) v1 ).c ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
v1 = this.d;
int v2 = 1; // const/4 v2, 0x1
(( e.f.a.d.a.b.v2 ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/a/d/a/b/v2;->a(Z)V
/* if-lt v1, v6, :cond_3 */
final String v1 = "notification_channel_name"; // const-string v1, "notification_channel_name"
(( android.os.Bundle ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* new-instance v1, Landroid/app/NotificationChannel; */
final String v2 = "playcore-assetpacks-service-notification-channel"; // const-string v2, "playcore-assetpacks-service-notification-channel"
int v3 = 2; // const/4 v3, 0x2
/* invoke-direct {v1, v2, p1, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V */
p1 = this.g;
(( android.app.NotificationManager ) p1 ).createNotificationChannel ( v1 ); // invoke-virtual {p1, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V
} // :cond_3
/* const p1, -0x70492694 */
(( android.app.Service ) p0 ).startForeground ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final android.os.IBinder onBind ( android.content.Intent p0 ) {
/* .locals 0 */
p1 = this.f;
} // .end method
public final void onCreate ( ) {
/* .locals 3 */
/* invoke-super {p0}, Landroid/app/Service;->onCreate()V */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Object; */
final String v2 = "onCreate"; // const-string v2, "onCreate"
(( e.f.a.d.a.e.a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V
(( android.app.Service ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;
e.f.a.d.a.b.v1 .a ( v0 );
/* new-instance v0, Le/f/a/d/a/b/z; */
v1 = this.c;
v2 = this.e;
/* invoke-direct {v0, v1, p0, v2}, Le/f/a/d/a/b/z;-><init>(Landroid/content/Context;Lcom/google/android/play/core/assetpacks/AssetPackExtractionService;Le/f/a/d/a/b/b0;)V */
this.f = v0;
v0 = this.c;
final String v1 = "notification"; // const-string v1, "notification"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/NotificationManager; */
this.g = v0;
return;
} // .end method
