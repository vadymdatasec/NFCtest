public abstract class c.h.f.f {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "PrivateConstructorForUtilityClass" */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.Object a;
public static final java.lang.Object b;
public static android.util.TypedValue c;
/* # direct methods */
public static c.h.f.f ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/Object; */
	 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 /* new-instance v0, Ljava/lang/Object; */
	 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static Integer a ( android.content.Context p0, Integer p1 ) {
	 /* .locals 2 */
	 /* .line 4 */
	 /* const/16 v1, 0x17 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 5 */
	 p0 = 	 c.h.f.d .a ( p0,p1 );
	 /* .line 6 */
} // :cond_0
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
p0 = (( android.content.res.Resources ) p0 ).getColor ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColor(I)I
} // .end method
public static Integer a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
final String v0 = "permission must be non-null"; // const-string v0, "permission must be non-null"
/* .line 7 */
c.h.m.c .a ( p1,v0 );
/* .line 8 */
v0 = android.os.Process .myPid ( );
v1 = android.os.Process .myUid ( );
p0 = (( android.content.Context ) p0 ).checkPermission ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I
} // .end method
public static android.content.Context a ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 16 */
/* const/16 v1, 0x18 */
/* if-lt v0, v1, :cond_0 */
/* .line 17 */
c.h.f.e .a ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.io.File a ( java.io.File p0 ) {
/* .locals 4 */
/* .line 9 */
v0 = c.h.f.f.b;
/* monitor-enter v0 */
/* .line 10 */
try { // :try_start_0
v1 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_1 */
/* .line 11 */
v1 = (( java.io.File ) p0 ).mkdirs ( ); // invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 12 */
	 /* monitor-exit v0 */
} // :cond_0
final String v1 = "ContextCompat"; // const-string v1, "ContextCompat"
/* .line 13 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unable to create files subdir "; // const-string v3, "Unable to create files subdir "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) p0 ).getPath ( ); // invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v1,v2 );
/* .line 14 */
} // :cond_1
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 15 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static Boolean a ( android.content.Context p0, android.content.Intent[] p1, android.os.Bundle p2 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.f.a .a ( p0,p1,p2 );
/* .line 3 */
} // :cond_0
(( android.content.Context ) p0 ).startActivities ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->startActivities([Landroid/content/Intent;)V
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static android.content.res.ColorStateList b ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
/* .line 7 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.Context ) p0 ).getTheme ( ); // invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
c.h.f.i.s .b ( v0,p1,p0 );
} // .end method
public static java.io.File b ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 4 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 5 */
c.h.f.b .a ( p0 );
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/io/File; */
int v1 = 0; // const/4 v1, 0x0
/* .line 6 */
(( android.content.Context ) p0 ).getExternalCacheDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;
/* aput-object p0, v0, v1 */
} // .end method
public static java.io.File b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.f.b .a ( p0,p1 );
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/io/File; */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
(( android.content.Context ) p0 ).getExternalFilesDir ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;
/* aput-object p0, v0, v1 */
} // .end method
public static android.graphics.drawable.Drawable c ( android.content.Context p0, Integer p1 ) {
/* .locals 4 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.f.c .a ( p0,p1 );
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 3 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p0 ).getDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* .line 4 */
} // :cond_1
v0 = c.h.f.f.a;
/* monitor-enter v0 */
/* .line 5 */
try { // :try_start_0
v1 = c.h.f.f.c;
/* if-nez v1, :cond_2 */
/* .line 6 */
/* new-instance v1, Landroid/util/TypedValue; */
/* invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V */
/* .line 7 */
} // :cond_2
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v2 = c.h.f.f.c;
int v3 = 1; // const/4 v3, 0x1
(( android.content.res.Resources ) v1 ).getValue ( p1, v2, v3 ); // invoke-virtual {v1, p1, v2, v3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V
/* .line 8 */
p1 = c.h.f.f.c;
/* iget p1, p1, Landroid/util/TypedValue;->resourceId:I */
/* .line 9 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 10 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p0 ).getDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* :catchall_0 */
/* move-exception p0 */
/* .line 11 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p0 */
} // .end method
public static java.io.File c ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 12 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 13 */
c.h.f.c .b ( p0 );
/* .line 14 */
} // :cond_0
(( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* .line 15 */
/* new-instance v0, Ljava/io/File; */
p0 = this.dataDir;
final String v1 = "no_backup"; // const-string v1, "no_backup"
/* invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
c.h.f.f .a ( v0 );
} // .end method
