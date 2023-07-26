public abstract class e.f.a.b.c.p.m {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.content.IntentFilter a;
	 public static Long b;
	 public static Float c;
	 /* # direct methods */
	 public static e.f.a.b.c.p.m ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/content/IntentFilter; */
		 final String v1 = "android.intent.action.BATTERY_CHANGED"; // const-string v1, "android.intent.action.BATTERY_CHANGED"
		 /* invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
		 /* const/high16 v0, 0x7fc00000 # Float.NaN */
		 /* .line 2 */
		 return;
	 } // .end method
	 public static Integer a ( android.content.Context p0 ) {
		 /* .locals 4 */
		 /* .annotation build Landroid/annotation/TargetApi; */
		 /* value = 0x14 */
	 } // .end annotation
	 int v0 = -1; // const/4 v0, -0x1
	 if ( p0 != null) { // if-eqz p0, :cond_6
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 /* if-nez v1, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
	 int v2 = 0; // const/4 v2, 0x0
	 v3 = e.f.a.b.c.p.m.a;
	 (( android.content.Context ) v1 ).registerReceiver ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
	 int v2 = 0; // const/4 v2, 0x0
	 /* if-nez v1, :cond_1 */
	 int v1 = 0; // const/4 v1, 0x0
} // :cond_1
final String v3 = "plugged"; // const-string v3, "plugged"
/* .line 3 */
v1 = (( android.content.Intent ) v1 ).getIntExtra ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
} // :goto_0
/* and-int/lit8 v1, v1, 0x7 */
if ( v1 != null) { // if-eqz v1, :cond_2
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
final String v3 = "power"; // const-string v3, "power"
/* .line 4 */
(( android.content.Context ) p0 ).getSystemService ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p0, Landroid/os/PowerManager; */
/* if-nez p0, :cond_3 */
/* .line 5 */
} // :cond_3
v0 = e.f.a.b.c.p.h .e ( );
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 6 */
p0 = (( android.os.PowerManager ) p0 ).isInteractive ( ); // invoke-virtual {p0}, Landroid/os/PowerManager;->isInteractive()Z
/* .line 7 */
} // :cond_4
p0 = (( android.os.PowerManager ) p0 ).isScreenOn ( ); // invoke-virtual {p0}, Landroid/os/PowerManager;->isScreenOn()Z
} // :goto_2
if ( p0 != null) { // if-eqz p0, :cond_5
int v2 = 2; // const/4 v2, 0x2
} // :cond_5
/* or-int p0, v2, v1 */
} // :cond_6
} // :goto_3
} // .end method
public static synchronized Float b ( android.content.Context p0 ) {
/* .locals 6 */
/* const-class v0, Le/f/a/b/c/p/m; */
/* monitor-enter v0 */
/* .line 1 */
try { // :try_start_0
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* sget-wide v3, Le/f/a/b/c/p/m;->b:J */
/* sub-long/2addr v1, v3 */
/* const-wide/32 v3, 0xea60 */
/* cmp-long v5, v1, v3 */
/* if-gez v5, :cond_0 */
/* .line 2 */
v1 = java.lang.Float .isNaN ( v1 );
/* if-nez v1, :cond_0 */
/* .line 3 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v0 */
/* .line 4 */
} // :cond_0
try { // :try_start_1
(( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
int v1 = 0; // const/4 v1, 0x0
v2 = e.f.a.b.c.p.m.a;
(( android.content.Context ) p0 ).registerReceiver ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
if ( p0 != null) { // if-eqz p0, :cond_1
final String v1 = "level"; // const-string v1, "level"
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v1 = (( android.content.Intent ) p0 ).getIntExtra ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
final String v3 = "scale"; // const-string v3, "scale"
/* .line 6 */
p0 = (( android.content.Intent ) p0 ).getIntExtra ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
/* int-to-float v1, v1 */
/* int-to-float p0, p0 */
/* div-float/2addr v1, p0 */
/* .line 7 */
/* .line 8 */
} // :cond_1
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* sput-wide v1, Le/f/a/b/c/p/m;->b:J */
/* .line 9 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* throw p0 */
} // .end method
