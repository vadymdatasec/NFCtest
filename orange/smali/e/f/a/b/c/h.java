public abstract class e.f.a.b.c.h {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer a;
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
} // .end field
public static final java.util.concurrent.atomic.AtomicBoolean b;
public static final java.util.concurrent.atomic.AtomicBoolean c;
/* # direct methods */
public static e.f.a.b.c.h ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V */
return;
} // .end method
public static Integer a ( android.content.Context p0, Integer p1 ) {
/* .locals 3 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 2 */
try { // :try_start_0
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 3 */
(( android.content.res.Resources ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
final String v0 = "GooglePlayServicesUtil"; // const-string v0, "GooglePlayServicesUtil"
final String v1 = "The Google Play services resources were not found.Check your project configuration to ensure that the resources are included."; // const-string v1, "The Google Play services resources were not found.Check your project configuration to ensure that the resources are included."
/* .line 4 */
android.util.Log .e ( v0,v1 );
/* .line 5 */
} // :goto_0
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String v1 = "com.google.android.gms"; // const-string v1, "com.google.android.gms"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_2 */
/* .line 6 */
v0 = e.f.a.b.c.h.c;
v0 = (( java.util.concurrent.atomic.AtomicBoolean ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
/* if-nez v0, :cond_2 */
/* .line 7 */
v0 = e.f.a.b.c.m.o .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
/* if-ne v0, v1, :cond_0 */
/* .line 9 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalStateException; */
/* const/16 v1, 0x140 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "The meta-data tag in your app\'s AndroidManifest.xml does not have the right value.Expected "; // const-string v1, "The meta-data tag in your app\'s AndroidManifest.xml does not have the right value.Expected "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " but found "; // const-string p1, " but found "
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = ".You must have the following declaration within the <application> element: <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"; // const-string p1, ".You must have the following declaration within the <application> element: <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 10 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalStateException; */
final String p1 = "A required meta-data tag in your app\'s AndroidManifest.xml does not exist.You must have the following declaration within the <application> element: <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"; // const-string p1, "A required meta-data tag in your app\'s AndroidManifest.xml does not exist.You must have the following declaration within the <application> element: <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 11 */
} // :cond_2
} // :goto_1
v0 = e.f.a.b.c.p.e .c ( p0 );
/* if-nez v0, :cond_3 */
v0 = e.f.a.b.c.p.e .d ( p0 );
/* if-nez v0, :cond_3 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* .line 12 */
} // :goto_2
p0 = e.f.a.b.c.h .a ( p0,v0,p1 );
} // .end method
public static Integer a ( android.content.Context p0, Boolean p1, Integer p2 ) {
/* .locals 8 */
final String v0 = "com.google.android.gms"; // const-string v0, "com.google.android.gms"
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-ltz p2, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
/* .line 13 */
} // :goto_0
e.f.a.b.c.m.h .a ( v3 );
/* .line 14 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
int v4 = 0; // const/4 v4, 0x0
/* const/16 v5, 0x9 */
final String v6 = "GooglePlayServicesUtil"; // const-string v6, "GooglePlayServicesUtil"
if ( p1 != null) { // if-eqz p1, :cond_1
try { // :try_start_0
final String v4 = "com.android.vending"; // const-string v4, "com.android.vending"
/* const/16 v7, 0x2040 */
/* .line 15 */
(( android.content.pm.PackageManager ) v3 ).getPackageInfo ( v4, v7 ); // invoke-virtual {v3, v4, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String p0 = "Google Play Store is missing."; // const-string p0, "Google Play Store is missing."
/* .line 16 */
android.util.Log .w ( v6,p0 );
} // :cond_1
} // :goto_1
/* const/16 v7, 0x40 */
/* .line 17 */
try { // :try_start_1
(( android.content.pm.PackageManager ) v3 ).getPackageInfo ( v0, v7 ); // invoke-virtual {v3, v0, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_1 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 18 */
e.f.a.b.c.i .a ( p0 );
/* .line 19 */
p0 = e.f.a.b.c.i .a ( v7,v1 );
/* if-nez p0, :cond_2 */
final String p0 = "Google Play services signature invalid."; // const-string p0, "Google Play services signature invalid."
/* .line 20 */
android.util.Log .w ( v6,p0 );
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 21 */
p0 = e.f.a.b.c.i .a ( v4,v1 );
if ( p0 != null) { // if-eqz p0, :cond_3
p0 = this.signatures;
/* aget-object p0, p0, v2 */
p1 = this.signatures;
/* aget-object p1, p1, v2 */
/* .line 22 */
p0 = (( android.content.pm.Signature ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/pm/Signature;->equals(Ljava/lang/Object;)Z
/* if-nez p0, :cond_4 */
} // :cond_3
final String p0 = "Google Play Store signature invalid."; // const-string p0, "Google Play Store signature invalid."
/* .line 23 */
android.util.Log .w ( v6,p0 );
/* .line 24 */
} // :cond_4
/* iget p0, v7, Landroid/content/pm/PackageInfo;->versionCode:I */
p0 = e.f.a.b.c.p.n .a ( p0 );
/* .line 25 */
p1 = e.f.a.b.c.p.n .a ( p2 );
/* if-ge p0, p1, :cond_5 */
/* .line 26 */
/* iget p0, v7, Landroid/content/pm/PackageInfo;->versionCode:I */
/* const/16 p1, 0x4d */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p1 = "Google Play services out of date.Requires "; // const-string p1, "Google Play services out of date.Requires "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " but found "; // const-string p1, " but found "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v6,p0 );
int p0 = 2; // const/4 p0, 0x2
/* .line 27 */
} // :cond_5
p0 = this.applicationInfo;
/* if-nez p0, :cond_6 */
/* .line 28 */
try { // :try_start_2
(( android.content.pm.PackageManager ) v3 ).getApplicationInfo ( v0, v2 ); // invoke-virtual {v3, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
/* :try_end_2 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 ..:try_end_2} :catch_1 */
/* :catch_1 */
/* move-exception p0 */
final String p1 = "Google Play services missing when getting application info."; // const-string p1, "Google Play services missing when getting application info."
/* .line 29 */
android.util.Log .wtf ( v6,p1,p0 );
/* .line 30 */
} // :cond_6
} // :goto_2
/* iget-boolean p0, p0, Landroid/content/pm/ApplicationInfo;->enabled:Z */
/* if-nez p0, :cond_7 */
int p0 = 3; // const/4 p0, 0x3
} // :cond_7
/* :catch_2 */
final String p0 = "Google Play services is missing."; // const-string p0, "Google Play services is missing."
/* .line 31 */
android.util.Log .w ( v6,p0 );
} // .end method
public static android.content.res.Resources a ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 32 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
final String v0 = "com.google.android.gms"; // const-string v0, "com.google.android.gms"
/* .line 33 */
(( android.content.pm.PackageManager ) p0 ).getResourcesForApplication ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.String a ( Integer p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
e.f.a.b.c.a .a ( p0 );
} // .end method
public static Boolean a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 5 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x15 */
} // .end annotation
final String v0 = "com.google.android.gms"; // const-string v0, "com.google.android.gms"
/* .line 34 */
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 35 */
v1 = e.f.a.b.c.p.h .f ( );
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 36 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.pm.PackageManager ) v1 ).getPackageInstaller ( ); // invoke-virtual {v1}, Landroid/content/pm/PackageManager;->getPackageInstaller()Landroid/content/pm/PackageInstaller;
(( android.content.pm.PackageInstaller ) v1 ).getAllSessions ( ); // invoke-virtual {v1}, Landroid/content/pm/PackageInstaller;->getAllSessions()Ljava/util/List;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 37 */
v4 = } // :cond_0
if ( v4 != null) { // if-eqz v4, :cond_1
/* check-cast v4, Landroid/content/pm/PackageInstaller$SessionInfo; */
/* .line 38 */
(( android.content.pm.PackageInstaller$SessionInfo ) v4 ).getAppPackageName ( ); // invoke-virtual {v4}, Landroid/content/pm/PackageInstaller$SessionInfo;->getAppPackageName()Ljava/lang/String;
v4 = (( java.lang.String ) p1 ).equals ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* :catch_0 */
/* .line 39 */
} // :cond_1
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* const/16 v4, 0x2000 */
/* .line 40 */
try { // :try_start_1
(( android.content.pm.PackageManager ) v1 ).getApplicationInfo ( p1, v4 ); // invoke-virtual {v1, p1, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 41 */
/* iget-boolean p0, p1, Landroid/content/pm/ApplicationInfo;->enabled:Z */
/* .line 42 */
} // :cond_2
/* iget-boolean p1, p1, Landroid/content/pm/ApplicationInfo;->enabled:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
p0 = e.f.a.b.c.h .b ( p0 );
/* :try_end_1 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 ..:try_end_1} :catch_1 */
/* if-nez p0, :cond_3 */
/* :catch_1 */
} // :cond_3
} // .end method
public static Boolean b ( Integer p0 ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* if-eq p0, v0, :cond_0 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq p0, v1, :cond_0 */
int v1 = 3; // const/4 v1, 0x3
/* if-eq p0, v1, :cond_0 */
/* const/16 v1, 0x9 */
/* if-eq p0, v1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
} // .end method
public static Boolean b ( android.content.Context p0 ) {
/* .locals 1 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x12 */
} // .end annotation
/* .line 2 */
v0 = e.f.a.b.c.p.h .d ( );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "user"; // const-string v0, "user"
/* .line 3 */
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/os/UserManager; */
/* .line 4 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( android.os.UserManager ) v0 ).getApplicationRestrictions ( p0 ); // invoke-virtual {v0, p0}, Landroid/os/UserManager;->getApplicationRestrictions(Ljava/lang/String;)Landroid/os/Bundle;
if ( p0 != null) { // if-eqz p0, :cond_0
final String v0 = "restricted_profile"; // const-string v0, "restricted_profile"
/* .line 5 */
(( android.os.Bundle ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v0 = "true"; // const-string v0, "true"
p0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean b ( android.content.Context p0, Integer p1 ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* const/16 v1, 0x12 */
/* if-ne p1, v1, :cond_0 */
} // :cond_0
/* if-ne p1, v0, :cond_1 */
final String p1 = "com.google.android.gms"; // const-string p1, "com.google.android.gms"
/* .line 1 */
p0 = e.f.a.b.c.h .a ( p0,p1 );
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
