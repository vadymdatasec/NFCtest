public class e.f.a.b.c.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer a;
	 /* # direct methods */
	 public static e.f.a.b.c.f ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* .line 2 */
		 /* new-instance v0, Le/f/a/b/c/f; */
		 /* invoke-direct {v0}, Le/f/a/b/c/f;-><init>()V */
		 return;
	 } // .end method
	 public e.f.a.b.c.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .line 13 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "gcore_"; // const-string v1, "gcore_"
		 /* .line 14 */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 15 */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = "-"; // const-string v1, "-"
		 /* .line 16 */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 17 */
		 v2 = 		 android.text.TextUtils .isEmpty ( p1 );
		 /* if-nez v2, :cond_0 */
		 /* .line 18 */
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 19 */
	 } // :cond_0
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 if ( p0 != null) { // if-eqz p0, :cond_1
		 /* .line 20 */
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 21 */
	 } // :cond_1
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 if ( p0 != null) { // if-eqz p0, :cond_2
		 /* .line 22 */
		 try { // :try_start_0
			 e.f.a.b.c.q.b .b ( p0 );
			 /* .line 23 */
			 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 int v1 = 0; // const/4 v1, 0x0
			 (( e.f.a.b.c.q.a ) p1 ).b ( p0, v1 ); // invoke-virtual {p1, p0, v1}, Le/f/a/b/c/q/a;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
			 /* .line 24 */
			 /* iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I */
			 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 /* :try_end_0 */
			 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 25 */
			 /* :catch_0 */
		 } // :cond_2
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 (( e.f.a.b.c.f ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/a/b/c/f;->a(Landroid/content/Context;I)I
	 } // .end method
	 public Integer a ( android.content.Context p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 p2 = 		 e.f.a.b.c.h .a ( p1,p2 );
		 /* .line 3 */
		 p1 = 		 e.f.a.b.c.h .b ( p1,p2 );
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* const/16 p2, 0x12 */
		 } // :cond_0
	 } // .end method
	 public android.app.PendingIntent a ( android.content.Context p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 9 */
		 (( e.f.a.b.c.f ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Le/f/a/b/c/f;->a(Landroid/content/Context;IILjava/lang/String;)Landroid/app/PendingIntent;
	 } // .end method
	 public android.app.PendingIntent a ( android.content.Context p0, Integer p1, Integer p2, java.lang.String p3 ) {
		 /* .locals 0 */
		 /* .line 10 */
		 (( e.f.a.b.c.f ) p0 ).a ( p1, p2, p4 ); // invoke-virtual {p0, p1, p2, p4}, Le/f/a/b/c/f;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;
		 /* if-nez p2, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_0
	 /* const/high16 p4, 0x8000000 */
	 /* .line 11 */
	 android.app.PendingIntent .getActivity ( p1,p3,p2,p4 );
} // .end method
public android.content.Intent a ( android.content.Context p0, Integer p1, java.lang.String p2 ) {
	 /* .locals 2 */
	 int v0 = 1; // const/4 v0, 0x1
	 final String v1 = "com.google.android.gms"; // const-string v1, "com.google.android.gms"
	 /* if-eq p2, v0, :cond_1 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* if-eq p2, v0, :cond_1 */
	 int p1 = 3; // const/4 p1, 0x3
	 /* if-eq p2, p1, :cond_0 */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 4 */
} // :cond_0
e.f.a.b.c.m.l .a ( v1 );
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 5 */
p2 = e.f.a.b.c.p.e .c ( p1 );
if ( p2 != null) { // if-eqz p2, :cond_2
	 /* .line 6 */
	 e.f.a.b.c.m.l .a ( );
	 /* .line 7 */
} // :cond_2
e.f.a.b.c.f .a ( p1,p3 );
/* .line 8 */
e.f.a.b.c.m.l .a ( v1,p1 );
} // .end method
public java.lang.String a ( Integer p0 ) {
/* .locals 0 */
/* .line 12 */
e.f.a.b.c.h .a ( p1 );
} // .end method
public Boolean b ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = e.f.a.b.c.h .b ( p1 );
} // .end method
