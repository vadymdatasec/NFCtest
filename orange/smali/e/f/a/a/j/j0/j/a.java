public class e.f.a.a.j.j0.j.a implements e.f.a.a.j.j0.j.y {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final e.f.a.a.j.j0.k.e b;
	 public android.app.AlarmManager c;
	 public final e.f.a.a.j.j0.j.m d;
	 public final e.f.a.a.j.l0.a e;
	 /* # direct methods */
	 public e.f.a.a.j.j0.j.a ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 4 */
		 this.a = p1;
		 /* .line 5 */
		 this.b = p2;
		 /* .line 6 */
		 this.c = p3;
		 /* .line 7 */
		 this.e = p4;
		 /* .line 8 */
		 this.d = p5;
		 return;
	 } // .end method
	 public e.f.a.a.j.j0.j.a ( ) {
		 /* .locals 7 */
		 final String v0 = "alarm"; // const-string v0, "alarm"
		 /* .line 1 */
		 (( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* move-object v4, v0 */
		 /* check-cast v4, Landroid/app/AlarmManager; */
		 /* move-object v1, p0 */
		 /* move-object v2, p1 */
		 /* move-object v3, p2 */
		 /* move-object v5, p3 */
		 /* move-object v6, p4 */
		 /* .line 2 */
		 /* invoke-direct/range {v1 ..v6}, Le/f/a/a/j/j0/j/a;-><init>(Landroid/content/Context;Le/f/a/a/j/j0/k/e;Landroid/app/AlarmManager;Le/f/a/a/j/l0/a;Le/f/a/a/j/j0/j/m;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, Integer p1 ) {
		 /* .locals 9 */
		 /* .line 2 */
		 /* new-instance v0, Landroid/net/Uri$Builder; */
		 /* invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V */
		 /* .line 3 */
		 (( e.f.a.a.j.x ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->a()Ljava/lang/String;
		 final String v2 = "backendName"; // const-string v2, "backendName"
		 (( android.net.Uri$Builder ) v0 ).appendQueryParameter ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
		 /* .line 4 */
		 (( e.f.a.a.j.x ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
		 v1 = 		 e.f.a.a.j.m0.a .a ( v1 );
		 java.lang.String .valueOf ( v1 );
		 final String v2 = "priority"; // const-string v2, "priority"
		 /* .line 5 */
		 (( android.net.Uri$Builder ) v0 ).appendQueryParameter ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
		 /* .line 6 */
		 (( e.f.a.a.j.x ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->b()[B
		 int v2 = 0; // const/4 v2, 0x0
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 7 */
			 (( e.f.a.a.j.x ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->b()[B
			 android.util.Base64 .encodeToString ( v1,v2 );
			 final String v3 = "extras"; // const-string v3, "extras"
			 /* .line 8 */
			 (( android.net.Uri$Builder ) v0 ).appendQueryParameter ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
			 /* .line 9 */
		 } // :cond_0
		 /* new-instance v1, Landroid/content/Intent; */
		 v3 = this.a;
		 /* const-class v4, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver; */
		 /* invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 /* .line 10 */
		 (( android.net.Uri$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
		 (( android.content.Intent ) v1 ).setData ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
		 final String v0 = "attemptNumber"; // const-string v0, "attemptNumber"
		 /* .line 11 */
		 (( android.content.Intent ) v1 ).putExtra ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
		 /* .line 12 */
		 v0 = 		 (( e.f.a.a.j.j0.j.a ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/a/a/j/j0/j/a;->a(Landroid/content/Intent;)Z
		 final String v3 = "AlarmManagerScheduler"; // const-string v3, "AlarmManagerScheduler"
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 final String p2 = "Upload for context %s is already scheduled.Returning..."; // const-string p2, "Upload for context %s is already scheduled.Returning..."
			 /* .line 13 */
			 e.f.a.a.j.h0.a .a ( v3,p2,p1 );
			 return;
			 /* .line 14 */
		 } // :cond_1
		 v0 = this.b;
		 /* move-result-wide v4 */
		 /* .line 15 */
		 v0 = this.d;
		 /* .line 16 */
		 (( e.f.a.a.j.x ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
		 (( e.f.a.a.j.j0.j.m ) v0 ).a ( v6, v4, v5, p2 ); // invoke-virtual {v0, v6, v4, v5, p2}, Le/f/a/a/j/j0/j/m;->a(Le/f/a/a/d;JI)J
		 /* move-result-wide v6 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* aput-object p1, v0, v2 */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 17 */
		 java.lang.Long .valueOf ( v6,v7 );
		 /* aput-object v8, v0, p1 */
		 int p1 = 2; // const/4 p1, 0x2
		 /* .line 18 */
		 java.lang.Long .valueOf ( v4,v5 );
		 /* aput-object v4, v0, p1 */
		 /* .line 19 */
		 java.lang.Integer .valueOf ( p2 );
		 int p2 = 3; // const/4 p2, 0x3
		 /* aput-object p1, v0, p2 */
		 final String p1 = "Scheduling upload for context %s in %dms(Backend next call timestamp %d).Attempt %d"; // const-string p1, "Scheduling upload for context %s in %dms(Backend next call timestamp %d).Attempt %d"
		 /* .line 20 */
		 e.f.a.a.j.h0.a .a ( v3,p1,v0 );
		 /* .line 21 */
		 p1 = this.a;
		 android.app.PendingIntent .getBroadcast ( p1,v2,v1,v2 );
		 /* .line 22 */
		 v0 = this.c;
		 v1 = this.e;
		 /* .line 23 */
		 /* move-result-wide v1 */
		 /* add-long/2addr v1, v6 */
		 /* .line 24 */
		 (( android.app.AlarmManager ) v0 ).set ( p2, v1, v2, p1 ); // invoke-virtual {v0, p2, v1, v2, p1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
		 return;
	 } // .end method
	 public Boolean a ( android.content.Intent p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/high16 v2, 0x20000000 */
		 android.app.PendingIntent .getBroadcast ( v0,v1,p1,v2 );
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int v1 = 1; // const/4 v1, 0x1
		 } // :cond_0
	 } // .end method
