public class e.f.a.b.c.o.d {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.f.a.b.c.o.d a;
	 public static java.lang.Boolean b;
	 /* # direct methods */
	 public static e.f.a.b.c.o.d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/a/b/c/o/d; */
		 /* invoke-direct {v0}, Le/f/a/b/c/o/d;-><init>()V */
		 return;
	 } // .end method
	 public e.f.a.b.c.o.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static e.f.a.b.c.o.d a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.a.b.c.o.d.a;
	 } // .end method
	 public static void a ( android.content.Context p0, com.google.android.gms.common.stats.WakeLockEvent p1 ) {
		 /* .locals 2 */
		 /* .line 14 */
		 try { // :try_start_0
			 /* new-instance v0, Landroid/content/Intent; */
			 /* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
			 v1 = e.f.a.b.c.o.b.a;
			 /* .line 15 */
			 (( android.content.Intent ) v0 ).setComponent ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
			 final String v1 = "com.google.android.gms.common.stats.EXTRA_LOG_EVENT"; // const-string v1, "com.google.android.gms.common.stats.EXTRA_LOG_EVENT"
			 /* .line 16 */
			 (( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
			 /* .line 17 */
			 (( android.content.Context ) p0 ).startService ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 return;
			 /* :catch_0 */
			 /* move-exception p0 */
			 final String p1 = "WakeLockTracker"; // const-string p1, "WakeLockTracker"
			 /* .line 18 */
			 android.util.Log .wtf ( p1,p0 );
			 return;
		 } // .end method
		 public static Boolean b ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = e.f.a.b.c.o.d.b;
			 /* if-nez v0, :cond_0 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 2 */
			 java.lang.Boolean .valueOf ( v0 );
			 /* .line 3 */
		 } // :cond_0
		 v0 = e.f.a.b.c.o.d.b;
		 v0 = 		 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.content.Context p0, java.lang.String p1, Integer p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, Integer p6, java.util.List p7 ) {
		 /* .locals 11 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/content/Context;", */
		 /* "Ljava/lang/String;", */
		 /* "I", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* "I", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/lang/String;", */
		 /* ">;)V" */
		 /* } */
	 } // .end annotation
	 /* const-wide/16 v9, 0x0 */
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move v3, p3 */
	 /* move-object v4, p4 */
	 /* move-object/from16 v5, p5 */
	 /* move-object/from16 v6, p6 */
	 /* move/from16 v7, p7 */
	 /* move-object/from16 v8, p8 */
	 /* .line 2 */
	 /* invoke-virtual/range {v0 ..v10}, Le/f/a/b/c/o/d;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;J)V */
	 return;
} // .end method
public void a ( android.content.Context p0, java.lang.String p1, Integer p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, Integer p6, java.util.List p7, Long p8 ) {
	 /* .locals 19 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/content/Context;", */
	 /* "Ljava/lang/String;", */
	 /* "I", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* "I", */
	 /* "Ljava/util/List<", */
	 /* "Ljava/lang/String;", */
	 /* ">;J)V" */
	 /* } */
} // .end annotation
/* move/from16 v3, p3 */
/* .line 3 */
v0 = e.f.a.b.c.o.d .b ( );
/* if-nez v0, :cond_0 */
return;
/* .line 4 */
} // :cond_0
v0 = /* invoke-static/range {p2 ..p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z */
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = "missing wakeLock key."; // const-string v0, "missing wakeLock key."
/* .line 5 */
/* invoke-static/range {p2 ..p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String; */
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
if ( v2 != null) { // if-eqz v2, :cond_1
	 (( java.lang.String ) v0 ).concat ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_1
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object v0, v1 */
} // :goto_0
final String v1 = "WakeLockTracker"; // const-string v1, "WakeLockTracker"
android.util.Log .e ( v1,v0 );
return;
} // :cond_2
int v0 = 7; // const/4 v0, 0x7
/* if-eq v0, v3, :cond_3 */
/* const/16 v0, 0x8 */
/* if-eq v0, v3, :cond_3 */
/* const/16 v0, 0xa */
/* if-eq v0, v3, :cond_3 */
/* const/16 v0, 0xb */
/* if-ne v0, v3, :cond_4 */
/* .line 6 */
} // :cond_3
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* .line 7 */
/* new-instance v14, Lcom/google/android/gms/common/stats/WakeLockEvent; */
/* move-object v0, v14 */
/* .line 8 */
/* invoke-static/range {p8 ..p8}, Le/f/a/b/c/o/c;->a(Ljava/util/List;)Ljava/util/List; */
/* .line 9 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v8 */
/* .line 10 */
v10 = /* invoke-static/range {p1 ..p1}, Le/f/a/b/c/p/m;->a(Landroid/content/Context;)I */
/* .line 11 */
/* invoke-virtual/range {p1 ..p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String; */
e.f.a.b.c.o.c .a ( v4 );
/* .line 12 */
v13 = /* invoke-static/range {p1 ..p1}, Le/f/a/b/c/p/m;->b(Landroid/content/Context;)F */
/* const/16 v17, 0x0 */
/* move/from16 v3, p3 */
/* move-object/from16 v4, p4 */
/* move/from16 v5, p7 */
/* move-object/from16 v7, p2 */
/* move-object/from16 v11, p5 */
/* move-object/from16 v18, v14 */
/* move-wide/from16 v14, p9 */
/* move-object/from16 v16, p6 */
/* invoke-direct/range {v0 ..v17}, Lcom/google/android/gms/common/stats/WakeLockEvent;-><init>(JILjava/lang/String;ILjava/util/List;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;FJLjava/lang/String;Z)V */
/* move-object/from16 v0, p1 */
/* move-object/from16 v1, v18 */
/* .line 13 */
e.f.a.b.c.o.d .a ( v0,v1 );
} // :cond_4
return;
} // .end method
