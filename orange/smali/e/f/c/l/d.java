public class e.f.c.l.d {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.f.c.l.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static e.f.c.j.a.a a ( Object p0, Object p1 ) {
		 /* .locals 2 */
		 final String v0 = "clx"; // const-string v0, "clx"
		 /* .line 30 */
		 /* if-nez v0, :cond_0 */
		 /* .line 31 */
		 e.f.c.l.e.b .a ( );
		 final String v1 = "Could not register AnalyticsConnectorListener with Crashlytics origin."; // const-string v1, "Could not register AnalyticsConnectorListener with Crashlytics origin."
		 /* .line 32 */
		 (( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
		 final String v0 = "crash"; // const-string v0, "crash"
		 /* .line 33 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 34 */
			 e.f.c.l.e.b .a ( );
			 final String p1 = "A new version of the Google Analytics for Firebase SDK is now available.For improved performance and compatibility with Crashlytics, please update to the latest version."; // const-string p1, "A new version of the Google Analytics for Firebase SDK is now available.For improved performance and compatibility with Crashlytics, please update to the latest version."
			 /* .line 35 */
			 (( e.f.c.l.e.b ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/b;->d(Ljava/lang/String;)V
		 } // :cond_0
	 } // .end method
	 public static e.f.c.l.d a ( Object p0, Object p1, Object p2, Object p3 ) {
		 /* .locals 16 */
		 /* move-object/from16 v8, p0 */
		 /* move-object/from16 v0, p3 */
		 /* .line 1 */
		 /* invoke-virtual/range {p0 ..p0}, Le/f/c/h;->b()Landroid/content/Context; */
		 /* .line 2 */
		 (( android.content.Context ) v9 ).getPackageName ( ); // invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 /* .line 3 */
		 /* new-instance v2, Le/f/c/l/e/m/q1; */
		 /* move-object/from16 v3, p1 */
		 /* invoke-direct {v2, v9, v1, v3}, Le/f/c/l/e/m/q1;-><init>(Landroid/content/Context;Ljava/lang/String;Le/f/c/s/k;)V */
		 /* .line 4 */
		 /* new-instance v4, Le/f/c/l/e/m/i1; */
		 /* invoke-direct {v4, v8}, Le/f/c/l/e/m/i1;-><init>(Le/f/c/h;)V */
		 /* if-nez p2, :cond_0 */
		 /* .line 5 */
		 /* new-instance v1, Le/f/c/l/e/e; */
		 /* invoke-direct {v1}, Le/f/c/l/e/e;-><init>()V */
		 /* move-object v3, v1 */
	 } // :cond_0
	 /* move-object/from16 v3, p2 */
	 /* .line 6 */
} // :goto_0
/* new-instance v11, Le/f/c/l/e/j; */
/* invoke-direct {v11, v8, v9, v2, v4}, Le/f/c/l/e/j;-><init>(Le/f/c/h;Landroid/content/Context;Le/f/c/l/e/m/q1;Le/f/c/l/e/m/i1;)V */
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 7 */
	 e.f.c.l.e.b .a ( );
	 final String v5 = "Firebase Analytics is available."; // const-string v5, "Firebase Analytics is available."
	 (( e.f.c.l.e.b ) v1 ).a ( v5 ); // invoke-virtual {v1, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
	 /* .line 8 */
	 /* new-instance v1, Le/f/c/l/e/k/e; */
	 /* invoke-direct {v1, v0}, Le/f/c/l/e/k/e;-><init>(Le/f/c/j/a/c;)V */
	 /* .line 9 */
	 /* new-instance v5, Le/f/c/l/a; */
	 /* invoke-direct {v5}, Le/f/c/l/a;-><init>()V */
	 /* .line 10 */
	 e.f.c.l.d .a ( v0,v5 );
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 11 */
		 e.f.c.l.e.b .a ( );
		 final String v6 = "Firebase Analytics listener registered successfully."; // const-string v6, "Firebase Analytics listener registered successfully."
		 (( e.f.c.l.e.b ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
		 /* .line 12 */
		 /* new-instance v0, Le/f/c/l/e/k/d; */
		 /* invoke-direct {v0}, Le/f/c/l/e/k/d;-><init>()V */
		 /* .line 13 */
		 /* new-instance v6, Le/f/c/l/e/k/c; */
		 /* const/16 v7, 0x1f4 */
		 v10 = java.util.concurrent.TimeUnit.MILLISECONDS;
		 /* invoke-direct {v6, v1, v7, v10}, Le/f/c/l/e/k/c;-><init>(Le/f/c/l/e/k/e;ILjava/util/concurrent/TimeUnit;)V */
		 /* .line 14 */
		 (( e.f.c.l.a ) v5 ).a ( v0 ); // invoke-virtual {v5, v0}, Le/f/c/l/a;->a(Le/f/c/l/e/k/b;)V
		 /* .line 15 */
		 (( e.f.c.l.a ) v5 ).b ( v6 ); // invoke-virtual {v5, v6}, Le/f/c/l/a;->b(Le/f/c/l/e/k/b;)V
		 /* move-object v1, v6 */
		 /* .line 16 */
	 } // :cond_1
	 e.f.c.l.e.b .a ( );
	 final String v5 = "Firebase Analytics listener registration failed."; // const-string v5, "Firebase Analytics listener registration failed."
	 (( e.f.c.l.e.b ) v0 ).a ( v5 ); // invoke-virtual {v0, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
	 /* .line 17 */
	 /* new-instance v0, Le/f/c/l/e/l/c; */
	 /* invoke-direct {v0}, Le/f/c/l/e/l/c;-><init>()V */
	 /* .line 18 */
} // :cond_2
e.f.c.l.e.b .a ( );
final String v1 = "Firebase Analytics is unavailable."; // const-string v1, "Firebase Analytics is unavailable."
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 19 */
/* new-instance v0, Le/f/c/l/e/l/c; */
/* invoke-direct {v0}, Le/f/c/l/e/l/c;-><init>()V */
/* .line 20 */
/* new-instance v1, Le/f/c/l/e/k/f; */
/* invoke-direct {v1}, Le/f/c/l/e/k/f;-><init>()V */
} // :goto_1
/* move-object v5, v0 */
/* move-object v6, v1 */
final String v0 = "Crashlytics Exception Handler"; // const-string v0, "Crashlytics Exception Handler"
/* .line 21 */
e.f.c.l.e.m.o1 .a ( v0 );
/* .line 22 */
/* new-instance v15, Le/f/c/l/e/m/b1; */
/* move-object v0, v15 */
/* move-object/from16 v1, p0 */
/* invoke-direct/range {v0 ..v7}, Le/f/c/l/e/m/b1;-><init>(Le/f/c/h;Le/f/c/l/e/m/q1;Le/f/c/l/e/a;Le/f/c/l/e/m/i1;Le/f/c/l/e/l/b;Le/f/c/l/e/k/a;Ljava/util/concurrent/ExecutorService;)V */
/* .line 23 */
v0 = (( e.f.c.l.e.j ) v11 ).d ( ); // invoke-virtual {v11}, Le/f/c/l/e/j;->d()Z
/* if-nez v0, :cond_3 */
/* .line 24 */
e.f.c.l.e.b .a ( );
final String v1 = "Unable to start Crashlytics."; // const-string v1, "Unable to start Crashlytics."
(( e.f.c.l.e.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->b(Ljava/lang/String;)V
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
final String v0 = "com.google.firebase.crashlytics.startup"; // const-string v0, "com.google.firebase.crashlytics.startup"
/* .line 25 */
e.f.c.l.e.m.o1 .a ( v0 );
/* .line 26 */
(( e.f.c.l.e.j ) v11 ).a ( v9, v8, v0 ); // invoke-virtual {v11, v9, v8, v0}, Le/f/c/l/e/j;->a(Landroid/content/Context;Le/f/c/h;Ljava/util/concurrent/Executor;)Le/f/c/l/e/v/e;
/* .line 27 */
v14 = (( e.f.c.l.e.m.b1 ) v15 ).d ( v13 ); // invoke-virtual {v15, v13}, Le/f/c/l/e/m/b1;->d(Le/f/c/l/e/v/f;)Z
/* .line 28 */
/* new-instance v1, Le/f/c/l/c; */
/* move-object v10, v1 */
/* move-object v12, v0 */
/* move-object v2, v15 */
/* invoke-direct/range {v10 ..v15}, Le/f/c/l/c;-><init>(Le/f/c/l/e/j;Ljava/util/concurrent/ExecutorService;Le/f/c/l/e/v/e;ZLe/f/c/l/e/m/b1;)V */
e.f.a.b.h.n .a ( v0,v1 );
/* .line 29 */
/* new-instance v0, Le/f/c/l/d; */
/* invoke-direct {v0, v2}, Le/f/c/l/d;-><init>(Le/f/c/l/e/m/b1;)V */
} // .end method
