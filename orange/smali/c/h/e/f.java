public abstract class c.h.e.f extends c.h.f.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static c.h.e.d d;
	 /* # direct methods */
	 public static void a ( android.app.Activity p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* const/16 v1, 0x10 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 2 */
		 (( android.app.Activity ) p0 ).finishAffinity ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
		 /* .line 3 */
	 } // :cond_0
	 (( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
} // :goto_0
return;
} // .end method
public static void a ( android.app.Activity p0, java.lang.String[] p1, Integer p2 ) {
/* .locals 3 */
/* .line 4 */
v0 = c.h.e.f.d;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = 	 /* .line 5 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 return;
		 /* .line 6 */
	 } // :cond_0
	 /* array-length v0, p1 */
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* aget-object v2, p1, v1 */
/* .line 7 */
v2 = android.text.TextUtils .isEmpty ( v2 );
/* if-nez v2, :cond_1 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 8 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Permission request for permissions "; // const-string v0, "Permission request for permissions "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 9 */
java.util.Arrays .toString ( p1 );
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " must not contain null or empty values"; // const-string p1, " must not contain null or empty values"
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 10 */
} // :cond_2
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_4 */
/* .line 11 */
/* instance-of v0, p0, Lc/h/e/e; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 12 */
/* move-object v0, p0 */
/* check-cast v0, Lc/h/e/e; */
/* .line 13 */
/* .line 14 */
} // :cond_3
(( android.app.Activity ) p0 ).requestPermissions ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V
/* .line 15 */
} // :cond_4
/* instance-of v0, p0, Lc/h/e/c; */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 16 */
/* new-instance v0, Landroid/os/Handler; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
/* .line 17 */
/* new-instance v1, Lc/h/e/a; */
/* invoke-direct {v1, p1, p0, p2}, Lc/h/e/a;-><init>([Ljava/lang/String;Landroid/app/Activity;I)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // :cond_5
} // :goto_1
return;
} // .end method
public static Boolean a ( android.app.Activity p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 18 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 19 */
p0 = (( android.app.Activity ) p0 ).shouldShowRequestPermissionRationale ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static void b ( android.app.Activity p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.app.Activity ) p0 ).recreate ( ); // invoke-virtual {p0}, Landroid/app/Activity;->recreate()V
} // :cond_0
/* const/16 v1, 0x17 */
/* if-gt v0, v1, :cond_1 */
/* .line 3 */
/* new-instance v0, Landroid/os/Handler; */
(( android.app.Activity ) p0 ).getMainLooper ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getMainLooper()Landroid/os/Looper;
/* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
/* .line 4 */
/* new-instance v1, Lc/h/e/b; */
/* invoke-direct {v1, p0}, Lc/h/e/b;-><init>(Landroid/app/Activity;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 5 */
} // :cond_1
v0 = c.h.e.k .a ( p0 );
/* if-nez v0, :cond_2 */
/* .line 6 */
(( android.app.Activity ) p0 ).recreate ( ); // invoke-virtual {p0}, Landroid/app/Activity;->recreate()V
} // :cond_2
} // :goto_0
return;
} // .end method
