public class inal {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* # instance fields */
public final android.content.Context a;
/* # direct methods */
public inal ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.a = p1;
	 return;
} // .end method
public static e.b.a.a0.c a ( java.lang.String p0 ) {
	 /* .locals 3 */
	 /* .line 4 */
	 try { // :try_start_0
		 java.lang.Class .forName ( p0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_4 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 try { // :try_start_1
			 /* new-array v2, v0, [Ljava/lang/Class; */
			 /* .line 5 */
			 (( java.lang.Class ) p0 ).getDeclaredConstructor ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
			 /* new-array v0, v0, [Ljava/lang/Object; */
			 (( java.lang.reflect.Constructor ) v2 ).newInstance ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_1 */
			 /* .catch Ljava/lang/InstantiationException; {:try_start_1 ..:try_end_1} :catch_3 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_2 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* .line 6 */
			 /* new-instance v0, Ljava/lang/RuntimeException; */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = "Expected instanceof GlideModule, but found: "; // const-string v2, "Expected instanceof GlideModule, but found: "
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
			 /* throw v0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 7 */
			 e.b.a.a0.e .a ( p0,v0 );
			 /* throw v1 */
			 /* :catch_1 */
			 /* move-exception v0 */
			 /* .line 8 */
			 e.b.a.a0.e .a ( p0,v0 );
			 /* throw v1 */
			 /* :catch_2 */
			 /* move-exception v0 */
			 /* .line 9 */
			 e.b.a.a0.e .a ( p0,v0 );
			 /* throw v1 */
			 /* :catch_3 */
			 /* move-exception v0 */
			 /* .line 10 */
			 e.b.a.a0.e .a ( p0,v0 );
			 /* throw v1 */
			 /* :catch_4 */
			 /* move-exception p0 */
			 /* .line 11 */
			 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
			 final String v1 = "Unable to find GlideModule implementation"; // const-string v1, "Unable to find GlideModule implementation"
			 /* invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
			 /* throw v0 */
		 } // .end method
		 public static void a ( java.lang.Class p0, java.lang.Exception p1 ) {
			 /* .locals 3 */
			 /* .annotation system Ldalvik/annotation/Signature; */
			 /* value = { */
			 /* "(", */
			 /* "Ljava/lang/Class<", */
			 /* "*>;", */
			 /* "Ljava/lang/Exception;", */
			 /* ")V" */
			 /* } */
		 } // .end annotation
		 /* .line 12 */
		 /* new-instance v0, Ljava/lang/RuntimeException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Unable to instantiate GlideModule implementation for "; // const-string v2, "Unable to instantiate GlideModule implementation for "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw v0 */
	 } // .end method
	 /* # virtual methods */
	 public final android.content.pm.ApplicationInfo a ( ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/content/pm/PackageManager$NameNotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.a;
	 /* .line 2 */
	 (( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 v1 = this.a;
	 /* .line 3 */
	 (( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 /* const/16 v2, 0x80 */
	 (( android.content.pm.PackageManager ) v0 ).getApplicationInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
} // .end method
public java.util.List b ( ) {
	 /* .locals 8 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()", */
	 /* "Ljava/util/List<", */
	 /* "Le/b/a/a0/c;", */
	 /* ">;" */
	 /* } */
} // .end annotation
int v0 = 3; // const/4 v0, 0x3
final String v1 = "ManifestParser"; // const-string v1, "ManifestParser"
/* .line 1 */
v2 = android.util.Log .isLoggable ( v1,v0 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 final String v2 = "Loading Glide modules"; // const-string v2, "Loading Glide modules"
	 /* .line 2 */
	 android.util.Log .d ( v1,v2 );
	 /* .line 3 */
} // :cond_0
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 4 */
try { // :try_start_0
	 (( e.b.a.a0.e ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/a0/e;->a()Landroid/content/pm/ApplicationInfo;
	 if ( v3 != null) { // if-eqz v3, :cond_6
		 /* .line 5 */
		 v4 = this.metaData;
		 /* if-nez v4, :cond_1 */
	 } // :cond_1
	 int v4 = 2; // const/4 v4, 0x2
	 /* .line 6 */
	 v4 = 	 android.util.Log .isLoggable ( v1,v4 );
	 if ( v4 != null) { // if-eqz v4, :cond_2
		 /* .line 7 */
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v5 = "Got app info metadata: "; // const-string v5, "Got app info metadata: "
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v5 = this.metaData;
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .v ( v1,v4 );
		 /* .line 8 */
	 } // :cond_2
	 v4 = this.metaData;
	 (( android.os.Bundle ) v4 ).keySet ( ); // invoke-virtual {v4}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_4
	 /* check-cast v5, Ljava/lang/String; */
	 final String v6 = "GlideModule"; // const-string v6, "GlideModule"
	 /* .line 9 */
	 v7 = this.metaData;
	 (( android.os.Bundle ) v7 ).get ( v5 ); // invoke-virtual {v7, v5}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
	 v6 = 	 (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v6, :cond_3 */
	 /* .line 10 */
} // :cond_3
e.b.a.a0.e .a ( v5 );
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
int v0 = 0; // const/4 v0, 0x0
/* throw v0 */
/* .line 11 */
} // :cond_4
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_5
final String v0 = "Finished loading Glide modules"; // const-string v0, "Finished loading Glide modules"
/* .line 12 */
android.util.Log .d ( v1,v0 );
} // :cond_5
/* .line 13 */
} // :cond_6
} // :goto_1
try { // :try_start_1
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_7
final String v0 = "Got null app info metadata"; // const-string v0, "Got null app info metadata"
/* .line 14 */
android.util.Log .d ( v1,v0 );
/* :try_end_1 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
} // :cond_7
/* :catch_0 */
/* move-exception v0 */
/* .line 15 */
/* new-instance v1, Ljava/lang/RuntimeException; */
final String v2 = "Unable to find metadata to parse GlideModules"; // const-string v2, "Unable to find metadata to parse GlideModules"
/* invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
