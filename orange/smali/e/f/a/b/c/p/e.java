public abstract class e.f.a.b.c.p.e {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.Boolean a;
	 public static java.lang.Boolean b;
	 public static java.lang.Boolean c;
	 /* # direct methods */
	 public static Boolean a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .annotation build Landroid/annotation/TargetApi; */
		 /* value = 0x15 */
	 } // .end annotation
	 /* .line 1 */
	 v0 = e.f.a.b.c.p.e.b;
	 /* if-nez v0, :cond_1 */
	 /* .line 2 */
	 v0 = 	 e.f.a.b.c.p.h .f ( );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
		 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 final String v0 = "cn.google"; // const-string v0, "cn.google"
		 p0 = 		 (( android.content.pm.PackageManager ) p0 ).hasSystemFeature ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 int p0 = 1; // const/4 p0, 0x1
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 4 */
	 } // :goto_0
	 java.lang.Boolean .valueOf ( p0 );
	 /* .line 5 */
} // :cond_1
p0 = e.f.a.b.c.p.e.b;
p0 = (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
} // .end method
public static Boolean b ( android.content.Context p0 ) {
/* .locals 1 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x14 */
} // .end annotation
/* .line 1 */
v0 = e.f.a.b.c.p.e.a;
/* if-nez v0, :cond_1 */
/* .line 2 */
v0 = e.f.a.b.c.p.h .e ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
final String v0 = "android.hardware.type.watch"; // const-string v0, "android.hardware.type.watch"
p0 = (( android.content.pm.PackageManager ) p0 ).hasSystemFeature ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
	 int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 4 */
} // :goto_0
java.lang.Boolean .valueOf ( p0 );
/* .line 5 */
} // :cond_1
p0 = e.f.a.b.c.p.e.a;
p0 = (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
} // .end method
public static Boolean c ( android.content.Context p0 ) {
/* .locals 1 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1a */
} // .end annotation
/* .line 1 */
v0 = e.f.a.b.c.p.e .b ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = e.f.a.b.c.p.h .g ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
p0 = e.f.a.b.c.p.e .a ( p0 );
if ( p0 != null) { // if-eqz p0, :cond_1
p0 = e.f.a.b.c.p.h .h ( );
/* if-nez p0, :cond_1 */
} // :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean d ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = e.f.a.b.c.p.e.c;
/* if-nez v0, :cond_2 */
/* .line 2 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
final String v1 = "android.hardware.type.iot"; // const-string v1, "android.hardware.type.iot"
v0 = (( android.content.pm.PackageManager ) v0 ).hasSystemFeature ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
/* if-nez v0, :cond_1 */
/* .line 3 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
final String v0 = "android.hardware.type.embedded"; // const-string v0, "android.hardware.type.embedded"
p0 = (( android.content.pm.PackageManager ) p0 ).hasSystemFeature ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
/* .line 4 */
} // :goto_1
java.lang.Boolean .valueOf ( p0 );
/* .line 5 */
} // :cond_2
p0 = e.f.a.b.c.p.e.c;
p0 = (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
} // .end method
